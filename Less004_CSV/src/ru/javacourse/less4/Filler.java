package ru.javacourse.less4;

import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 16.11.13
 * Time: 15:03
 * To change this template use File | Settings | File Templates.
 */
public class Filler {
    Set<StatisticItem> set;

    public Filler(Set<StatisticItem> set) {
        this.set = set;
    }

    public void fillPercent(int size){
        for (StatisticItem statisticItem: set){
            statisticItem.setPercent(statisticItem.getCount() * 100.0 / size);
        }
    }

}
