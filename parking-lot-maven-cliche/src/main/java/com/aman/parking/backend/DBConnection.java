package com.aman.parking.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public Connection createConnection() {
        Connection connection = null;

        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:~/parking-lot", "sa", "");
        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println("Exception occurred while creating connection: " + classNotFoundException.getMessage());
            classNotFoundException.printStackTrace();
        } catch (SQLException sqlException) {
            System.out.println("Exception occurred while creating connection: " + sqlException.getMessage());
        }

        return connection;
    }
}