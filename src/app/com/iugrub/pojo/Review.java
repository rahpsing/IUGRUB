package app.com.iugrub.pojo;

import java.io.Serializable;

public class Review implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String strReview;
	private int ratingCount;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getStrReview() {
		return strReview;
	}
	public void setStrReview(String strReview) {
		this.strReview = strReview;
	}
	public int getRatingCount() {
		return ratingCount;
	}
	public void setRatingCount(int ratingCount) {
		this.ratingCount = ratingCount;
	}
	@Override
	public String toString() {
		return "Review [id=" + id + ", review=" + strReview + ", objWebUser= ]";
	}
	
	
}
