package app.com.iugrub.pojo;

import java.io.Serializable;

public class FoodItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String strItemName;
	private Cuisine objCuisine;
	private double price;
	//private FoodStore objFoodStore;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStrItemName() {
		return strItemName;
	}
	public void setStrItemName(String strItemName) {
		this.strItemName = strItemName;
	}
	public Cuisine getObjCuisine() {
		return objCuisine;
	}
	public void setObjCuisine(Cuisine objCuisine) {
		this.objCuisine = objCuisine;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	/*public FoodStore getObjFoodStore() {
		return objFoodStore;
	}
	public void setObjFoodStore(FoodStore objFoodStore) {
		this.objFoodStore = objFoodStore;
	}*/
	@Override
	public String toString() {
		return "FoodItem [id=" + id + ", strItemName=" + strItemName + ", price=" + price + "]";
	}
	
	
	
}
