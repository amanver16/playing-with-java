package com.aman.java.student.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.aman.java.student.jdbcconnection.JdbcConnection;

public class DeleteStudentService {

    public boolean deleteStudent(int id) {

        JdbcConnection jdbcConnection = new JdbcConnection();
        String query = "DELETE FROM STUDENT WHERE ID = ?";

        try (Connection connection = jdbcConnection.getJdbcConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, id);

            if (preparedStatement.executeUpdate() > 0) {
                return true;
            }

        } catch (SQLException sqlException) {
            System.out.println("Exception occurred while delete : " + sqlException);
            System.out.println("Exception is : " + sqlException.getMessage());
            System.out.println(sqlException.getStackTrace());
        }

        return false;
    }

}