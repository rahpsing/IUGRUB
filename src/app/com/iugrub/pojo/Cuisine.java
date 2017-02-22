package app.com.iugrub.pojo;

import java.io.Serializable;

public class Cuisine implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String strCuisineName;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getStrCuisineName() {
		return strCuisineName;
	}
	public void setStrCuisineName(String strCuisineName) {
		this.strCuisineName = strCuisineName;
	}
	@Override
	public String toString() {
		return "Cuisine [id=" + id + ", cuisineName=" + strCuisineName + "]";
	}
	
	
	

}
