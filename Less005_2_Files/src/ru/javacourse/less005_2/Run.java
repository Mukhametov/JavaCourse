package ru.javacourse.less005_2;

import ru.javacourse.less005_2.server.Server;

import javax.activation.MimetypesFileTypeMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 16.11.13
 * Time: 17:55
 * To change this template use File | Settings | File Templates.
 */
public class Run {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
          new Server();
    }
}
