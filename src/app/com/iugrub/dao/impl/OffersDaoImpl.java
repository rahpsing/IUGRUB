package app.com.iugrub.dao.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import app.com.iugrub.dao.api.OffersDaoAPI;
import app.com.iugrub.pojo.Offers;

public class OffersDaoImpl implements OffersDaoAPI {


	private static final Logger objLogger = Logger.getLogger(OffersDaoImpl.class);
	
	@Autowired
	SessionFactory objSessionFactory;

	@Override
	public List<Offers> getCurrentOffers() {
		// TODO Auto-generated method stub
		Session objSession = objSessionFactory.openSession();
		Transaction tx = objSession.beginTransaction();
		
		Query objQuery = objSession.createQuery("from Offers where isNeverExpire = true");
		//SQLQuery objQuery = objSession.createSQLQuery("update Offers set OFFERENDDATE = :date where STOREID = :storeId");
		objQuery.setMaxResults(10);
	//	objQuery.setParameter("date", new Date());
		
		List<Offers> resultList = objQuery.list();
		
		tx.commit();
		objSession.close();
		return resultList;
	}
	

	@Override
	public List<Offers> getFilteredOffers(List<String> listStoreIds) {
		// TODO Auto-generated method stub
		Session objSession = objSessionFactory.openSession();
		Transaction tx = objSession.beginTransaction();
		Query objQuery = null;
		
		if(listStoreIds.isEmpty()) {
			
			objQuery = objSession.createQuery("from Offers where isNeverExpire = true");
			objQuery.setMaxResults(10);
		} else {
			objQuery = objSession.createQuery("from Offers where storeId in (:list) and isNeverExpire = true or offerEndDate < :date");
			//SQLQuery objQuery = objSession.createSQLQuery("update Offers set OFFERENDDATE = :date where STOREID = :storeId");
			objQuery.setMaxResults(10);
			objQuery.setParameterList("list", listStoreIds);
			objQuery.setParameter("date", new Date());
		}
	
		
		List<Offers> resultList = objQuery.list();
		
		tx.commit();
		objSession.close();
		return resultList;
	}
	
	@Override
	public Map<String, String> getAllOffersAndStoreIds() {
		// TODO Auto-generated method stub
		Session objSession = objSessionFactory.openSession();
		Transaction tx = objSession.beginTransaction();
		Map<String, String> mapOfferIdToSToreId = new HashMap<>();
		//Query objQuery = objSession.createQuery("from Offers where isNeverExpire = true or offerEndDate < :date");
		SQLQuery objQuery = objSession.createSQLQuery("select id,storeId from Offers");
		objQuery.setMaxResults(10);
		List<Object[]> resultList = objQuery.list();
		
		for(Object[] row : resultList){
           mapOfferIdToSToreId.put(row[0].toString(), row[1].toString());
        }
		tx.commit();
		objSession.close();
		return mapOfferIdToSToreId;
	}
	
/*	@Override
	public List<Offers> updateOffers() {
		// TODO Auto-generated method stub
		Session objSession = objSessionFactory.openSession();
		Transaction tx = objSession.beginTransaction();
		
SQLQuery objQuery = objSession.createSQLQuery("update Offers set OFFERDETAILS ='$3 for $12 BURRITOS + any drink' where STOREID = '0c363bee58d0b1cd0158d0b1ea720007'");
	
		
		List<Offers> resultList = objQuery.list();
		
		tx.commit();
		objSession.close();
		return resultList;
	}*/

}
