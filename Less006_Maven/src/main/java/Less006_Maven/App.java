package Less006_Maven;

import java.sql.*;
import java.util.Enumeration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args){
        Connection conn = null;
        Statement statement = null;

        try {
            Class.forName("org.h2.Driver");
            conn = DriverManager.getConnection("jdbc:h2:mem:test");

            String sql = "CREATE TABLE posts(ID INT PRIMARY KEY, POSTMESSAGE VARCHAR(1000), POSTDATE VARCHAR(1000))";
            statement = conn.createStatement();
            statement.execute(sql);

            DatabaseMetaData databaseMetaData = conn.getMetaData();
            ResultSet resultSet = databaseMetaData.getTables(null, null, null, new String[]{"TABLE"});

            System.out.println("Tables:");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("Table_name"));
            }

            statement.execute("Insert into posts values(1, 'hello', 'Data')");


            ResultSet rs = statement.executeQuery("select * from posts");
            while (rs.next())
                System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3));

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

        }

    }
}
