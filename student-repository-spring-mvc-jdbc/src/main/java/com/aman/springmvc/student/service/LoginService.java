package com.aman.springmvc.student.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.aman.springmvc.student.connection.JdbcConnection;
import com.aman.springmvc.student.constant.DbQueryConstant;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean login(String username, String password) {

        JdbcConnection jdbcConnection = new JdbcConnection();

        try (Connection connection = jdbcConnection.getJdbcConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(DbQueryConstant.LOGINQUERY)) {

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if(resultSet.next()) {
                    return true;
                }
            }

        } catch (SQLException sqlException) {
            System.out.println("Exception occurred while login : " + sqlException);
            System.out.println("Exception is : " + sqlException.getMessage());
            System.out.println(sqlException.getStackTrace());
        }

        return false;
    }

}