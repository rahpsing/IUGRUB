package app.com.iugrub.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import app.com.iugrub.dao.api.FiltersDaoAPI;
import app.com.iugrub.pojo.Campus;
import app.com.iugrub.pojo.Cuisine;
import app.com.iugrub.pojo.FoodStore;

public class FiltersDaoImpl implements FiltersDaoAPI{


	private static final Logger objLogger = Logger.getLogger(FiltersDaoImpl.class);
	
	@Autowired
	SessionFactory objSessionFactory;
	
	@Override
	public List<Campus> getListOfAllCampuses() {
		// TODO Auto-generated method stub
		Session objSession = objSessionFactory.openSession();
		Transaction tx = objSession.beginTransaction();
		
		Query objQuery = objSession.createQuery("from Campus");
	
		
		List<Campus> resultList = objQuery.list();
		objLogger.error(resultList);
		tx.commit();
		objSession.close();
		return resultList;
	}
	
	@Override
	public List<Cuisine> getListOfAllCuisines() {
		// TODO Auto-generated method stub
		Session objSession = objSessionFactory.openSession();
		Transaction tx = objSession.beginTransaction();
		
		Query objQuery = objSession.createQuery("from Cuisine");
	
		
		List<Cuisine> resultList = objQuery.list();
		objLogger.error(resultList);
		tx.commit();
		objSession.close();
		return resultList;
	}

	@Override
	public List<FoodStore> getListOfAllFoodCourts() {
		// TODO Auto-generated method stub
		List<FoodStore> resultList = new ArrayList<FoodStore>();
		Session objSession = null;
		try {
		objSession = objSessionFactory.openSession();
		Transaction tx = objSession.beginTransaction();
		
		Query objQuery = objSession.createQuery("from FoodStore");
	
		
		resultList = objQuery.list();
		objLogger.error(resultList);
		tx.commit();
		objSession.close();
		} catch (Exception e) {
			objLogger.error(e,e);
		} finally {
			if(objSession.isOpen())
			objSession.close();
		}
		return resultList;
	}

	@Override
	public List<FoodStore> getFilteredFoodCourts(String strCampusFilters) {
		// TODO Auto-generated method stub
		Session objSession = objSessionFactory.openSession();
		Transaction tx = objSession.beginTransaction();
		List listOfCampuses = new ArrayList<>();
		Query objQuery = objSession.createQuery("from FoodStore f where f.objStoreAddress.objCampus.strCampusBuilding in (:data)");
		objQuery.setParameterList("data", listOfCampuses);
		
		List<FoodStore> resultList = objQuery.list();
		objLogger.error(resultList);
		tx.commit();
		objSession.close();
		return resultList;
	}

}
