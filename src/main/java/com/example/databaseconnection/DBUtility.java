package com.example.databaseconnection;

import java.sql.*;

public class DBUtility {
    // Fill out your db Username, Password, and Link respectively:
    private static final String user = "";
    private static final String password = "";
    private static final String url = "";

    // Here is an example of how you would use JDBC to create a new table in a database
    public static void createTable(String tableName) {

        try{
            // Establish a connection instantiate a statement
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            // Plan out the statement string
            String sql = "CREATE TABLE " + tableName + "(" +
                    "name VARCHAR(25)," +
                    "email VARCHAR(50)," +
                    "homeTown VARCHAR(85)" +
                    ");";
            // Execute the statement
            stmt.executeUpdate(sql);
            // Close the connection and statement.
            // Having too many active connections can slow your program.
            conn.close();
            stmt.close();

            System.out.println("Table created successfully...");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Here is a second example utilizing a prepared statement. It is best practice
    // to use a prepared statement, as it helps defend against sql injection attacks.

    public static void createRow(String tableName, String name, String email, String homeTown) {
        // Create a sql prepared string
        String sql = "INSERT INTO " + tableName + " VALUES (?,?,?);";

        try{
            // Establish a connection and instantiate a statement
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement stmt = conn.prepareStatement(sql);
            // Insert parameters into the prepared statement
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, homeTown);
            // Execute the statement
            stmt.executeUpdate();
            // Close the connection and statement.
            // Having too many active connections can slow your program.
            conn.close();
            stmt.close();

            System.out.println("Row created successfully...");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
