package web.com.iugrub.controller.foodStore;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import app.com.iugrub.pojo.FoodStore;
import app.com.iugrub.pojo.Offers;
import app.com.iugrub.service.api.FoodStoreServiceAPI;
import web.com.iugrub.controller.filters.FiltersController;

@Controller
public class FoodStoreController {

	private static final Logger objLogger = Logger.getLogger(FoodStoreController.class);
	
	@Autowired
	FoodStoreServiceAPI objFoodStoreService;
	
	@RequestMapping(value = "/visitStore")
	public void getFoodStorePage(HttpServletRequest request, HttpServletResponse response) {
		
		// get request parameters searchString, Filter By
		
		// call a service method to get search results
		String strStoreId = request.getParameter("storeId");
		strStoreId = "8a8080a358c306ff0158c3088f7a0000";
		FoodStore objStore = objFoodStoreService.getFoodStoreDetails(strStoreId);
		//return new ModelAndView("Test");
	}
	
	@RequestMapping(value = "/restaurants")
	public ModelAndView getAllRestaurantsPage(HttpServletRequest request, HttpServletResponse response) {
		
		// get request parameters searchString, Filter By
		
		// call a service method to get search results
		
		return new ModelAndView("all_restaurants");
	}
	
	@RequestMapping(value = "/outletData")
	public ModelAndView getRestaurantsPage(HttpServletRequest request, HttpServletResponse response) {
		
		// get request parameters searchString, Filter By
		
		// call a service method to get search results
		String id = request.getParameter("id");
		
		
		ModelAndView object = new ModelAndView("outlet");
		object.addObject("image", FiltersController.mapOutletToImage.get(FiltersController.mapStoreIdToName.get(id).getId()));
		object.addObject("objStore", FiltersController.mapStoreIdToName.get(id));
		
		
		return object;
	}
}
