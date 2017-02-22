package app.com.iugrub.dao.api;

import java.util.List;
import java.util.Map;

import app.com.iugrub.pojo.Offers;

public interface OffersDaoAPI {

	public List<Offers> getCurrentOffers();

	public List<Offers> getFilteredOffers(List<String> listStoreIds);

	Map<String, String> getAllOffersAndStoreIds();
}
