package ru.javacourse.less005_2.pages.page_ok_components;

import ru.javacourse.less005_2.server.Server;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

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
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("context"));
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<a href=\"http://"+ properties.get("ServerName")+ ":" + properties.get("Port")+"/");
        sb.append(f.toString());
        sb.append("/\">");
        sb.append("["+f.getName().toUpperCase()+"]");
        sb.append("</a>");
        sb.append("<br>");

        return sb.toString();
    }
}
