package entity;

public class Account {
	private int id;
	private String userName;
	private String userPhone;
	private String userEmail;
	private String userPass;
	private int userSex;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Account(int id, String userName, String userPhone, String userEmail, String userPass, int userSex) {
		super();
		this.id = id;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.userPass = userPass;
		this.userSex = userSex;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public int isUserSex() {
		return userSex;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", userName=" + userName + ", userPhone=" + userPhone + ", userEmail=" + userEmail
				+ ", userPass=" + userPass + ", userSex=" + userSex + "]";
	}
	public void setUserSex(int userSex) {
		this.userSex = userSex;
	}
	


}
