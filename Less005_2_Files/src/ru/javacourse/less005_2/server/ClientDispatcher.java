package ru.javacourse.less005_2.server;

import ru.javacourse.less005_2.pages.PageCanNotReadFile;
import ru.javacourse.less005_2.pages.PageFileNotFound;
import ru.javacourse.less005_2.pages.PageOk;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.URLDecoder;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 17.11.13
 * Time: 12:23
 * To change this template use File | Settings | File Templates.
 */
public class ClientDispatcher implements Runnable {
    Socket socket;

    public ClientDispatcher(Socket socket) {
        this.socket = socket;
    }

    public String getQuery(String s){
        try {
            return URLDecoder.decode(s.substring(s.indexOf("/") + 1, s.indexOf("HTTP")).trim().replace("\\", "/"), "cp1251");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }

    @Override
    public void run() {
        Scanner scanner = null;
        PrintStream printStream = null;

        try {
            scanner = new Scanner(socket.getInputStream());
            printStream = new PrintStream(socket.getOutputStream(), true, "cp1251");

            File file = new File(getQuery(scanner.nextLine()));
            if (!file.exists() || !file.canRead()) {
                printStream.println(new PageFileNotFound().toString());
            } else {
                printStream.println(new PageOk(file).toString());
            }


        } catch (Exception e) {
             e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
            scanner.close();
            printStream.close();
        }

    }
}
