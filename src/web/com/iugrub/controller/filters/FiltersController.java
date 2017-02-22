package web.com.iugrub.controller.filters;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import app.com.iugrub.pojo.Campus;
import app.com.iugrub.pojo.Cuisine;
import app.com.iugrub.pojo.FoodStore;
import app.com.iugrub.pojo.Offers;
import app.com.iugrub.service.api.FiltersServiceAPI;
import app.com.iugrub.service.api.OffersServiceAPI;
import app.com.iugrub.service.api.SearchServiceAPI;
import app.com.iugrub.service.impl.OffersServiceImpl;

@Controller("/filters")
public class FiltersController {

	private static final Logger objLogger = Logger.getLogger(FiltersController.class);
	
	@Autowired
	FiltersServiceAPI objFiltersService;
	
	public static Map<String,Set<FoodStore>> mapCuisine = new HashMap<String,Set<FoodStore>>();
	public static Map<String,FoodStore> mapStoreIdToName = new HashMap<String,FoodStore>();
	public static Map<String,String> mapOfferIdToStoreId = new HashMap<String,String>();
	public static Map<FoodStore,Offers> mapStoreToOffers = new HashMap<FoodStore,Offers>();
	public static Map<String,String> mapOutletToImage = new HashMap<String,String>();
	
	@RequestMapping(value = "/initialize")
	public void getAllData(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// get request parameters searchString, Filter By
		String strCampusFilters = "";
		// call a service method to get search results
		List<FoodStore> listFoodStores = objFiltersService.getListOfAllFoodStores(strCampusFilters);
		
		StringBuilder objResponse = new StringBuilder();
		for(FoodStore objStore : listFoodStores) {
			
			mapStoreIdToName.put(objStore.getId(), objStore);
			
		}

		mapOfferIdToStoreId = objFiltersService.getAllOffersAndStoreId();
		List<Offers> listOffers = objFiltersService.getOffersForSelectedFoodStores(new ArrayList<>());
		
		for(Offers objOffer : listOffers) {
			
			mapStoreToOffers.put(mapStoreIdToName.get(mapOfferIdToStoreId.get(objOffer.getId())), objOffer);
		}
		
		mapOutletToImage.put("0c363bee58d0b1cd0158d0b1ea490000", "bajafresh.png");
		mapOutletToImage.put("0c363bee58d0b45e0158d0b465a00000", "cremaDolce.png");
		mapOutletToImage.put("0c363bee58d0b68f0158d0b6aedf0000", "cyclonesalads.png");
		mapOutletToImage.put("0c363bee58d0b8600158d0b874290000", "panino-mio.png");
		mapOutletToImage.put("0c363bee58d0ba920158d0bac1f60000", "traveller1.png");
		
	}
	
	
	@RequestMapping(value = "/campuses")
	public void getAllCampusBuildings(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// get request parameters searchString, Filter By
		
		// call a service method to get search results
		List<Campus> listCampuses = objFiltersService.getListOfAllCampuses();
		
		StringBuilder objResponse = new StringBuilder();
		for(Campus objCampus : listCampuses) {
			
			objResponse.append("<div class='panel-body'>")
			.append(objCampus.getStrCampusBuilding()).append("<label class='custom-control custom-checkbox pull-right'>")
			.append(" <input type='checkbox' class='custom-control-input campusSelection'"
					+ " id = "+objCampus.getId()+">")
			.append("<span class='custom-control-indicator' onclick='javascript:campusSelect(this);' ></span>")
			.append(" </label> </div>");
			
		}

		response.getWriter().write(objResponse.toString());
		
		//return new ModelAndView("Test");
	}
	
	@RequestMapping(value = "/foodStores")
	public void getAllFoodStores(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// get request parameters searchString, Filter By
		String strCampusFilters = request.getParameter("campusFilters")==null ? "" :  request.getParameter("campusFilters");
		// call a service method to get search results
		List<FoodStore> listFoodStores = objFiltersService.getListOfAllFoodStores(strCampusFilters);
		
		StringBuilder objResponse = new StringBuilder();
		for(FoodStore objStore : listFoodStores) {
			
			objResponse.append("<div class='panel-body'>")
			.append(objStore.getStrStoreName()).append("<label class='custom-control custom-checkbox pull-right'>")
			.append(" <input type='checkbox' class='custom-control-input storeSelection'"
					+ " id = "+objStore.getId()+" onclick='javascript:storeSelect(this);'>")
			.append("<span class='custom-control-indicator'></span>")
			.append(" </label> </div>");
			
		}

		response.getWriter().write(objResponse.toString());
		
	}
	
