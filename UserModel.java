package model;

public class UserModel {
	private int userId;
	private String userName;
	private  String userEmail;
	private int phoneNumber;
	private int password;
	public void UserModel(int userId,String userName,String userEmail,int phoneNumber,int password) {
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.phoneNumber = phoneNumber;
		this.password =password;
	}
	public void UserModel(){
		
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	


}
