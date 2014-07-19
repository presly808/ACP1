package week6.mysql;

import java.sql.*;
import java.util.Enumeration;

/**
 * Created by vkucheru on 13.07.2014.
 */
public class Main {

    private final static String URL = "jdbc:mysql://192.168.1.51:3306/new_schema";
    private final static String MYURL = "jdbc:mysql://localhost:3306/new_schema";
    private final static String LOGIN = "root";
    private final static String PASSWORD = "";
    private final static String SQL = "select * from employees;";
    private final static String ALTER_SQL = "alter table employees add car_id int(11);";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
//        Enumeration<Driver> enumeration = DriverManager.getDrivers();
//        while (enumeration.hasMoreElements()) {
//            System.out.println(enumeration.nextElement());
//        }
        Connection connection = DriverManager.getConnection(MYURL, LOGIN, PASSWORD);
        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery(SQL);
//        while (resultSet.next()) {
//            System.out.println(resultSet.getString(1)+" | "+resultSet.getString(2)+" | "+resultSet.getString(3));
//        }
        //System.out.println(statement.execute(ALTER_SQL));
        System.out.println(statement.execute("update employees set car_id = null;"));
//        System.out.println(statement.executeUpdate("update employees set car_id = 2 where u_id = 2;"));
//        System.out.println(statement.executeUpdate("update employees set car_id = 3 where u_id = 3;"));
//        System.out.println(statement.executeUpdate("update employees set car_id = 4 where u_id = 4;"));
//        System.out.println(statement.executeUpdate("update employees set car_id = 5 where u_id = 5;"));
        //statement.execute("");
        //System.out.println(statement.execute("ALTER TABLE employees ADD CONSTRAINT FOREIGN KEY(car_id) REFERENCES cars(id);"));
        //System.out.println(statement.execute("create table cars (id int(11) NOT NULL AUTO_INCREMENT primary key, model char(16), year int(11));"));
        //System.out.println(statement.execute("select * from employees;"));
        //System.out.println(statement.get);

    }
}
