package ru.javacourse.less4;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

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
