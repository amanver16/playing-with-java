package com.aman.springmvc.student.service;

import com.aman.springmvc.student.backend.hibernateutility.GetSession;
import com.aman.springmvc.student.bean.StudentBean;

import org.hibernate.HibernateException;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Service;

@Service
public class RemoveStudentService {

	public boolean removeStudent(int deleteId) {

		GetSession getSession = new GetSession();
		Session session = getSession.getSession().openSession();
		session.beginTransaction();
		StudentBean studentBean = null;

		try {

			studentBean = (StudentBean) session.get(StudentBean.class, deleteId);

			if (studentBean != null) {
				session.delete(studentBean);
				session.getTransaction().commit();
				session.close();
				return true;
			}

		} catch (HibernateException hibernateException) {
			session.getTransaction().rollback();
			System.out.println(hibernateException + " : \nStudent not found !!!");
		}

		return false;
	}
}
