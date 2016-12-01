package sqlpakkk;

import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;

/**
 * Created by Козак on 10.11.2016.
 */
public class Main {

    private static final String URL = "jdbc:mysql://sql9.freemysqlhosting.net:3306/sql9143005";
    private static final String USERNAME = "sql9143005";
    private static final String PASSWORD = "Ca1YmYwxXm";

    public static void main(String args[]) throws SQLException {

        DBProcessor processor = new DBProcessor(); // объект класса
        Connection c = processor.getConnection(URL, USERNAME, PASSWORD); // вызов метода
        String query = "select * from users"; // наш запрос к базе
        Statement statement = c.createStatement(); // создание стейтмента
        ResultSet resultSet = statement.executeQuery(query); // результат с запроса

        while(resultSet.next()) {
            int id,age,phone;
            String name,password,email;
            Date date;
            id = resultSet.getInt("id");
            name = resultSet.getString("name");
            password = resultSet.getString("password");
            email = resultSet.getString("email");
            age = resultSet.getInt("age");
            phone = resultSet.getInt("phone");
            date = resultSet.getDate("date");
            Worker worker = new Worker(id,name,password,email,age,phone,date);
            //Worker worker = new Worker(name,password); // все значения кроме "name,password" заменяются "null"
            System.out.println(worker);
        }

        statement.close();
        c.close();
    }
}
