package app.com.iugrub.dao.api;

import java.util.List;

public interface SearchDaoAPI {

	public List getSearchResults(String strSearchString, String strFilterBy);

	public List getSearchResultsByCuisine(String strSearchString, String strFilterBy);
	
	public List getSearchResultsByItemName(String strSearchString, String strFilterBy);
	
	public List getSearchResultsByRestaurant(String strSearchString, String strFilterBy);

	public void addData();
}
