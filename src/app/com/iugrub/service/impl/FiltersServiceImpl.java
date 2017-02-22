package app.com.iugrub.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import app.com.iugrub.dao.api.FiltersDaoAPI;
import app.com.iugrub.dao.api.OffersDaoAPI;
import app.com.iugrub.pojo.Campus;
import app.com.iugrub.pojo.Cuisine;
import app.com.iugrub.pojo.FoodStore;
import app.com.iugrub.pojo.Offers;
import app.com.iugrub.service.api.FiltersServiceAPI;

public class FiltersServiceImpl implements FiltersServiceAPI {

	private static final Logger objLogger = Logger.getLogger(FiltersServiceImpl.class);
	
	@Autowired
	FiltersDaoAPI objFiltersDao;
	
	@Autowired
	OffersDaoAPI objOffersDao;
	
	@Override
	public List<Campus> getListOfAllCampuses() {
		// TODO Auto-generated method stub
		List<Campus> listCampuses = objFiltersDao.getListOfAllCampuses();
		return listCampuses;
	}

	@Override
	public List<FoodStore> getListOfAllFoodStores(String strCampusFilters) {
		// TODO Auto-generated method stub
		List<FoodStore> listFoodStores = new ArrayList<FoodStore>();
		if(strCampusFilters.isEmpty()) {
			
			listFoodStores = objFiltersDao.getListOfAllFoodCourts();
		} else {
			
			listFoodStores = objFiltersDao.getFilteredFoodCourts(strCampusFilters);
		}
		
		return listFoodStores;
	}

	@Override
	public List<Offers> getOffersForSelectedFoodStores(List<String> listFilters) {
		// TODO Auto-generated method stub
		List<Offers> listOfOffers = new ArrayList<Offers>();
		if(listFilters.isEmpty()) {
			listOfOffers = objOffersDao.getCurrentOffers();
		} else {
			
			listOfOffers = objOffersDao.getFilteredOffers(listFilters);
		}
		
		return listOfOffers;
	}

	@Override
	public List<Cuisine> getListOfAllCuisines() {
		// TODO Auto-generated method stub
		List<Cuisine> listCampuses = objFiltersDao.getListOfAllCuisines();
		return listCampuses;
	}

	@Override
	public Map<String, String> getAllOffersAndStoreId() {
		// TODO Auto-generated method stub
		Map<String, String> mapData = objOffersDao.getAllOffersAndStoreIds();
		return mapData;
	}

}
