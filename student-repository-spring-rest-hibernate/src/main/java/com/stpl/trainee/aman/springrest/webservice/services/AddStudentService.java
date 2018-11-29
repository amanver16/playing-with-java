package com.stpl.trainee.aman.springrest.webservice.services;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

import com.stpl.trainee.aman.springrest.backend.hibernateutility.GetSession;
import com.stpl.trainee.aman.springrest.webservice.beans.StudentBean;



@Service
public class AddStudentService {
	private final Logger insertLogger = LogManager.getLogger(AddStudentService.class);

	public boolean addStudentService(StudentBean insertStudentBean) {

		GetSession getSession = new GetSession();
		Session insertSession = getSession.getSession().openSession();
		insertSession.beginTransaction();

		try {
			insertSession.save(insertStudentBean);
			insertSession.getTransaction().commit();
			insertSession.close();
			
			if (insertStudentBean != null) {
				return true;
			}

		} catch (HibernateException insertHibernateException) {

			insertSession.getTransaction().rollback();
			insertLogger.info(insertHibernateException+ " : \nStudent Already avilable");
		}

		return false;
	}
}
