package com.aman.vaadin.student.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.aman.vaadin.student.bean.StudentBean;
import com.aman.vaadin.student.connection.JdbcConnection;
import com.aman.vaadin.student.constant.DbQueryConstant;

public class SearchStudentService {

    public StudentBean searchStudent(int id) {

        JdbcConnection jdbcConnection = new JdbcConnection();

        try (Connection connection = jdbcConnection.getJdbcConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(DbQueryConstant.SEARCHQUERY)) {
					
            preparedStatement.setInt(1, id);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                StudentBean studentBean = new StudentBean();

                if (resultSet.next()) {
                    
                    studentBean.setId(resultSet.getInt(1));
                    studentBean.setName(resultSet.getString(2));
                    studentBean.setGender(resultSet.getString(3));
                    studentBean.setCourse(resultSet.getString(4));
                    studentBean.setEmail(resultSet.getString(5));
                    studentBean.setPhone(resultSet.getInt(6));
                    studentBean.setUsername(resultSet.getString(7));
                    studentBean.setPassword(resultSet.getString(8));

                    return studentBean;
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