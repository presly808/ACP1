package ua.artcode.week7.day1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.*;

/**
 * Created by admin on 19.07.2014.
 */
public class TestStatement {


    static String url = "jdbc:mysql://localhost/new_schema";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url, "root", "root");
        PreparedStatement preparedStatement =
                connection.prepareStatement("SELECT * FROM employees where user_name = ? " +
                "AND user_age = ?");
        preparedStatement.setString(1, "Serhii");
        preparedStatement.setInt(2, 22);

        preparedStatement.execute();
        ResultSet resultSet = preparedStatement.getResultSet();

        while(resultSet.next()){
            System.out.println(resultSet.getString("user_name"));
        }

        BigInteger bigInteger = BigInteger.ONE;
        BigDecimal bigDecimal = new BigDecimal(3);

    }
}
