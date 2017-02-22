package web.com.iugrub.controller.Campus;

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

@Controller
public class CampusController {

	private static final Logger objLogger = Logger.getLogger(CampusController.class);
	
	@Autowired
	FoodStoreServiceAPI objFoodStoreService;
	

	/*@RequestMapping(value = "/campuses")
	public ModelAndView getRestaurantsPage(HttpServletRequest request, HttpServletResponse response) {
		
		// get request parameters searchString, Filter By
		
		// call a service method to get search results
		
		return new ModelAndView("restaurants");
	}*/
}
