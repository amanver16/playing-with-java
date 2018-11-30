package com.aman.app.springrest.backend.hibernateutility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetSession {
	
	public SessionFactory getSession() {
		
		Configuration sessionConfiguration = new Configuration();
		sessionConfiguration.configure("/hibernate.cfg.xml");
		return sessionConfiguration.buildSessionFactory();
	}
}
