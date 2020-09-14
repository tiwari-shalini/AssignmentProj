package com.oehm4.LaptopProj.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.oehm4.LaptopProj.dto.LaptopDTO;


public class HqlLaptopDAO 
{ 
	public List<LaptopDTO> getLaptopDetails()
	{
		Session session=MySessionFactory.createSessionFactory().openSession();
		String hql="from LaptopDTO";
		Query query = session.createQuery(hql);
		List<LaptopDTO> list = query.list();
		return list;
	}
	public LaptopDTO getLaptopDetailsByBrand(String brand) 
	{
		Session session = MySessionFactory.createSessionFactory().openSession();
		String hql="from LaptopDTO where brand=:lBrand";
		Query query = session.createQuery(hql);
		query.setParameter("lBrand", brand );
		LaptopDTO uniqueResult = (LaptopDTO) query.uniqueResult();
		return uniqueResult;
	}
	public void updatePriceByBrand(String brand,Double newPrice) {
		Session session = MySessionFactory.createSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		String hql="update LaptopDTO set price=:newPrice where brand=:brand";
		Query query = session.createQuery(hql);
		query.setParameter("newPrice", newPrice);
		query.setParameter("brand", brand);
		int updateRows = query.executeUpdate();
		transaction.commit();
		if(updateRows == 0) {
			System.out.println("Update Operation Failed");
			return;
		}
		System.out.println("Update Operation successfull");
	}
	public void deleteLaptopDetailsByBrand(String brand) {
		
		Session session = MySessionFactory.createSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		String hql="delete LaptopDTO where brand=:brand";
		Query query = session.createQuery(hql);
		query.setParameter("brand", brand);
		int updateRows = query.executeUpdate();
		transaction.commit();
		if(updateRows == 0) {
			System.out.println("Delete Operation Failed");
			return;
		}
		System.out.println("Delete Operation successfull");
	}
}
