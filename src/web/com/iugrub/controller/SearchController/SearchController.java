package web.com.iugrub.controller.SearchController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import app.com.iugrub.service.api.SearchServiceAPI;

@Controller
public class SearchController {

	@Autowired
	SearchServiceAPI objSearchService;
	
	@RequestMapping(value = "/search")
	public void getSearchResults(HttpServletRequest request, HttpServletResponse response) {
		
		// get request parameters searchString, Filter By
		String strSearchString = request.getParameter("SEARCH_TEXT");
		String strFilterBy  = request.getParameter("filterBy");
		//strSearchString = "Den";
		strFilterBy = "Restaurant";
		// call a service method to get search results
		objSearchService.getSearchResults(strSearchString, strFilterBy);
		//return new ModelAndView("Test");
	}
}
