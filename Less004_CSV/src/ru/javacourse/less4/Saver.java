package ru.javacourse.less4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 16.11.13
 * Time: 15:56
 * To change this template use File | Settings | File Templates.
 */
public class Saver {
    Set<StatisticItem> set;

    public Saver(Set<StatisticItem> set) {
        this.set = set;
    }

    public void save(String fileName) {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(fileName, "CP1251");
            for (StatisticItem si : set) {
                printWriter.println(si.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } finally {
            if (printWriter != null)
                printWriter.close();
        }

    }


}
