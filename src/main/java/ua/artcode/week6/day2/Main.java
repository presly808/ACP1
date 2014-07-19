package ua.artcode.week6.day2;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by admin on 13.07.2014.
 */
public class Main {

    static String url = "jdbc:mysql://localhost/new_schema";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = (Connection) DriverManager.getConnection(url,"root", "root");
        Statement statement = connection.createStatement();

    }
}
