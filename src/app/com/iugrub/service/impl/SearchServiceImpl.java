package app.com.iugrub.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.com.iugrub.dao.api.SearchDaoAPI;
import app.com.iugrub.dao.impl.SearchDaoImpl;
import app.com.iugrub.pojo.FoodStore;
import app.com.iugrub.service.api.SearchServiceAPI;
import app.com.iugrub.util.Constants;

@Transactional
@Service("objSearchService")
public class SearchServiceImpl implements SearchServiceAPI {

	private static final Logger objLogger = Logger.getLogger(SearchServiceImpl.class);
	
	@Autowired
	SearchDaoAPI objSearchDao;
	
	@Override
	public List getSearchResults(String strSearchString, String strFilterBy) {
		// TODO Auto-generated method stub
		List<FoodStore> listSearchResults = new ArrayList();
		if(strFilterBy.equalsIgnoreCase(Constants.Cuisine)) {
			
			listSearchResults = objSearchDao.getSearchResultsByCuisine(strSearchString, strFilterBy);
			
		} else if(strFilterBy.equalsIgnoreCase(Constants.FoodItem)) {
			
			listSearchResults = objSearchDao.getSearchResultsByItemName(strSearchString, strFilterBy);
			
		} if(strFilterBy.equalsIgnoreCase(Constants.Restaurant)) {
			
			listSearchResults = objSearchDao.getSearchResultsByRestaurant(strSearchString, strFilterBy);
			
		}
		
		objLogger.error("From service:");
	/*	for(FoodStore objStore : listSearchResults) {
			objLogger.error(objStore.getListContactNumbers());
			objLogger.error(objStore.getObjStoreAddress());
			objLogger.error(objStore.getListOfItems());
			objLogger.error(objStore.getListCuisines());
		}*/
		// this will call dao object
		return listSearchResults;
	}

	@Override
	public void addData() {
		
		objSearchDao.addData();
	}
}
