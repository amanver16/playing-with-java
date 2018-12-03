package com.aman.java.student.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.aman.java.student.bean.StudentBean;
import com.aman.java.student.jdbcconnection.JdbcConnection;

public class RegisterStudentService {

    public boolean register(StudentBean studentBean) {

        JdbcConnection jdbcConnection = new JdbcConnection();
        String query = "INSERT INTO STUDENT VALUES(?,?,?,?,?,?,?,?)";

        try (Connection connection = jdbcConnection.getJdbcConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, studentBean.getId());
            preparedStatement.setString(2, studentBean.getName());
            preparedStatement.setString(3, studentBean.getGender());
            preparedStatement.setString(4, studentBean.getCourse());
            preparedStatement.setString(5, studentBean.getEmail());
            preparedStatement.setInt(6, studentBean.getPhone());
            preparedStatement.setString(7, studentBean.getUsername());
            preparedStatement.setString(8, studentBean.getPassword());

            if (preparedStatement.executeUpdate() > 0) {
                return true;
            }

        } catch (SQLException sqlException) {
            System.out.println("Exception occurred while register : " + sqlException);
            System.out.println("Exception is : " + sqlException.getMessage());
            System.out.println(sqlException.getStackTrace());
        }

        return false;
    }

}