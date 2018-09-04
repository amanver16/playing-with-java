package com.stpl.trainee.aman.springrest.webservice.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Service;

import com.stpl.trainee.aman.springrest.backend.hibernateutility.GetSession;
import com.stpl.trainee.aman.springrest.webservice.beans.StudentBean;

@Service
public class EditStudentService {
	private final Logger updateLogger = LogManager.getLogger(EditStudentService.class);

	public boolean editStudentService(StudentBean updateStudentBean) {

		GetSession getSession = new GetSession();
		Session updateStudentSession = getSession.getSession().openSession();
		updateStudentSession.beginTransaction();

		try {

			updateStudentSession.saveOrUpdate(updateStudentBean);
			updateStudentSession.getTransaction().commit();
			updateStudentSession.close();
			return true;

		} catch (HibernateException updateHibernateException) {

			updateStudentSession.getTransaction().rollback();
			updateLogger.info(updateHibernateException+ " : \nUpdation failed !!!");
		}

		return false;
	}
}
