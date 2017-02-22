package app.com.iugrub.pojo;

import java.io.Serializable;
import java.util.Date;

public class Offers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String strOfferName;
	private String strOfferDetails;
	private Date offerStartDate;
	private Date offerEndDate;
	private boolean isNeverExpire;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStrOfferName() {
		return strOfferName;
	}
	public void setStrOfferName(String strOfferName) {
		this.strOfferName = strOfferName;
	}
	public String getStrOfferDetails() {
		return strOfferDetails;
	}
	public void setStrOfferDetails(String strOfferDetails) {
		this.strOfferDetails = strOfferDetails;
	}
	public Date getOfferStartDate() {
		return offerStartDate;
	}
	public void setOfferStartDate(Date offerStartDate) {
		this.offerStartDate = offerStartDate;
	}
	public Date getOfferEndDate() {
		return offerEndDate;
	}
	public void setOfferEndDate(Date offerEndDate) {
		this.offerEndDate = offerEndDate;
	}
	public boolean getIsNeverExpire() {
		return isNeverExpire;
	}
	public void setIsNeverExpire(boolean isNeverExpire) {
		this.isNeverExpire = isNeverExpire;
	}
	@Override
	public String toString() {
		return "Offers [id=" + id + ", strOfferName=" + strOfferName + ", strOfferDetails=" + strOfferDetails
				+ ", offerStartDate=" + offerStartDate + ", offerEndDate=" + offerEndDate + ", isNeverExpire="
				+ isNeverExpire + "]";
	}
	
}
