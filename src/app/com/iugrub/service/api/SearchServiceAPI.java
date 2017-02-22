package app.com.iugrub.service.api;

import java.util.List;

public interface SearchServiceAPI {

	public List getSearchResults(String strSearchString, String strFilterBy);

	public void addData();
}
