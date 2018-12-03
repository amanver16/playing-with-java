package com.aman.springmvc.student.service;

import com.aman.springmvc.student.backend.hibernateutility.GetSession;
import com.aman.springmvc.student.bean.StudentBean;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.stereotype.Service;


@Service
public class AddStudentService {

	public boolean addStudent(StudentBean studentBean) {

		GetSession getSession = new GetSession();
		Session session = getSession.getSession().openSession();
		session.beginTransaction();

		try {
			session.save(studentBean);
			session.getTransaction().commit();
			session.close();

			if (studentBean != null) {
				return true;
			}

		} catch (HibernateException hibernateException) {
			session.getTransaction().rollback();
			System.out.println(hibernateException + " : \nStudent Already avilable");
		}

		return false;
	}
}
