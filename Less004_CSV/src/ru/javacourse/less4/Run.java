package ru.javacourse.less4;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 14.11.13
 * Time: 23:31
 * To change this template use File | Settings | File Templates.
 */
public class Run {

    public static void main(String[] args) throws IOException {

        Map<String, Integer> map = new Parser("in.txt").getMap();

        Set<StatisticItem> set = new Sorter(map).Sort();

        PrintWriter printWriter = new PrintWriter("out.csv", "CP1251");
        for (StatisticItem si : set) {
            printWriter.println(si.toString());
        }
        printWriter.close();

    }

}
