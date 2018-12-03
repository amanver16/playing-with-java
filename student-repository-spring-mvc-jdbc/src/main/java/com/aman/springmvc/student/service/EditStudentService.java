package com.aman.springmvc.student.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.aman.springmvc.student.bean.StudentBean;
import com.aman.springmvc.student.connection.JdbcConnection;
import com.aman.springmvc.student.constant.DbQueryConstant;

import org.springframework.stereotype.Service;

@Service
public class EditStudentService {

    public boolean updateStudent(StudentBean studentBean) {

        JdbcConnection jdbcConnection = new JdbcConnection();

        try (Connection connection = jdbcConnection.getJdbcConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(DbQueryConstant.UPDATEQUERY)) {

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