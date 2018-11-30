package com.aman.java.phonebook.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.aman.java.phonebook.service.PhoneBookService;
import com.aman.java.phonebook.ui.constant.PhoneBookConstant;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/* ################### */
/* Author : AMAN VERMA */
/* ################### */

public class PhoneMenu {

	private static final Logger logger = LogManager.getLogger(PhoneMenu.class);
	private static final Scanner sc = new Scanner(System.in);
	private static PhoneBookService phoneRecord = new PhoneBookService();

	// Method to input phone record details
	public void inputPhoneDetails() {

		String name;
		int phoneNumber;

		do {

			try {

				logger.info(PhoneBookConstant.INPUT_NAME_MESSAGE);
				name = sc.next();
				logger.info("Enter Phone Number : ");
				phoneNumber = sc.nextInt();

				if (phoneRecord.addPhoneRecordService(name, phoneNumber)) {
					logger.info("Phone record is added.");
				} else {
					logger.info("Phone record is not added.");
				}

				logger.info("Do you want to add more records ?(y/n)");
				String ans = sc.next();

				if (ans.equals("n") || ans.equals("N")) {
					return;
				}

			} catch (InputMismatchException e) {

				logger.info(e);
				logger.info(PhoneBookConstant.APPROPRIATE_INPUT_MESSAGE);
			}

			sc.nextLine();
		} while (true);
	}

	// Method to show deleted record message
	public void phoneRecordDeletion() {

		do {

			try {

				logger.info(PhoneBookConstant.INPUT_NAME_MESSAGE);
				String name = sc.next();

				if (phoneRecord.deletePhoneRecordService(name)) {
					logger.info("Record is deleted.");
				} else {
					logger.info("Record is not deleted or found.");
				}

				logger.info("Do you want to delete more records ?(y/n)");
				String ans = sc.next();

				if (ans.equals("n") || ans.equals("N")) {
					return;
				}

			} catch (InputMismatchException inputMismatchException) {

				logger.info(inputMismatchException);
				logger.info(PhoneBookConstant.APPROPRIATE_INPUT_MESSAGE);
			}

		} while (true);
	}

	// Method to query phone record
	public void queryPhone() {

		do {

			try {

				logger.info(PhoneBookConstant.INPUT_NAME_MESSAGE);
				String name = sc.next();

				if (!phoneRecord.queryPhoneRecordService(name)) {
					logger.info("Record is not available.");
				}

				logger.info("Do you want to query more records ?(y/n)");
				String ans = sc.next();

				if (ans.equals("n") || ans.equals("N")) {
					return;
				}

			} catch (InputMismatchException inputMismatchException) {

				logger.info(inputMismatchException);
				logger.info("Please input appropriate value !!!");
			}

		} while (true);
	}

	// Main method
	public static void main(String[] args) {

		PhoneMenu phoneMenu = new PhoneMenu();
		int choice;

		do {

			try {

				logger.info(
						"\n==========Phone Book==========\n1) Add record.\n2) Delete record.\n3) Print record.\n4) Query Phone Number.\n5) Exit.\nEnter Your Choice : ");
				choice = sc.nextInt();

				switch (choice) {

				case 1:
					phoneMenu.inputPhoneDetails();
					break;

				case 2:
					phoneMenu.phoneRecordDeletion();
					break;

				case 3:
					logger.info("Displaying phone records :");
					phoneRecord.showPhoneRecordService();
					break;

				case 4:
					phoneMenu.queryPhone();
					break;

				case 5:
					logger.info("Program Terminated.");
					sc.close();
					return;

				default:
					logger.info("Invalid Choice !!! Try Again !!!");
				}

			} catch (InputMismatchException e) {

				logger.info(e);
				logger.info(PhoneBookConstant.APPROPRIATE_INPUT_MESSAGE);
			}

			sc.nextLine();
		} while (true);
	}
}
