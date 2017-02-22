package app.com.iugrub.pojo;

import java.io.Serializable;
import java.util.List;

public class WebUser extends User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String strDisplayName;
	private List<Review> listReviews;
	
	public String getStrDisplayName() {
		return strDisplayName;
	}
	public void setStrDisplayName(String strDisplayName) {
		this.strDisplayName = strDisplayName;
	}
	public List<Review> getListReviews() {
		return listReviews;
	}
	public void setListReviews(List<Review> listReviews) {
		this.listReviews = listReviews;
	}
	@Override
	public String toString() {
		return "WebUser [displayName=" + strDisplayName + ", listReviews=" + listReviews + "]";
	}



	
	
}
