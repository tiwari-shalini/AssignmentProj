package com.oehm4.LaptopProj.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.oehm4.LaptopProj.dto.LaptopDTO;



public class LaptopDAO 
{
	public void saveLaptopDetails(LaptopDTO laptopDTO)
	{
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(LaptopDTO.class);
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();	
		Transaction transaction=session.beginTransaction();
		session.save(laptopDTO);
		transaction.commit();
	}
	public LaptopDTO getLaptopDetailsById(Long id)
	{ 
//		Configuration configuration=new Configuration();
//		configuration.configure();
//		configuration.addAnnotatedClass(LaptopDTO.class);
		Session session=MySessionFactory.createSessionFactory().openSession();
		return session.get(LaptopDTO.class,id);
		
	}
	public void updatePriceById(Long id,Double price)
	{
		LaptopDTO laptopDTO=getLaptopDetailsById(id);
		if(laptopDTO!=null)
		{
		/*Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(LaptopDTO.class);
		SessionFactory sessionFactory=configuration.buildSessionFactory();*/
		Session session=MySessionFactory.createSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		laptopDTO.setPrice(price);
		session.update(laptopDTO);
		transaction.commit();
		}
		else
		{
			System.out.println("Price updation failed");
		}
		
	}
}
