package web.com.iugrub.controller.offers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import app.com.iugrub.pojo.Campus;
import app.com.iugrub.pojo.Offers;
import app.com.iugrub.service.api.OffersServiceAPI;
import app.com.iugrub.service.api.SearchServiceAPI;
import app.com.iugrub.service.impl.OffersServiceImpl;

@Controller
public class OffersController {

	private static final Logger objLogger = Logger.getLogger(OffersController.class);
	
	@Autowired
	OffersServiceAPI objOffersService;
	
	@RequestMapping(value = "/trendingOffers")
	public void getTopOffers(HttpServletRequest request, HttpServletResponse response) {
		
		// get request parameters searchString, Filter By
		
		// call a service method to get search results
		List<Offers> lstOffers = objOffersService.getTrendingOffers();
		//return new ModelAndView("Test");
	}
	
	@RequestMapping(value = "/offers")
	public ModelAndView getOffers(HttpServletRequest request, HttpServletResponse response) {
		
		// get request parameters searchString, Filter By
		
		// call a service method to get search results
		//List<Offers> lstOffers = objOffersService.getTrendingOffers();
		return new ModelAndView("Offers");
	}
	
	/*@RequestMapping(value = "/filters/campuses")
	public void getAllCampusBuildings(HttpServletRequest request, HttpServletResponse response) {
		
		// get request parameters searchString, Filter By
		
		// call a service method to get search results
		List<Campus> lstOffers = objOffersService.getAllCampusBuildings();
		//return new ModelAndView("Test");
	}*/
}
