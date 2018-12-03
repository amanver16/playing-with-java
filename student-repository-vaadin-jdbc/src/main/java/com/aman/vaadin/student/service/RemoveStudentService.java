package com.aman.vaadin.student.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.aman.vaadin.student.connection.JdbcConnection;
import com.aman.vaadin.student.constant.DbQueryConstant;

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