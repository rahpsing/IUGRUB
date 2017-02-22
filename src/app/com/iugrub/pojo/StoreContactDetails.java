package app.com.iugrub.pojo;

import java.io.Serializable;
import java.util.List;

public class StoreContactDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private List<String> contacts;
	private String strWebSiteLink;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public List<String> getContacts() {
		return contacts;
	}
	public void setContacts(List<String> contacts) {
		this.contacts = contacts;
	}
	public String getStrWebSiteLink() {
		return strWebSiteLink;
	}
	public void setStrWebSiteLink(String strWebSiteLink) {
		this.strWebSiteLink = strWebSiteLink;
	}
	@Override
	public String toString() {
		return "StoreContactDetails [id=" + id + ", contacts=" + contacts + ", strWebSiteLink=" + strWebSiteLink + "]";
	}

	
	
}
