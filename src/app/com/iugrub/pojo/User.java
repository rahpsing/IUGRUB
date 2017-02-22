package app.com.iugrub.pojo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String strEmailAddress;
	private String strUserName;
	private String strPassword;
	private Date lastLogin;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getStrEmailAddress() {
		return strEmailAddress;
	}
	public void setStrEmailAddress(String strEmailAddress) {
		this.strEmailAddress = strEmailAddress;
	}
	public String getStrUserName() {
		return strUserName;
	}
	public void setStrUserName(String strUserName) {
		this.strUserName = strUserName;
	}
	public String getStrPassword() {
		return strPassword;
	}
	public void setStrPassword(String strPassword) {
		this.strPassword = strPassword;
	}
	public Date getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", strEmailAddress=" + strEmailAddress + ", strUserName=" + strUserName
				+ ", lastLogin=" + lastLogin + "]";
	}
	
}
