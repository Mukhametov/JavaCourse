package ru.javacourse.less005_2.pages;

import ru.javacourse.less005_2.pages.page_ok_components.Footer;
import ru.javacourse.less005_2.pages.page_ok_components.Header;
import ru.javacourse.less005_2.pages.page_ok_components.ParentHref;
import ru.javacourse.less005_2.pages.page_ok_components.TagDirectory;
import ru.javacourse.less005_2.pages.page_ok_components.TagFile;

import java.io.File;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 16.11.13
 * Time: 17:57
 * To change this template use File | Settings | File Templates.
 */
public class PageOk {
    File file;

    public PageOk(File file) {
        this.file = file;
    }

    public String getPageContent() {
        StringBuilder result = new StringBuilder();
        result.append(new Header().toString());
        result.append(new ParentHref(file).toString());

        Set<File> set = new TreeSet<File>(Arrays.asList(file.listFiles()));

        for (File f : set) {
            if (f.isDirectory()) {
                result.append(new TagDirectory(f).toString());
            }
        }

        result.append("<table width=\"60%\">");
        for (File f : set) {
            if (f.isFile()) {
                result.append(new TagFile(f).toString());
            }
        }
        result.append("</table>");
        result.append(new Footer().toString());
        return result.toString();
    }

    @Override
    public String toString() {
        String s = getPageContent();

        return "HTTP/1.0 200 OK\r\nContent-Type: text/html\r\nContent-Length: " + s.length() + "\r\n\r\n" + s;
    }
}