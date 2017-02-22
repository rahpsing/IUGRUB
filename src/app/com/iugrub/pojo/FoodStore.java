package app.com.iugrub.pojo;

import java.io.Serializable;
import java.util.List;

public class FoodStore implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//type for images to be specified
	private String id;
	private String strStoreName;
	private List<Cuisine> listCuisines;
	private StoreAddress objStoreAddress;
	private List<StoreContactDetails> listContactNumbers;
	private List<FoodItem> listOfItems;
	private List<Offers> listOfOffers;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStrStoreName() {
		return strStoreName;
	}
	public void setStrStoreName(String strStoreName) {
		this.strStoreName = strStoreName;
	}

	public List<Cuisine> getListCuisines() {
		return listCuisines;
	}
	public void setListCuisines(List<Cuisine> listCuisines) {
		this.listCuisines = listCuisines;
	}
	
	public StoreAddress getObjStoreAddress() {
		return objStoreAddress;
	}
	public void setObjStoreAddress(StoreAddress objStoreAddress) {
		this.objStoreAddress = objStoreAddress;
	}
	public List<StoreContactDetails> getListContactNumbers() {
		return listContactNumbers;
	}
	public void setListContactNumbers(List<StoreContactDetails> listContactNumbers) {
		this.listContactNumbers = listContactNumbers;
	}
	public List<FoodItem> getListOfItems() {
		return listOfItems;
	}
	public void setListOfItems(List<FoodItem> listOfItems) {
		this.listOfItems = listOfItems;
	}

	public List<Offers> getListOfOffers() {
		return listOfOffers;
	}
	public void setListOfOffers(List<Offers> listOfOffers) {
		this.listOfOffers = listOfOffers;
	}
	@Override
	public String toString() {
		return "FoodStore [id=" + id + ", strStoreName=" + strStoreName + ", listCuisines=" + listCuisines
				+ ", objAddress=" + objStoreAddress + ", listContactNumbers=" + listContactNumbers + ", listOfItems="
				+ listOfItems + ", listOfOffers=" + listOfOffers + "]";
	}

	
	
}
