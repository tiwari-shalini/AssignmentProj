package com.oehm4.LaptopProj.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MySessionFactory 
{
	private static SessionFactory sessionFactory=null;
	private MySessionFactory()
	{
	}
	public static SessionFactory createSessionFactory() {
		if(sessionFactory==null)
			sessionFactory=new Configuration().configure().buildSessionFactory();
		return sessionFactory;
	}
}
