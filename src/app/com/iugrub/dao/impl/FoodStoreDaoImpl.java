package app.com.iugrub.dao.impl;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import app.com.iugrub.dao.api.FoodStoreDaoAPI;
import app.com.iugrub.pojo.FoodStore;

public class FoodStoreDaoImpl implements FoodStoreDaoAPI{


	private static final Logger objLogger = Logger.getLogger(FoodStoreDaoImpl.class);
	
	@Autowired
	SessionFactory objSessionFactory;
	
	@Override
	public FoodStore getFoodStoreDetails(String strStoreId) {
		// TODO Auto-generated method stub
		Session objSession = objSessionFactory.openSession();
		Transaction tx = objSession.beginTransaction();
		
		FoodStore objStore = (FoodStore) objSession.get(FoodStore.class, strStoreId);
		/*Query objQuery = objSession.createQuery("from Offers where isNeverExpire = true or offerEndDate < :date");
		//SQLQuery objQuery = objSession.createSQLQuery("update Offers set OFFERENDDATE = :date where STOREID = :storeId");
		objQuery.setMaxResults(10);
		objQuery.setParameter("date", new Date());
		
		List<FoodStore> resultList = objQuery.list();*/
		objLogger.error(objStore);
		tx.commit();
		objSession.close();
		return objStore;
	}

}
