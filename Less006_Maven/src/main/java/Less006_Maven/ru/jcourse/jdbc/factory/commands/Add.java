package Less006_Maven.ru.jcourse.jdbc.factory.commands;

import Less006_Maven.ru.jcourse.jdbc.factory.Command;
import Less006_Maven.ru.jcourse.jdbc.factory.Stmt;

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
    public void execute(PrintStream out, String... strings) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY.MM.DD hh:mm:ss");

            statement.execute("Insert into posts values(null, '" + simpleDateFormat.format(new Date()) + "', '" + strings[1] + "')");
        } catch (Exception e) {
            out.println("Error in query");
        }
    }
}
