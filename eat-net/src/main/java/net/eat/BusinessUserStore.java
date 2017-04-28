package net.eat;

import java.util.Arrays;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;

import net.eat.restaurant.Restaurant;

public class BusinessUserStore {
    private static Connection connection;

    public static BusinessUser addNewBusinessUser(String username, String password, String name, Restaurant restaurant) throws Exception {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/eatnet";

        try {
            Class.forName(driver);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            BusinessUserStore.connection = DriverManager.getConnection(url, "peter", "");
        } catch(CommunicationsException e) {
            System.out.println("Error connecting to database: " + e);
        } catch(Exception e) {
            System.out.println(e);
        }

        String insert = String.format("insert into BusinessUsers (username, password, name, restaurant) values (\"%s\", \"%s\", \"%s\", %d)",
                                      username, password, name, restaurant.id());
        System.out.println(insert);
        Statement statement = BusinessUserStore.connection.createStatement();
        int result = statement.executeUpdate(insert, Statement.RETURN_GENERATED_KEYS);
        ResultSet resultSet = statement.getGeneratedKeys();
        int id;
        if (resultSet.next()) {
            id = resultSet.getInt(1);
        } else {
            throw new SQLException("resultset next");
        }
        return new BusinessUser(id, username, password, name, restaurant.id());
    }
}
