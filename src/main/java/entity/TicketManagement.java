package entity;

public class TicketManagement {
	 private int ticketID;
	 private String userName;
	 private String userPhone;
	 private String userEmail;
	 private String carName;
	 private String routeFrom;
	 private String routeTo;
	 private String timeFrom;
	 private String timeTo;
	 private int carPrice;
	 private String paymentName;	 
	 public int getTicketID() {
		return ticketID;
	}

	public TicketManagement(int ticketID, String userName, String userPhone, String userEmail, String carName,
			String routeFrom, String routeTo, String timeFrom, String timeTo, int carPrice, String paymentName) {
		super();
		this.ticketID = ticketID;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.carName = carName;
		this.routeFrom = routeFrom;
		this.routeTo = routeTo;
		this.timeFrom = timeFrom;
		this.timeTo = timeTo;
		this.carPrice = carPrice;
		this.paymentName = paymentName;
	}

	@Override
	public String toString() {
		return "TicketManagement [ticketID=" + ticketID + ", userName=" + userName + ", userPhone=" + userPhone
				+ ", userEmail=" + userEmail + ", carName=" + carName + ", routeFrom=" + routeFrom + ", routeTo="
				+ routeTo + ", timeFrom=" + timeFrom + ", timeTo=" + timeTo + ", carPrice=" + carPrice
				+ ", paymentName=" + paymentName + "]";
	}
	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
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
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getRouteFrom() {
		return routeFrom;
	}
	public void setRouteFrom(String routeFrom) {
		this.routeFrom = routeFrom;
	}
	public String getRouteTo() {
		return routeTo;
	}
	public void setRouteTo(String routeTo) {
		this.routeTo = routeTo;
	}
	public String getTimeFrom() {
		return timeFrom;
	}
	public void setTimeFrom(String timeFrom) {
		this.timeFrom = timeFrom;
	}
	public String getTimeTo() {
		return timeTo;
	}
	public void setTimeTo(String timeTo) {
		this.timeTo = timeTo;
	}
	public int getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
	public String getPaymentName() {
		return paymentName;
	}
	public void setPaymentName(String paymentName) {
		this.paymentName = paymentName;
	}
}
