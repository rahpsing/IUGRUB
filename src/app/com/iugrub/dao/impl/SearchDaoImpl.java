package app.com.iugrub.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import app.com.iugrub.dao.api.SearchDaoAPI;
import app.com.iugrub.pojo.Campus;
import app.com.iugrub.pojo.Cuisine;
import app.com.iugrub.pojo.FoodItem;
import app.com.iugrub.pojo.FoodStore;
import app.com.iugrub.pojo.Offers;
import app.com.iugrub.pojo.StoreAddress;
import app.com.iugrub.pojo.StoreContactDetails;

@Repository
public class SearchDaoImpl implements SearchDaoAPI {

	private static final Logger objLogger = Logger.getLogger(SearchDaoImpl.class);
	
	@Autowired
	SessionFactory objSessionFactory;
	
	@Override
	public List getSearchResults(String strSearchString, String strFilterBy) {
		// TODO Auto-generated method stub
	
		return null;
	}

	@Override
	public List getSearchResultsByCuisine(String strSearchString, String strFilterBy) {
		// TODO Auto-generated method stub
		objLogger.error("I am printing");
		Session objSession = objSessionFactory.openSession();
		Transaction tx = objSession.beginTransaction();
		//Criteria objCriteria = objSession.createCriteria(FoodStore.class);
		SQLQuery objQuery = objSession.createSQLQuery("select * from FoodStore where id in(select storeid from Cuisine c "
				+ "where c.cuisineName = :data )");
		objQuery.setParameter("data", strSearchString);
		objQuery.addEntity(FoodStore.class);
		List<FoodStore> resultList = objQuery.list();
		
		for(FoodStore objStore : resultList) {
			objLogger.error(objStore.getListContactNumbers());
			objLogger.error(objStore.getObjStoreAddress());
			objLogger.error(objStore.getListOfItems());
			objLogger.error(objStore.getListCuisines());
		}
		tx.commit();
		objSession.close();
		return resultList;
		
		//return null;
	}

	@Override
	public List getSearchResultsByItemName(String strSearchString, String strFilterBy) {
		// TODO Auto-generated method stub
		Session objSession = objSessionFactory.openSession();
		Transaction tx = objSession.beginTransaction();
		/*Criteria criteria = objSession.createCriteria(FoodItem.class);
		criteria.add(Restrictions.like("strItemName", strSearchString));
		criteria.setProjection(Projections.projectionList().add(Projections.property("objFoodStore")));
		//criteria.setResultTransformer(Transformers.aliasToBean(FoodStore.class));
		
		List<String> data = criteria.list();*/
		SQLQuery objQuery = objSession.createSQLQuery("select * from FoodStore where id in(select storeId from FoodItem f "
				+ "where f.itemName like :data)");
		objQuery.setParameter("data", "%"+strSearchString+"%");
		objQuery.addEntity(FoodStore.class);
		List<FoodStore> resultList = objQuery.list();
		
		for(FoodStore objStore : resultList) {
			objLogger.error(objStore.getListContactNumbers());
			objLogger.error(objStore.getObjStoreAddress());
			objLogger.error(objStore.getListOfItems());
			objLogger.error(objStore.getListCuisines());
		}
		tx.commit();
		objSession.close();
		return resultList;
	}

	@Override
	public List getSearchResultsByRestaurant(String strSearchString, String strFilterBy) {
		// TODO Auto-generated method stub
		Session objSession = objSessionFactory.openSession();
		Transaction tx = objSession.beginTransaction();
		
		SQLQuery objQuery = objSession.createSQLQuery("select * from FoodStore where storeName like :data");
		objQuery.setParameter("data", "%"+strSearchString+"%");
		objQuery.addEntity(FoodStore.class);
		List<FoodStore> resultList = objQuery.list();
		
		for(FoodStore objStore : resultList) {
			objLogger.error(objStore.getListContactNumbers());
			objLogger.error(objStore.getObjStoreAddress());
			objLogger.error(objStore.getListOfItems());
			objLogger.error(objStore.getListCuisines());
		}
		tx.commit();
		objSession.close();
		return resultList;
	}

	@Override
	public void addData() {
		// TODO Auto-generated method stub
		Session session = objSessionFactory.openSession();

		Transaction tx = session.beginTransaction();
		
		FoodStore objStore = new FoodStore();
		objStore.setStrStoreName("The TRAVELLER");
		
/*		Cuisine objCuisine = new Cuisine();
		objCuisine.setStrCuisineName("Chinese");*/
		
		Cuisine objCuisine2 = new Cuisine();
		objCuisine2.setStrCuisineName("Latino");
		
		List<Cuisine> objList  = new ArrayList<Cuisine>();
		//objList.add(objCuisine);
		objList.add(objCuisine2);
		
		StoreContactDetails objContacts = new StoreContactDetails();
		objContacts.setStrWebSiteLink("www.google.com");
		List<String> lstContacts = new ArrayList<String>();
		lstContacts.add("(812) 855-0100");
		objContacts.setContacts(lstContacts);
		
		
		List<StoreContactDetails> lstStoreContacts = new ArrayList();
		lstStoreContacts.add(objContacts);
		
		FoodItem item1 = new FoodItem();
		item1.setObjCuisine(objCuisine2);
		item1.setPrice(75);
		item1.setStrItemName("CHICKEN AND CHORIZO PAELLA");
		//item1.setObjFoodStore(objStore);
		
		FoodItem item2 = new FoodItem();
		item2.setObjCuisine(objCuisine2);
		item2.setPrice(85);
		item2.setStrItemName("MOZARELLA & TOMATO SANDWICHES");
	//	item2.setObjFoodStore(objStore);
		
		List<FoodItem> lstFoodItems = new ArrayList();
		lstFoodItems.add(item1);
		lstFoodItems.add(item2);
		
		Campus objCampus = new Campus();
		objCampus.setStrBuildingAddress("");
		objCampus.setStrCampusBuilding("Indiana Memorial Union");
		
		
		StoreAddress objAddress = new StoreAddress();
		objAddress.setAddressLine("IU Building");
		objAddress.setObjCampus(objCampus);
		objAddress.setObjFoodStore(objStore);
		
		Offers objOffers = new Offers();
		objOffers.setStrOfferName("GARBONZO CON ESPINACAS FREE FOR JUST 3$");
		objOffers.setStrOfferDetails("GARBONZO CON ESPINACAS FREE FOR JUST 3$");
		objOffers.setIsNeverExpire(true);
		
/*		Offers objOffers2 = new Offers();
		objOffers.setStrOfferDetails("$3 for $12 BURRITOS + any drink");
		objOffers2.setStrOfferName("$3 for $12 BURRITOS + any drink");
		objOffers2.setIsNeverExpire(true);*/
		
		List<Offers> listOffers = new ArrayList<Offers>();
		listOffers.add(objOffers);
		//listOffers.add(objOffers2);
		
		objStore.setListCuisines(objList);
		objStore.setListContactNumbers(lstStoreContacts);
		objStore.setListOfItems(lstFoodItems);
		objStore.setListOfOffers(listOffers);
		objStore.setObjStoreAddress(objAddress);
		
		session.saveOrUpdate(objStore);
		tx.commit();
		
		session.close();
	}

}
