package net.eat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;

public abstract class PersistentStore {
	static Connection connection;

	public PersistentStore() {
	}
	
    public static void insert(String name, String password) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/eatnet";

        try {
            Class.forName(driver);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            PersistentStore.connection = DriverManager.getConnection(url, "peter", "");
        } catch(CommunicationsException e) {
            System.out.println("Error connecting to database: " + e);
        } catch(Exception e) {
            System.out.println(e);
        }

        String insert = "insert into Restaurants (name) values (\"" + name + "\", \"" + password + "\");";
        try {
            Statement statement = PersistentStore.connection.createStatement();
            int result = statement.executeUpdate(insert);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
