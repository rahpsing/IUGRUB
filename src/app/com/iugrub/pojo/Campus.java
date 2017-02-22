package app.com.iugrub.pojo;

import java.io.Serializable;

public class Campus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String strCampusBuilding;
	private String strBuildingAddress;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStrCampusBuilding() {
		return strCampusBuilding;
	}
	public void setStrCampusBuilding(String strCampusBuilding) {
		this.strCampusBuilding = strCampusBuilding;
	}
	public String getStrBuildingAddress() {
		return strBuildingAddress;
	}
	public void setStrBuildingAddress(String strBuildingAddress) {
		this.strBuildingAddress = strBuildingAddress;
	}
	@Override
	public String toString() {
		return "Campus [id=" + id + ", strCampusBuilding=" + strCampusBuilding + ", strBuildingAddress="
				+ strBuildingAddress + "]";
	}
	
	
	
}
