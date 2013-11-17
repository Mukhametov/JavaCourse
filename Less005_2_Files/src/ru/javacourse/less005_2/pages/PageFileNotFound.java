package ru.javacourse.less005_2.pages;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 17.11.13
 * Time: 14:17
 * To change this template use File | Settings | File Templates.
 */
public class PageFileNotFound {

    @Override
    public String toString() {
        String s = //"<html><title>test</title><body>Hello <b>world</b></body></html>";
                "HTTP/1.0 501 Not Implemented\r\n"+
//        "HTTP/1.0 200 OK\r\n"+
        "Content-Type: text/html\r\n"+
        "Content-Length: 0\r\n";


        return s;
    }
}
