package app.com.iugrub.pojo;

import java.io.Serializable;



public class StoreAddress implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private Campus objCampus;
	private String strAddressLine;
	private FoodStore objFoodStore;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getStrAddressLine() {
		return strAddressLine;
	}
	public void setStrAddressLine(String strAddressLine) {
		this.strAddressLine = strAddressLine;
	}
	public FoodStore getObjFoodStore() {
		return objFoodStore;
	}
	public void setObjFoodStore(FoodStore objFoodStore) {
		this.objFoodStore = objFoodStore;
	}
	public Campus getObjCampus() {
		return objCampus;
	}
	public void setObjCampus(Campus objCampus) {
		this.objCampus = objCampus;
	}
	public String getAddressLine() {
		return strAddressLine;
	}
	public void setAddressLine(String addressLine) {
		this.strAddressLine = addressLine;
	}
	@Override
	public String toString() {
		return "StoreAddress [id=" + id + ", objCampus=" + objCampus + ", strAddressLine=" + strAddressLine
				+ ", objFoodStore=" + objFoodStore + "]";
	}
	
}
