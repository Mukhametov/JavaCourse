package ru.javacourse.less4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
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

        Parser parser = new Parser("in.txt");
        Map<String, Integer> map = parser.getMap();

        Sorter sorter = new Sorter(map);
        Set<Sorter.MyObject> set = sorter.Sort();

        for (Sorter.MyObject mo: set){
            System.out.println(mo.getCount() + " | " + mo.getText());
        }

    }

}
