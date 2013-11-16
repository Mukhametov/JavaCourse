package ru.javacourse.less4;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 15.11.13
 * Time: 17:23
 * To change this template use File | Settings | File Templates.
 */
public class Sorter {

    Map<String, Integer> map;

    public Sorter(Map<String, Integer> map) {
        this.map = map;
    }

   public Set<StatisticItem> getSortedSet(){
       Set<StatisticItem> set = new TreeSet<StatisticItem>();

       for (String s: map.keySet())
           set.add(new StatisticItem(s, map.get(s)));
       return set;
   }
}
