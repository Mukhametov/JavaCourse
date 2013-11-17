package ru.javacourse.less005_2.pages.page_ok_components;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 17.11.13
 * Time: 0:57
 * To change this template use File | Settings | File Templates.
 */
public class TagFile {
    private java.io.File f;

    public TagFile(java.io.File f) {
        this.f = f;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<tr><td>");

        sb.append(f.getName().toLowerCase());
//        while (sb.length() < 30)
//            sb.append(" ");
        sb.append("</td><td>");

        if (f.length() > 1000000)
            sb.append(f.length()/1000000+" mb");
        else if (f.length() > 1000)
            sb.append(f.length()/1000+" kb");
        else sb.append(f.length()+" b");

        sb.append("</td><td>");


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
        sb.append("\t\t" + simpleDateFormat.format(new Date(f.lastModified())));
        sb.append("</td></tr>");
//        sb.append("<br>");

        return sb.toString();
    }
}
