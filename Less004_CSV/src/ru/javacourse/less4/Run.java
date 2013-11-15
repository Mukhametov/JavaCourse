package ru.javacourse.less4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 14.11.13
 * Time: 23:31
 * To change this template use File | Settings | File Templates.
 */
public class Run {

    public static void main(String[] args) throws IOException {

        Parser parser = new Parser("in.txt");
        Map<String, Integer> map = parser.getMap();



        for (String s: map.keySet()){
            System.out.println(s + " | " + map.get(s));
        }

    }

}
