package ru.jcourse.jdbc.factory.Dao;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 26.11.13
 * Time: 0:49
 * To change this template use File | Settings | File Templates.
 */
public interface PostDao {

    public void addRecord(String postMessage);

    public String getRecordList();

}
