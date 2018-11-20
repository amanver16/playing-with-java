package com.stpl.bcp.excelexport;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/*
 *	@author : Aman.Verma
 */

public class ExcelExport {

	// Method to export data from SQL to Excel
	public void exportToExcel() {

		System.out.println("Enter Excel Export...");
		String excelFileName = "excel/students.xls";  // Other formats also supported like .csv, .xlsx etc
		String query = "SELECT *FROM STUDENT";
		Properties properties = new Properties();
		File propertiesFile = new File("src/main/resources/local-connection.properties");

		try {
			InputStream readPropertiesFile = new FileInputStream(propertiesFile);
			properties.load(readPropertiesFile);
		} catch (IOException ioException) {
			System.out.println("Exception occurred while reading properties file : " + ioException.getStackTrace());
		}

		// This BCP command copies data obtained from query to specified file format
		String bcpCommand = "bcp \"" + query + "\" queryout \"" + excelFileName + "\" -c -d \""
				+ properties.getProperty("DATABASE_NAME") + "\" -S " + properties.getProperty("SERVER_URL") + " -U \""
				+ properties.getProperty("USERNAME") + "\" -P \"" + properties.getProperty("PASSWORD") + "\"";
		System.out.println("BCP Command : " + bcpCommand);

		// Executes BCP command using command line
		ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", bcpCommand);

		try {

			Process process = processBuilder.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line;

			while (true) {

				line = reader.readLine();

				if (line == null) {
					break;
				}

				System.out.println(line);
			}

			System.out.println("Excel File Created !!!");

		} catch (IOException ioException) {
			ioException.printStackTrace();
			System.out.println("Failed to export data to excel !!!");
		}

		System.out.println("Exit Excel Export...");
	}
}
