package com.aman.java8.features.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

/**
 * Try with resources automatically releases the resources after execution
 */
public class JdbcExample implements DriverAction {

    @Override
    public void deregister() {
        System.out.println("Driver de-registered successfully !!!");
    }

    public static void main(String[] args) {

        String serverUrl = "jdbc:sqlserver://mysqlserver.cb7nxw5w5k4w.us-east-2.rds.amazonaws.com;databaseName=StudentDb";
        String username = "amanver16";
        String password = "M3dh!Sql";
        String query = "SELECT *FROM STUDENT";

        try {
            // Create driver
            Driver driver = new SQLServerDriver();
            // Creating Driver Action
            DriverAction driverAction = new JdbcExample();
            // Register Driver
            DriverManager.registerDriver(driver, driverAction);
            System.out.println("Driver registered successfully !!!");

            // Try with resources
            try (Connection connection = DriverManager.getConnection(serverUrl, username, password);
                    PreparedStatement preparedStatement = connection.prepareStatement(query);
                    ResultSet resultSet = preparedStatement.executeQuery()) {

                System.out.println("Connection successfull !!!");

                while (resultSet.next()) {
                    System.out.println("ID : " + resultSet.getInt(1));
                    System.out.println("Name : " + resultSet.getString(2));
                    System.out.println("Gender : " + resultSet.getString(3));
                    System.out.println("Course : " + resultSet.getString(4));
                    System.out.println("Email : " + resultSet.getString(5));
                    System.out.println("Phone : " + resultSet.getLong(6));
                    System.out.println();
                }

            } catch (SQLException sqlException) {
                System.out.println("Exception occurred while creating connection :" + sqlException);
                System.out.println(sqlException.getMessage());
            }

            System.out.println("Connection Closed !!!");
            DriverManager.deregisterDriver(driver);

        } catch (SQLException sqlException) {
            System.out.println("Exception occurred while getting driver :" + sqlException);
            System.out.println(sqlException.getMessage());
        }

    }

}