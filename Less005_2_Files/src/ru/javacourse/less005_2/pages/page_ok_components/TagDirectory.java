package ru.javacourse.less005_2.pages.page_ok_components;

import ru.javacourse.less005_2.server.Server;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 17.11.13
 * Time: 0:53
 * To change this template use File | Settings | File Templates.
 */
public class TagDirectory {

    private File f;

    public TagDirectory(File f) {
        this.f = f;
    }

    @Override
    public String toString() {
//        if (f.toString().length()<=3)
//            return "";
        StringBuilder sb = new StringBuilder();
        sb.append("<a href=\"http://"+ Server.serverName+"/");
        sb.append(f.toString());
        sb.append("/\">");
        sb.append("["+f.getName().toUpperCase()+"]");
        sb.append("</a>");
        sb.append("<br>");

        return sb.toString();
    }
}