	@RequestMapping(value = "/filteredOffers")
	public void getFilteredOffers(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// get request parameters searchString, Filter By;
		String[] strStoreFilters = request.getParameterValues("STORE_SELECTION[]")==null? new String[1] :request.getParameterValues("STORE_SELECTION[]");
		List<String> listFilters;
		if(request.getParameterValues("STORE_SELECTION[]")==null) {
			
			listFilters = new ArrayList();
		} else {
			listFilters = Arrays.asList(strStoreFilters);
		}
	
		String strCampusFilters = request.getParameter("CAMPUS_SELECTION");
		// call a service method to get search results
		List<Offers> listOffers = objFiltersService.getOffersForSelectedFoodStores(listFilters);
		
		StringBuilder objResponse = new StringBuilder();
		for(Offers objOffer : listOffers) {
		
			objResponse.append("<div class='panel panel-default'>")
			.append("<div class='panel-heading'><a href='outletData?id="+mapOfferIdToStoreId.get(objOffer.getId())+"'>"+mapStoreIdToName.get(mapOfferIdToStoreId.get(objOffer.getId())).getStrStoreName()+"</a></div>")
			.append(" <div class='panel-body'>").append(objOffer.getStrOfferName())
			.append("<br>")
			.append(objOffer.getStrOfferDetails()).append("</div></div>");
		}
		response.getWriter().write(objResponse.toString());
	}
	
	
	@RequestMapping(value = "/filters/cuisines")
	public void getAllCuisines(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// get request parameters searchString, Filter By
		
		// call a service method to get search results
		List<Cuisine> listCampuses = objFiltersService.getListOfAllCuisines();
		
		StringBuilder objResponse = new StringBuilder();
		for(Cuisine objCuisine : listCampuses) {
			
			objResponse.append("<div class='panel-body'>")
			.append(objCuisine.getStrCuisineName()).append("<label class='custom-control custom-checkbox pull-right'>")
			.append(" <input type='checkbox' class='custom-control-input cuisineSelection'"
					+ " id = "+objCuisine.getId()+"  onclick='javascript:cuisineSelect(this);'>")
			.append("<span class='custom-control-indicator' ></span>")
			.append(" </label> </div>");
			
		}

		response.getWriter().write(objResponse.toString());
		
		//return new ModelAndView("Test");
	}
	
	@RequestMapping(value = "/restaurants/foodStores")
	public void getAllFoodStoresForRestaurantsPage(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// get request parameters searchString, Filter By
		String strCampusFilters = request.getParameter("campusFilters")==null ? "" :  request.getParameter("campusFilters");
		// call a service method to get search results
		List<FoodStore> listFoodStores = objFiltersService.getListOfAllFoodStores(strCampusFilters);
		
		StringBuilder objResponse = new StringBuilder();
		for(FoodStore objStore : listFoodStores) {
			
			objResponse.append("<div class='panel panel-success'>")
			.append(" <div class='panel-heading'><b>"+"<a href='outletData?id="+objStore.getId()+"'>"+objStore.getStrStoreName()+"</a></b></div>")
			.append("<div class='panel-body'></div>")
			.append(" <span class='glyphicon glyphicon-star pull-right manage-right'></span>")
			.append(" <span class='glyphicon glyphicon-star pull-right manage-right'></span>")
			.append("  <span class='glyphicon glyphicon-star pull-right manage-right'></span>")
			.append(" <span class='glyphicon glyphicon-star pull-right manage-right'></span>")
			.append(" <p class='link-align'><i>");
			
			for(Cuisine objCuisine : objStore.getListCuisines())
				objResponse.append(" &nbsp;&nbsp;"+objCuisine.getStrCuisineName());
			
			objResponse.append("</i></p>")
			.append("<a href='www.bk.com' class='link-align'>"+""+"</a>")
			.append("</div>");
	       
		}

		response.getWriter().write(objResponse.toString());
		
		populateMap(listFoodStores);
		
	}

	private void populateMap(List<FoodStore> listFoodStores) {
		// TODO Auto-generated method stub
		List<Cuisine> listCuisines = objFiltersService.getListOfAllCuisines();
		
		for(Cuisine objCuisine : listCuisines) {
			mapCuisine.put(objCuisine.getId(), new HashSet<FoodStore>());
		}
		
		for(FoodStore objFoodStore : listFoodStores) {
			
			List<Cuisine> listCuisine = objFoodStore.getListCuisines();
			for(Cuisine objCuisine : listCuisines) {
				
				mapCuisine.get(objCuisine.getId()).add(objFoodStore);
			}
			
		}
	}
	
	
	@RequestMapping(value = "/filters/foodStores")
	public void getFilteredFoodStoresForRestaurantsPage(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// get request parameters searchString, Filter By
		String strCuisineFilters[] = request.getParameterValues("CUISINE_SELECTION[]")==null ? new String[1] :  request.getParameterValues("CUISINE_SELECTION[]");
		// call a service method to get search results
		List<String> listFilters;
		if(request.getParameterValues("CUISINE_SELECTION[]")==null) {
			
			listFilters = new ArrayList();
		} else {
			listFilters = Arrays.asList(strCuisineFilters);
		}
	
		Set<FoodStore> setOfFoodStores = new HashSet<FoodStore>();
		for(String strCuisineId : listFilters) {
			setOfFoodStores.addAll(mapCuisine.get(strCuisineId));
		}
		
		StringBuilder objResponse = new StringBuilder();
		for(FoodStore objStore : setOfFoodStores) {
			
			objResponse.append("<div class='panel panel-success'>")
			.append(" <div class='panel-heading'><b>"+"<a href='outletData?id="+objStore.getId()+"'>"+objStore.getStrStoreName()+"</a></b></div>")
			.append("<div class='panel-body'></div>")
			.append(" <span class='glyphicon glyphicon-star pull-right manage-right'></span>")
			.append(" <span class='glyphicon glyphicon-star pull-right manage-right'></span>")
			.append("  <span class='glyphicon glyphicon-star pull-right manage-right'></span>")
			.append(" <span class='glyphicon glyphicon-star pull-right manage-right'></span>")
			.append(" <p class='link-align'><i>");
			
			for(Cuisine objCuisine : objStore.getListCuisines())
				objResponse.append(" &nbsp;&nbsp;"+objCuisine.getStrCuisineName());
			
			objResponse.append("</i></p>")
			.append("<a href='www.bk.com' class='link-align'>"+""+"</a>")
			.append("</div>");
	       
		}

		response.getWriter().write(objResponse.toString());
		
		
	}
}
