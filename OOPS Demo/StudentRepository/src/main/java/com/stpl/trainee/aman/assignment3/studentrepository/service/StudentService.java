package com.stpl.trainee.aman.assignment3.studentrepository.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.stpl.trainee.aman.assignment3.studentrepository.service.bean.StudentBean;

/* ################### */
/* Author : AMAN VERMA */
/* ################### */

public class StudentService {

	private ArrayList<StudentBean> studentList = new ArrayList<>();
	private Logger logger = LogManager.getLogger(StudentService.class);

	// Comparator for sorting students rank wise
	private Comparator<StudentBean> studentMarks = new Comparator<StudentBean>() {

		public int compare(StudentBean st1, StudentBean st2) {

			int[] studentMarks1 = st1.getStudentMarks();
			int[] studentMarks2 = st2.getStudentMarks();
			int totalMarks1 = sumOfMarks(studentMarks1);
			int totalMarks2 = sumOfMarks(studentMarks2);
			return totalMarks2 - totalMarks1;
		}
	};

	// Method to add student record
	public boolean addStudentService(StudentBean studentRepositoryBean) {
		return studentList.add(studentRepositoryBean);
	}

	// Method to delete student record
	public boolean deleteStudentService(int deleteStudentId) {

		Iterator<StudentBean> studentIterator = studentList.iterator();

		if (studentList.isEmpty()) {
			return false;
		}

		while (studentIterator.hasNext()) {

			StudentBean studentRepositoryBean = studentIterator.next();

			if (studentRepositoryBean != null && studentRepositoryBean.getStudentId() == deleteStudentId) {

				studentIterator.remove();
				return true;
			}
		}

		return false;
	}

	// Method to print student records
	public void printStudentService() {

		if (studentList.isEmpty()) {

			logger.info("No students data available. Please add students in order to print !!!");
			return;
		}

		logger.info("Displaying Students Details :");

		for (StudentBean studentRepository : studentList) {
			logger.info(studentRepository);
		}
	}

	// Method to add marks to students
	public boolean addMarksService(int id, StudentBean studentRepositoryBean) {

		Iterator<StudentBean> marksIterator = studentList.iterator();

		while (marksIterator.hasNext()) {

			StudentBean studentRepository = marksIterator.next();

			if (studentRepository.getStudentId() == id) {

				studentRepositoryBean.setStudentId(studentRepository.getStudentId());
				studentRepositoryBean.setStudentName(studentRepository.getStudentName());
				studentList.set(0, studentRepositoryBean);
				return true;
			}

			else {
				return false;
			}

		}

		return false;
	}

	// Method to query student based on rank
	public void rankStudentService(int rank) {

		if (rank > studentList.size()) {

			logger.info("Invalid Rank !!! Add Students First !!!");
			return;
		}

		Collections.sort(studentList, studentMarks);
		logger.info("Rank " + rank + " student details:");
		logger.info(studentList.get(rank - 1));
	}

	// Method to calculate sum of marks
	public int sumOfMarks(int[] studentMarks) {

		int sumOfMarks = 0;

		for (int marksInt : studentMarks) {
			sumOfMarks = sumOfMarks + marksInt;
		}

		return sumOfMarks;
	}
}