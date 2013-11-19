package Less006_Maven.ru.jcourse.jdbc.factory.commands;

import Less006_Maven.ru.jcourse.jdbc.factory.Command;
import Less006_Maven.ru.jcourse.jdbc.factory.Stmt;

import java.io.PrintStream;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 20.11.13
 * Time: 0:14
 * To change this template use File | Settings | File Templates.
 */
public class List implements Command {
    @Stmt
    public Statement statement;

    @Override
    public void execute(PrintStream out, String... strings) {
        out.println("---------------------------------");

        try {
            ResultSet rs = statement.executeQuery("select * from posts");
            while (rs.next()){
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++){
                    out.print(rs.getObject(i) + " | ");
                }
                out.println();
            }
        } catch (Exception e){
            out.println("Unknown error");
        }
    }
}
