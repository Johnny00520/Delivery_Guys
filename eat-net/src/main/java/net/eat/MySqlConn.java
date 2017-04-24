package net.eat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;

public class MySqlConn {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
	private Connection conn;

    public void connect(String host, String port, String database,
                        String user, String password) throws SQLException
    {
        String url = "jdbc:mysql://" + host + ":" + port + "/" + database;
        this.conn = DriverManager.getConnection(url, user, password);
    }

    public void insert(String table, String attributes, String tuple) throws SQLException {
        String insert = "insert into " + table + " " + attributes + " values " + tuple + ";";
        Statement statement = this.conn.createStatement();
        int result = statement.executeUpdate(insert);
        assert result == 0;
    }

    /*
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
    */
}
