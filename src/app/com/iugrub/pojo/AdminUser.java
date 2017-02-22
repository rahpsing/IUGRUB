package app.com.iugrub.pojo;

import java.io.Serializable;
import java.util.List;

public class AdminUser extends User implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<FoodStore> listFoodStore;
	
	public List<FoodStore> getListFoodStore() {
		return listFoodStore;
	}
	public void setListFoodStore(List<FoodStore> listFoodStore) {
		this.listFoodStore = listFoodStore;
	}
	
}
