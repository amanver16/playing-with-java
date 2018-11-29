package com.aman.java.student.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.aman.java.student.bean.StudentBean;
import com.aman.java.student.jdbcconnection.JdbcConnection;

public class ViewStudentService {

    public StudentBean viewStudent(String username) {

        JdbcConnection jdbcConnection = new JdbcConnection();
        String query = "SELECT * FROM STUDENT WHERE USERNAME = ?";

        try (Connection connection = jdbcConnection.getJdbcConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, username);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                StudentBean studentBean = new StudentBean();

                if (resultSet.next()) {
                    studentBean.setId(resultSet.getInt(1));
                    studentBean.setName(resultSet.getString(2));
                    studentBean.setGender(resultSet.getString(3));
                    studentBean.setCourse(resultSet.getString(4));
                    studentBean.setEmail(resultSet.getString(5));
                    studentBean.setPhone(resultSet.getInt(6));
                }

            }
        } catch (SQLException sqlException) {
            System.out.println("Exception occurred while getting data : " + sqlException);
            System.out.println("Exception is : " + sqlException.getMessage());
            System.out.println(sqlException.getStackTrace());
        }

        return null;
    }

}