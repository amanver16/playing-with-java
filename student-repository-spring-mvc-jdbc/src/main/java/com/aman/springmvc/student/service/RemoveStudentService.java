package com.aman.springmvc.student.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.aman.springmvc.student.connection.JdbcConnection;
import com.aman.springmvc.student.constant.DbQueryConstant;

import org.springframework.stereotype.Service;

@Service
public class RemoveStudentService {

	public boolean removeStudent(int id) {

		JdbcConnection jdbcConnection = new JdbcConnection();

		try (Connection connection = jdbcConnection.getJdbcConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(DbQueryConstant.DELETEQUERY)) {

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