package com.aman.springmvc.student.service;

import com.aman.springmvc.student.backend.hibernateutility.GetSession;
import com.aman.springmvc.student.bean.StudentBean;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

@Service
public class SearchStudentService {

    public StudentBean searchStudent(Integer searchId) {

        GetSession getSession = new GetSession();
        Session session = getSession.getSession().openSession();
        session.beginTransaction();
        StudentBean studentBean = null;

        try {
            studentBean = (StudentBean) session.get(StudentBean.class, searchId);
            session.getTransaction().commit();
            session.close();
        } catch (HibernateException updateHibernateException) {
            session.getTransaction().rollback();
            System.out.println(updateHibernateException + " : \nStudent doesn't exist !!!");
        }

        return studentBean;
    }

}