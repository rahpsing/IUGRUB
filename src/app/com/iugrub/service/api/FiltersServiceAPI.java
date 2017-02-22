package app.com.iugrub.service.api;

import java.util.List;
import java.util.Map;

import app.com.iugrub.pojo.Campus;
import app.com.iugrub.pojo.Cuisine;
import app.com.iugrub.pojo.FoodStore;
import app.com.iugrub.pojo.Offers;

public interface FiltersServiceAPI {

	public List<Campus> getListOfAllCampuses();
	
	public List<FoodStore> getListOfAllFoodStores(String strCampusFilters);

	public List<Offers> getOffersForSelectedFoodStores(List<String> listFilters);

	public List<Cuisine> getListOfAllCuisines();

	public Map<String, String> getAllOffersAndStoreId();
}
