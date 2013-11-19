package ru.javacourse.less005_2.pages;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 17.11.13
 * Time: 14:17
 * To change this template use File | Settings | File Templates.
 */
public class PageCanNotReadFile {

    @Override
    public String toString() {
        String s = getPageContent();

        return "HTTP/1.0 500 Can not read file\r\nContent-Type: text/html\r\nContent-Length: " + s.length() + "\r\n\r\n" + s;
    }

    private String getPageContent() {
        return "<html><title>Can not read file </title><body>Can not read file </body></html>";
    }
}
