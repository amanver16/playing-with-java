package com.stpl.trainee.aman.springrest.webservice.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Service;

import com.stpl.trainee.aman.springrest.backend.hibernateutility.GetSession;
import com.stpl.trainee.aman.springrest.webservice.beans.StudentBean;

@Service
public class RemoveStudentService {
	private final Logger deleteStudentLogger = LogManager.getLogger(RemoveStudentService.class);

	public boolean removeStudentService(int deleteId) {

		GetSession getSession = new GetSession();
		Session deleteStudentSession = getSession.getSession().openSession();
		deleteStudentSession.beginTransaction();
		StudentBean deleteStudentBean = null;

		try {

			deleteStudentBean = (StudentBean) deleteStudentSession.get(StudentBean.class, deleteId);

			if (deleteStudentBean != null) {
				
				deleteStudentSession.delete(deleteStudentBean);
				deleteStudentSession.getTransaction().commit();
				deleteStudentSession.close();

				return true;
			}

		} catch (HibernateException removeHibernateException) {

			deleteStudentSession.getTransaction().rollback();
			deleteStudentLogger.info(removeHibernateException+ " : \nStudent not found !!!");
		}

		return false;
	}
}
