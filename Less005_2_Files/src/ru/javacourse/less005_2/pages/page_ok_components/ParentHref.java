package ru.javacourse.less005_2.pages.page_ok_components;

import ru.javacourse.less005_2.server.Server;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 17.11.13
 * Time: 12:58
 * To change this template use File | Settings | File Templates.
 */
public class ParentHref {
    private java.io.File f;

    public ParentHref(java.io.File f) {
        this.f = f;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("<a href=\"http://"+ Server.serverName+"/");
            sb.append(f.getParentFile().toString());
            sb.append("/\">");
            sb.append("[..]");
            sb.append("</a>");
            sb.append("<br>");
        } catch (RuntimeException e){
            return "";
        }
        return sb.toString();
    }
}
