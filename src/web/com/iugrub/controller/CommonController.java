package web.com.iugrub.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import app.com.iugrub.pojo.FoodStore;
import app.com.iugrub.service.api.SearchServiceAPI;
import web.com.iugrub.controller.filters.FiltersController;

@Controller
public class CommonController {

	@Autowired
	SearchServiceAPI objSearchService;
	
	@RequestMapping(value = "/home")
	public ModelAndView getHome(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView model = new ModelAndView("IUGrubHome");
		Set<FoodStore> setObjStore = FiltersController.mapStoreToOffers.keySet();
		
		Map<String,FoodStore> mapOfferToFoodStore = new HashMap<>();
		
		for(FoodStore objStore : setObjStore) {
			
			mapOfferToFoodStore.put(FiltersController.mapStoreToOffers.get(objStore).getStrOfferDetails(), objStore);
		}
		
		model.addObject("mapOfferToFoodStore", mapOfferToFoodStore);
	//	for(FoodStore objStore)
		return model;
	}
	
	@RequestMapping(value = "/addData")
	public void addData(HttpServletRequest request, HttpServletResponse response) {
		
		objSearchService.addData();
	}
	
	@RequestMapping(value = "/contact")
	public ModelAndView contactPage(HttpServletRequest request, HttpServletResponse response) {
		
		return new ModelAndView("contact");
	}
}
