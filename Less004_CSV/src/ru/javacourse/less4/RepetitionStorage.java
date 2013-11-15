package ru.javacourse.less4;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 14.11.13
 * Time: 23:51
 * To change this template use File | Settings | File Templates.
 */
public class RepetitionStorage extends HashMap<String, Integer> {

    public void add(String s){
        if (s.equals(""))
            return;
        int i = 0;
        if (get(s) != null)
            i = get(s);
        put(s, ++i);
    }
}
