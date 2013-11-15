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

   public Set<MyObject> Sort(){
       Set<MyObject> set = new TreeSet<MyObject>();

       for (String s: map.keySet())
           set.add(new MyObject(s, map.get(s)));
       return set;
   }

    class MyObject implements Comparable<MyObject>{
        private String text;
        private int count;

        MyObject(String text, int count) {
            this.text = text;
            this.count = count;
        }

        String getText() {
            return text;
        }

        void setText(String text) {
            this.text = text;
        }

        int getCount() {
            return count;
        }

        void setCount(int count) {
            this.count = count;
        }

        @Override
        public int compareTo(MyObject o) {
            return this.count - o.count;
        }
    }
}
