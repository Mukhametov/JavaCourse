package ru.javacourse.less005_2.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 17.11.13
 * Time: 1:09
 * To change this template use File | Settings | File Templates.
 */
public class Server {

    public Server() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("context"));
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }


        ServerSocket serverSocket = null;
        Socket socket = null;
        try {
            serverSocket = new ServerSocket(Integer.parseInt((String) properties.get("Port")));
            while (true) {
                socket = serverSocket.accept();
                new Thread(new ClientDispatcher(socket)).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
    }
}
