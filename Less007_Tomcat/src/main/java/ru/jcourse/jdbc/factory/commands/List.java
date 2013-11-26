package ru.jcourse.jdbc.factory.commands;

import ru.jcourse.jdbc.factory.Command;
import ru.jcourse.jdbc.factory.Stmt;

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
    public String execute(String... strings) {
        StringBuilder sb = new StringBuilder();
        sb.append("<table width=\"60%\">");


        try {
            ResultSet rs = statement.executeQuery("select * from posts order by id desc");
            while (rs.next()){
                sb.append("</tr>");

                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++){
                    sb.append("<td>" + rs.getObject(i) + "</td>");
                }

                sb.append("</tr>");
            }
        } catch (Exception e){
            sb.append("Unknown error");
        }


        sb.append("</table>");
        return sb.toString();
    }
}
