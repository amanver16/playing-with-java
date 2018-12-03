package com.aman.springmvc.student.service;

import com.aman.springmvc.student.backend.hibernateutility.GetSession;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean login(String username, String password) {

        String sqlQuery = "FROM StudentBean WHERE USERNAME = :USERNAME AND PASSWORD = :PASSWORD";
        GetSession getSession = new GetSession();
        Session session = getSession.getSession().openSession();
        session.beginTransaction();

        try {

            Query query = session.createQuery(sqlQuery);
            query.setParameter("USERNAME", username);
            query.setParameter("PASSWORD", password);
            Object object = query.uniqueResult();

            if (object != null) {
                return true;
            }

            session.getTransaction().commit();
            session.close();

        } catch (HibernateException hibernateException) {
            session.getTransaction().rollback();
            System.out.println(hibernateException + " : Login failed !!!");
        }

        return false;
    }

}