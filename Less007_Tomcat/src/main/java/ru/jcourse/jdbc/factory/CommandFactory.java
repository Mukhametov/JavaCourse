package ru.jcourse.jdbc.factory;

import ru.jcourse.jdbc.factory.commands.UnknownCommand;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.lang.reflect.Field;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 19.11.13
 * Time: 23:31
 * To change this template use File | Settings | File Templates.
 */
public class CommandFactory {
    private static CommandFactory instance;

    Connection conn = null;
    Statement statement = null;
    ResultSet resultSet = null;



    private CommandFactory() {
        try {
            Class.forName("org.h2.Driver");
            conn = DriverManager.getConnection("jdbc:h2:mem:test");
            String sql = "CREATE TABLE posts(ID INT auto_increment, POSTDATE VARCHAR(1000), POSTMESSAGE VARCHAR(1000))";
            statement = conn.createStatement();
            statement.execute(sql);

        } catch (Exception e){

        } finally {
//            statement.close();
//            conn.close();
        }
    }

    public static CommandFactory getInstance(){
        if (instance == null)
            instance = new CommandFactory();
        return instance;
    }

    public Command getCommand(String commandName){

        try {
            Class<?> clazz = Class.forName("ru.jcourse.jdbc.factory.commands." +
                    commandName.substring(0, 1).toUpperCase()+
                    commandName.substring(1).toLowerCase());
            Command command = (Command) clazz.newInstance();

            for (Field field: clazz.getDeclaredFields()){
               if (field.isAnnotationPresent(Stmt.class)){
                   field.set(command, statement);
               }
            }

            return command;
        } catch (Exception e) {
            return new UnknownCommand();
        }
    }
}