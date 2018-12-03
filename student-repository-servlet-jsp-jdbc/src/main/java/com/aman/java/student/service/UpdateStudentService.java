package com.aman.java.student.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.aman.java.student.bean.StudentBean;
import com.aman.java.student.jdbcconnection.JdbcConnection;

public class UpdateStudentService {

    public boolean updateStudent(StudentBean studentBean) {

        JdbcConnection jdbcConnection = new JdbcConnection();
        String query = "UPDATE STUDENT SET NAME = ?, GENDER = ?, COURSE = ?, EMAIL = ?, PHONE = ?, USERNAME = ?, PASSWORD = ? WHERE ID = ?";

        try (Connection connection = jdbcConnection.getJdbcConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, studentBean.getName());
            preparedStatement.setString(2, studentBean.getGender());
            preparedStatement.setString(3, studentBean.getCourse());
            preparedStatement.setString(4, studentBean.getEmail());
            preparedStatement.setInt(5, studentBean.getPhone());
            preparedStatement.setString(6, studentBean.getUsername());
            preparedStatement.setString(7, studentBean.getPassword());
            preparedStatement.setInt(8, studentBean.getId());

            if (preparedStatement.executeUpdate() > 0) {
                return true;
            }

        } catch (SQLException sqlException) {
            System.out.println("Exception occurred while update : " + sqlException);
            System.out.println("Exception is : " + sqlException.getMessage());
            System.out.println(sqlException.getStackTrace());
        }

        return false;
    }

}