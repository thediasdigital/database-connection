package com.example.databaseconnection;

public class Main {
    public static void main(String[] args) {

        DBUtility.createTable("contact");
        DBUtility.createRow("contact", "Ben", "ben@example.com", "Barrie");

        // *IMPORTANT* FOR FUTURE REFERENCE:

        // Make sure to add "requires java.sql" to the module-info.java file

        // Additionally in your project structure add your sql-connection.jar file
        // to the project structure under file -> project structure -> modules -> dependencies

    }
}
