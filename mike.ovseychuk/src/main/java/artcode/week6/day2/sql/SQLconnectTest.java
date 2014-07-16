package artcode.week6.day2.sql;

import com.mysql.jdbc.*;

import java.sql.*;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.Statement;
import java.util.Enumeration;

/**
 * Created by mike on 7/13/14.
 */
public class SQLconnectTest {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/new_schema";

   // private static final String URL = "jdbc:mysql://192.168.1.51:3306/new_schema";

    private static final String LOGIN = "root";
    private static final String PASS = "crazytoster";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");

        ////////
        Enumeration<Driver> enumeration = DriverManager.getDrivers();
        while (enumeration.hasMoreElements())
        {
            System.out.println(enumeration.nextElement());
        }
        //////////
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        Connection connection = (Connection) DriverManager.getConnection(URL, LOGIN, PASS);

        Statement statement = connection.createStatement();

                //statement.executeQuery()              - select ... запрос на отримання
                //statement.executeUpdate()             - delete ...

        ResultSet resultSet = statement.executeQuery("SELECT * FROM Employees");

                // resultSet - результат, має лічильник рядків
                //              поля можна витаскувати по атрибутам чи по індексу

        System.out.println(resultSet.toString());

        while (resultSet.next() )
        {
            System.out.println(resultSet.getInt("u_id") + " | " + resultSet.getString("user_name") + " | " + resultSet.getInt("user_age"));
        }

    }

}
