package app.com.iugrub.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import app.com.iugrub.dao.api.FoodStoreDaoAPI;
import app.com.iugrub.pojo.FoodStore;
import app.com.iugrub.service.api.FoodStoreServiceAPI;

public class FoodStoreServiceImpl implements FoodStoreServiceAPI {

	private static final Logger objLogger = Logger.getLogger(FoodStoreServiceImpl.class);
	
	@Autowired
	FoodStoreDaoAPI objFoodStoreDao;
	
	@Override
	public FoodStore getFoodStoreDetails(String strStoreId) {
		// TODO Auto-generated method stub
		objFoodStoreDao.getFoodStoreDetails(strStoreId);
		return null;
	}

}
