package artcode.week6.day2.sql;

import java.sql.*;

/**
 * Created by mike on 7/13/14.
 */
public class SqlTableCreator {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/new_schema";

    // private static final String URL = "jdbc:mysql://192.168.1.51:3306/new_schema";

    private static final String LOGIN = "root";
    private static final String PASS = "crazytoster";


    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = (Connection) DriverManager.getConnection(URL, LOGIN, PASS);

        Statement statement = connection.createStatement();

        //statement.executeQuery()              - select ... запрос на отримання
        //statement.executeUpdate()             - delete ...


        connection.setAutoCommit(false);    // початок транзакції

        statement.executeUpdate("DROP TABLE IF EXISTS Cars");
        statement.executeUpdate("DROP TABLE IF EXISTS Citys");
        statement.executeUpdate("DROP TABLE IF EXISTS Employees");


        statement.executeUpdate(
                "CREATE TABLE Cars (" +
                        " car_id int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT, " +
                        " car_model varchar(20), car_year int(11) ) "
                );

        statement.executeUpdate(
                "CREATE TABLE Employees ( "
                        + "u_id int(11) NOT NULL AUTO_INCREMENT, "
                        + "user_name char(20), "
                        + "user_age int(11),"
                        + "PRIMARY KEY(u_id) )"
        );


        statement.executeUpdate("ALTER TABLE Employees ADD car_id varchar(50)");

//        statement.executeUpdate(
  //              "ALTER TABLE Employees " +
    //            "ADD FOREIGN KEY (car_id) " +
        //        "REFERENCES Cars(car_id) "
      //  );

        statement.executeUpdate("INSERT INTO Employees (user_name, user_age) VALUES ('Vova', 27)");
        statement.executeUpdate("INSERT INTO Employees (user_name, user_age) VALUES ('Mike', 21)");
        statement.executeUpdate("INSERT INTO Employees (user_name, user_age) VALUES ('Serg', 24)");
        statement.executeUpdate("INSERT INTO Employees (user_name, user_age) VALUES ('Nina', 20)");

        statement.executeUpdate("INSERT INTO Cars (car_model, car_year) VALUES ('Lincoln', '1971');");
        statement.executeUpdate("INSERT INTO Cars (car_model, car_year) VALUES ('Mercedes', '1991');");
        statement.executeUpdate("INSERT INTO Cars (car_model, car_year) VALUES ('Honda', '1999');");
        statement.executeUpdate("INSERT INTO Cars (car_model, car_year) VALUES ('BMW', '2011');");

        statement.executeUpdate("UPDATE Employees " + " SET car_id=1 " + "WHERE u_id=1");
        statement.executeUpdate("UPDATE Employees " + " SET car_id=2 " + "WHERE u_id=2");
        statement.executeUpdate("UPDATE Employees " + " SET car_id=4 " + "WHERE u_id=3");


        connection.commit();    // кінець

        ResultSet resultSet = statement.executeQuery("SELECT * FROM Employees");


        while (resultSet.next() ) {
            System.out.println(resultSet.getInt("u_id") + " | " +
                    resultSet.getString("user_name") + " | " +
                    resultSet.getInt("user_age") + " | " +
                    resultSet.getString("car_id"));
        }



    }
}
