package Less006_Maven.ru.jcourse.jdbc.factory;

import Less006_Maven.ru.jcourse.jdbc.factory.commands.UnknownCommand;

import java.sql.Statement;
import java.lang.reflect.Field;
/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 19.11.13
 * Time: 23:31
 * To change this template use File | Settings | File Templates.
 */
public class CommandFactory {
    Statement statement;

    public CommandFactory(Statement statement) {
        this.statement = statement;
    }

    public Command getCommand(String commandName){

        try {
            Class<?> clazz = Class.forName("Less006_Maven.ru.jcourse.jdbc.factory.commands." +
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