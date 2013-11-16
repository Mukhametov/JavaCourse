package ru.javacourse.less4;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 15.11.13
 * Time: 20:54
 * To change this template use File | Settings | File Templates.
 */
public class StatisticItem implements Comparable<StatisticItem> {
    private String text;
    private int count;
    private double percent;

    public StatisticItem(String text, int count) {
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

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public int compareTo(StatisticItem o) {
        if (o.count - this.count != 0)
            return o.count - this.count;
        return 1;
    }

    @Override
    public String toString() {
        return (text + ";" + count + ";" + percent + ";").replace(".", ",");
    }
}
