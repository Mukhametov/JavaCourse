package Less006_Maven;

import Less006_Maven.ru.jcourse.jdbc.factory.Command;
import Less006_Maven.ru.jcourse.jdbc.factory.CommandFactory;

import java.sql.*;
import java.util.Enumeration;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args){
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;
        Scanner scanner = null;


        try {
            Class.forName("org.h2.Driver");
            conn = DriverManager.getConnection("jdbc:h2:mem:test");

            String sql = "CREATE TABLE posts(ID INT auto_increment, POSTDATE VARCHAR(1000), POSTMESSAGE VARCHAR(1000))";
            statement = conn.createStatement();
            statement.execute(sql);
            scanner = new Scanner(System.in);
            CommandFactory factory = new CommandFactory(statement);

            String commandLine = "";
            while (true){
                commandLine = scanner.nextLine();
                if (commandLine.equals("exit"))
                    break;

                String[] commands = commandLine.split(" ");
                Command command = factory.getCommand(commands[0]);
                command.execute(System.out, commands);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }

            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
            scanner.close();

        }

    }
}
