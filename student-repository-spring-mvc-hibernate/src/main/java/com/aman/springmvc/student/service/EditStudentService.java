package com.aman.springmvc.student.service;

import com.aman.springmvc.student.backend.hibernateutility.GetSession;
import com.aman.springmvc.student.bean.StudentBean;

import org.hibernate.HibernateException;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Service;


@Service
public class EditStudentService {

	public boolean updateStudent(StudentBean studentBean) {

		GetSession getSession = new GetSession();
		Session session = getSession.getSession().openSession();
		session.beginTransaction();

		try {
			session.saveOrUpdate(studentBean);
			session.getTransaction().commit();
			session.close();
			return true;
		} catch (HibernateException hibernateException) {
			session.getTransaction().rollback();
			System.out.println(hibernateException+ " : \nUpdation failed !!!");
		}

		return false;
	}
}
