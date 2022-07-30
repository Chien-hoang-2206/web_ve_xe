package entity;

public class ticket {
	int ticketID;
	int userID;
	int carID;
	int paymentID;
	int timeID;
	boolean ticketStatus = false;
	public ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ticket(int userID, int carID, int paymentID, int timeID) {
		super();
		this.userID = userID;
		this.carID = carID;
		this.paymentID = paymentID;
		this.timeID = timeID;
	}
	public ticket(int ticketID, int userID, int carID, int paymentID, int timeID ) {
		super();
		this.ticketID = ticketID;
		this.userID = userID;
		this.carID = carID;
		this.paymentID = paymentID;
		this.timeID = timeID;
	}
	public int getTicketID() {
		return ticketID;
	}
	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getCarID() {
		return carID;
	}
	public void setCarID(int carID) {
		this.carID = carID;
	}
	public int getPaymentID() {
		return paymentID;
	}
	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}
	public int getTimeID() {
		return timeID;
	}
	public void setTimeID(int timeID) {
		this.timeID = timeID;
	}
	public boolean isTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(boolean ticketStatus) {
		this.ticketStatus = ticketStatus;
	}	
}
