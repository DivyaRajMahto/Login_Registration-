package sms.model;

public class Login_Model {
	
	private String UserID;
	private String Password;
	private String UserName;
	private String Age;
	private String Address;
	private String Branch;
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	@Override
	public String toString() {
		return "Login_Model [UserID=" + UserID + ", Password=" + Password + ", UserName=" + UserName + ", Age=" + Age
				+ ", Address=" + Address + ", Branch=" + Branch + "]";
	}
	
	
	

}
