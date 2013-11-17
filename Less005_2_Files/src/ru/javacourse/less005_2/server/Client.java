package ru.javacourse.less005_2.server;

import ru.javacourse.less005_2.pages.PageFileNotFound;
import ru.javacourse.less005_2.pages.PageOk;

import java.io.File;
import java.io.PrintStream;
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
public class Client implements Runnable {
    Socket socket;

    public Client(Socket socket) {
        this.socket = socket;
    }

    public String getQuery(String s){
        s = s.substring(s.indexOf("/") + 1);
        s = s.substring(0, s.indexOf("HTTP")).trim();

        s = URLDecoder.decode(s);
        return s.replace("\\", "/");
    }

    @Override
    public void run() {
        try {
            Scanner scanner = new Scanner(socket.getInputStream());
            PrintStream printStream = new PrintStream(socket.getOutputStream(), true, "cp1251");

            File file = new File(getQuery(scanner.nextLine()));
            if (!file.exists() || !file.canRead()) {
                printStream.println(new PageFileNotFound().toString());
            } else {
                printStream.println(new PageOk(file).toString());
            }

            socket.close();
            scanner.close();
            printStream.close();
        } catch (Exception e) {

        }
    }
}
