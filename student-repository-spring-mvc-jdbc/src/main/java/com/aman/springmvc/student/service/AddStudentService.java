package com.aman.springmvc.student.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.aman.springmvc.student.bean.StudentBean;
import com.aman.springmvc.student.connection.JdbcConnection;
import com.aman.springmvc.student.constant.DbQueryConstant;

import org.springframework.stereotype.Service;

@Service
public class AddStudentService {

    public boolean addStudent(StudentBean studentBean) {

        JdbcConnection jdbcConnection = new JdbcConnection();

        try (Connection connection = jdbcConnection.getJdbcConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(DbQueryConstant.INSERTQUERY)) {

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
            System.out.println("Exception occurred while adding : " + sqlException);
            System.out.println("Exception is : " + sqlException.getMessage());
            System.out.println(sqlException.getStackTrace());
        }

        return false;
    }

}