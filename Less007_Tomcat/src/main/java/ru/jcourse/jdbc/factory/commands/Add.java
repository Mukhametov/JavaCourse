package ru.jcourse.jdbc.factory.commands;

import ru.jcourse.jdbc.factory.Command;
import ru.jcourse.jdbc.factory.Stmt;

import java.io.PrintStream;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 19.11.13
 * Time: 20:54
 * To change this template use File | Settings | File Templates.
 */
public class Add implements Command {
    @Stmt
    public Statement statement;

    @Override
    public String execute(String... strings) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY.MM.dd hh:mm:ss");
            statement.execute("Insert into posts values(null, '" + simpleDateFormat.format(new Date()) + "', '" + strings[0] + "')");
        } catch (Exception e) {
            return "Error in query";
        }
        return "";
    }
}
