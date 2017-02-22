package app.com.iugrub.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import app.com.iugrub.dao.api.OffersDaoAPI;
import app.com.iugrub.dao.api.SearchDaoAPI;
import app.com.iugrub.pojo.Offers;
import app.com.iugrub.service.api.OffersServiceAPI;

public class OffersServiceImpl implements OffersServiceAPI {

	private static final Logger objLogger = Logger.getLogger(OffersServiceImpl.class);
	
	@Autowired
	OffersDaoAPI objOffersDao;
	
	@Override
	public List<Offers> getTrendingOffers() {
		// TODO Auto-generated method stub
		List<Offers> listOffers = objOffersDao.getCurrentOffers();
		return listOffers;
	}

}
