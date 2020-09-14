package com.oehm4.LaptopProj.util;

import java.util.List;

import com.oehm4.LaptopProj.dao.HqlLaptopDAO;
import com.oehm4.LaptopProj.dao.LaptopDAO;
import com.oehm4.LaptopProj.dto.LaptopDTO;




public class App 
{
    public static void main( String[] args )
    {
        /* Saving Details by save method----------------------
        
    	LaptopDTO laptopDTO=new LaptopDTO();
    	laptopDTO.setBrand("Accer");
    	laptopDTO.setGp("intel,core i3,5thGen");
    	laptopDTO.setOs("Linux");
    	laptopDTO.setPrice(45000D);
    	laptopDTO.setRam("32gb");
    	LaptopDAO laptopDAO=new LaptopDAO();
    	laptopDAO.saveLaptopDetails(laptopDTO);
    	*/
    	
    	
    	/*Getting Details By update-----------------------
    	 * 
    	LaptopDAO laptopdao=new LaptopDAO();
    	LaptopDTO laptopDTO=laptopdao.getLaptopDetailsById(4L);
    	if(laptopDTO!=null)
    	{
    	
    		System.out.println(laptopDTO);
    	}
    	else
    	{
    		System.out.println("Invalid Id");
    	}
    	*/
    	
    	/* Update Details by update method
    	
    	LaptopDAO laptopdao=new LaptopDAO();
    	laptopdao.updatePriceById(4L, 55000.0);*/
    	
    	/* Getting Details by Hql-----------------
    	
    	
    	HqlLaptopDAO hqlLaptopDAO = new HqlLaptopDAO();
    	List<LaptopDTO> list=hqlLaptopDAO.getLaptopDetails();
    	list.forEach(obj->{
			System.out.println(obj);
		});
		*/
    	
    	/*Getting Details by Brand--------
    	HqlLaptopDAO hqllaptopDAO=new HqlLaptopDAO();
        LaptopDTO laptopDTO = hqllaptopDAO.getLaptopDetailsByBrand("Apple");
    	System.out.println(laptopDTO);
    	*/
    	
    	/*Update price by brand using hql----------
    	HqlLaptopDAO hqllaptopDAO=new HqlLaptopDAO();
        hqllaptopDAO.updatePriceByBrand("Lenevo", 100000D);
        */
    	
    	/*Delete LaptopDetails By Id-----------
    	HqlLaptopDAO hqllaptopDAO=new HqlLaptopDAO();
    	hqllaptopDAO.deleteLaptopDetailsByBrand("Accer");
    	*/
    	/*Retrive data using method by cache-----------
    	LaptopDAO laptopDAO = new LaptopDAO();
		LaptopDTO laptopDTO1 = laptopDAO.getLaptopDetailsById(1L);
		LaptopDTO laptopDTO2 = laptopDAO.getLaptopDetailsById(1L);
		System.out.println("LaptopDTO1" + laptopDTO1);
		System.out.println("LaptopDTO2" + laptopDTO2);
		*/
    	HqlLaptopDAO laptopDAO = new HqlLaptopDAO();
		List<LaptopDTO> laptopDetails1 = laptopDAO.getLaptopDetails();
		List<LaptopDTO> laptopDetails2 =laptopDAO.getLaptopDetails();
		System.out.println("size of LaptopDetails1 is "+laptopDetails1.size());
		System.out.println("size of LaptopDetails2 is "+laptopDetails2.size());
    }
}
