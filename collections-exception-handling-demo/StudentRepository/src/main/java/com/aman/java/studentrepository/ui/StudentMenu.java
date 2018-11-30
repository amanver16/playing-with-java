package com.aman.java.studentrepository.ui;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.stpl.trainee.aman.assignment3.studentrepository.service.StudentService;
import com.stpl.trainee.aman.assignment3.studentrepository.service.bean.StudentBean;
import com.stpl.trainee.aman.assignment3.studentrepository.ui.constant.StudentRepositoryConstant;

/* ################### */
/* Author : AMAN VERMA */
/* ################### */

public class StudentMenu {
	private static Logger logger = LogManager.getLogger(StudentMenu.class);
	private static StudentService studentRecord = new StudentService();
	private static Scanner sc = new Scanner(System.in);

	// Method to input student details
	public void addStudentDetails() {

		do {

			try {

				logger.info("Enter Student Details : ");
				logger.info(StudentRepositoryConstant.INPUT_STUDENT_ID_MESSAGE);
				int id = sc.nextInt();
				sc.nextLine();
				logger.info("Enter Student Name : ");
				String name = sc.nextLine();

				StudentBean studentRepositoryBean = new StudentBean();
				studentRepositoryBean.setStudentId(id);
				studentRepositoryBean.setStudentName(name);

				if (studentRecord.addStudentService(studentRepositoryBean)) {
					logger.info("Student Added.");
				} else {
					logger.info("Student not added.");
				}

				logger.info("Do you want to add more student ?(y/n)");
				String ans = sc.next();

				if (ans.equals("n") || ans.equals("N")) {
					return;
				}

			} catch (InputMismatchException inputMismatchException) {

				logger.info(inputMismatchException);
				logger.info(StudentRepositoryConstant.APPROPRIATE_INPUT_MESSAGE);
			}

			sc.nextLine();
		} while (true);
	}

	// Method to delete student
	public void studentDeletion() {

		logger.info(StudentRepositoryConstant.INPUT_STUDENT_ID_MESSAGE);
		int deleteId = sc.nextInt();

		if (studentRecord.deleteStudentService(deleteId)) {
			logger.info("Record is deleted.");
		} else {
			logger.info("Record is not found/deleted.");
		}
	}

	// Method to input student marks
	public void inputMarks() {

		try {

			logger.info("Enter Student Mark Details : ");
			logger.info(StudentRepositoryConstant.INPUT_STUDENT_ID_MESSAGE);
			int id = sc.nextInt();
			logger.info("Enter marks for id " + id + ":");
			int[] marks = new int[3];

			for (int i = 0; i < marks.length; i++) {
				logger.info("Enter subject " + (i + 1) + " marks : ");
				marks[i] = sc.nextInt();
			}

			StudentBean studentRepositoryBean = new StudentBean();
			studentRepositoryBean.setStudentMarks(marks);

			if (studentRecord.addMarksService(id, studentRepositoryBean)) {
				logger.info("Marks Added for student " + id + ".");
			} else {
				logger.info("Id is not found. Marks not added.");
			}

		} catch (InputMismatchException inputMismatchException) {
			logger.info(inputMismatchException);
			logger.info(StudentRepositoryConstant.APPROPRIATE_INPUT_MESSAGE);
		}
	}

	// Main Method
	public static void main(String[] args) {

		StudentMenu studentMenu = new StudentMenu();
		int choice;

		do {

			try {

				logger.info(
						"\n==========Student Repository==========\n1) Add Student.\n2) Delete Student.\n3) Print Student.\n4) Add Marks to the Student.\n5) Query Student Based on Rank.\n6) Exit.\nEnter Your Choice : ");
				choice = sc.nextInt();

				switch (choice) {

				case 1:
					studentMenu.addStudentDetails();
					break;

				case 2:
					studentMenu.studentDeletion();
					break;

				case 3:
					studentRecord.printStudentService();
					break;

				case 4:
					studentMenu.inputMarks();
					break;

				case 5:
					logger.info("Enter rank :");
					int rank = sc.nextInt();
					studentRecord.rankStudentService(rank);
					break;

				case 6:
					logger.info("Program Terminated.");
					sc.close();
					return;

				default:
					logger.info("Invalid Choice !!! Try Again !!!");
				}

			} catch (InputMismatchException e) {

				logger.info(e);
				logger.info(StudentRepositoryConstant.APPROPRIATE_INPUT_MESSAGE);
			}

			sc.nextLine();
		} while (true);
	}
}
