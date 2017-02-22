package app.com.iugrub.dao.api;

import java.util.List;

import app.com.iugrub.pojo.Campus;
import app.com.iugrub.pojo.Cuisine;
import app.com.iugrub.pojo.FoodStore;

public interface FiltersDaoAPI {

	public List<Campus> getListOfAllCampuses();

	public List<FoodStore> getListOfAllFoodCourts();

	public List<FoodStore> getFilteredFoodCourts(String strCampusFilters);

	public List<Cuisine> getListOfAllCuisines();

}
