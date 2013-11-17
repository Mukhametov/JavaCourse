package ru.javacourse.less005_2.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 17.11.13
 * Time: 1:09
 * To change this template use File | Settings | File Templates.
 */
public class Server {

    public static String serverName = "192.168.0.35:8080";

    public Server(String serverName, int port) {
        try {
            Server.serverName = serverName + ":" + port;

            ServerSocket serverSocket = new ServerSocket(port);

            while (true) {
                Socket socket = serverSocket.accept();
                new Thread(new Client(socket)).start();
            }
        } catch (Exception e) {

        }
    }
}
