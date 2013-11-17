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

    public static void main(String[] args) throws Exception {
        Parser parser = new Parser(args[0]);
        Map<String, Integer> map = parser.getMap();
        Set<StatisticItem> set = new Sorter(map).getSortedSet();
        new Filler(set).fillPercent(parser.getWordCount());
        new Saver(set).save(args[1]);
        System.out.println("TA-DA!");
    }
}
