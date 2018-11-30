package com.aman.app.springrest.webservice.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Service;

import com.aman.app.springrest.backend.hibernateutility.GetSession;
import com.aman.app.springrest.webservice.beans.StudentBean;

@Service
public class ShowStudentService {
	private final Logger showLogger = LogManager.getLogger(ShowStudentService.class);

	public StudentBean showStudentService(Integer searchId) {
		GetSession getSession = new GetSession();
		Session showStudentSession = getSession.getSession().openSession();
		showStudentSession.beginTransaction();
		StudentBean showStudentBean = null;

		try {

			showStudentBean = (StudentBean) showStudentSession.get(StudentBean.class, searchId);
			showStudentSession.getTransaction().commit();
			showStudentSession.close();

		} catch (HibernateException updateHibernateException) {

			showStudentSession.getTransaction().rollback();
			showLogger.info(updateHibernateException+ " : \nStudent doesn't exist !!!");
		}
					
		return showStudentBean;
	}
}
