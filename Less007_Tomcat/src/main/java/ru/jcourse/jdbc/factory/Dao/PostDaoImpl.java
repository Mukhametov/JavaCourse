package ru.jcourse.jdbc.factory.Dao;

import ru.jcourse.jdbc.factory.Command;
import ru.jcourse.jdbc.factory.CommandFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 26.11.13
 * Time: 0:51
 * To change this template use File | Settings | File Templates.
 */
public class PostDaoImpl implements PostDao {
    CommandFactory factory = CommandFactory.getInstance();

    @Override
    public void addRecord(String postMessage) {
        factory.getCommand("Add").execute(postMessage);
    }

    @Override
    public String getRecordList() {
        return factory.getCommand("List").execute();
    }
}
