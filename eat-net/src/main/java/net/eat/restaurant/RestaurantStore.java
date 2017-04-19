package net.eat.restaurant;

import java.util.Arrays;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;


public class RestaurantStore {
    private static Connection connection;

    public static Restaurant addNewRestaurant(String name) throws Exception {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/eatnet";

        try {
            Class.forName(driver);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            RestaurantStore.connection = DriverManager.getConnection(url, "peter", "");
        } catch(CommunicationsException e) {
            System.out.println("Error connecting to database: " + e);
        } catch(Exception e) {
            System.out.println(e);
        }

        String insert = "insert into Restaurants (name) values (\"" + name + "\");";
        Statement statement = RestaurantStore.connection.createStatement();
        int result = statement.executeUpdate(insert, Statement.RETURN_GENERATED_KEYS);
        ResultSet resultSet = statement.getGeneratedKeys();
        int x;
        if (resultSet.next()) {
            x = resultSet.getInt(1);
        } else {
            throw new SQLException("resultset next");
        }
        return new Restaurant(x, name);
    }
}
