package entity;


public class trip {
	private String carName;
	private int carNumberSlot;
	private int carPrice;
	private String routeFrom;
	private String routeTo;
	private String timeFrom;
	private String timeTo;
	private String carType;
	private int tripID;
	
	
	
	

	public trip(int tripID, String carName, int carNumberSlot,String carType, int carPrice, String routeFrom, String routeTo, String timeFrom, String timeTo) {
		this.carName = carName;
		this.carNumberSlot = carNumberSlot;
		this.carPrice = carPrice;
		this.routeFrom = routeFrom;
		this.routeTo = routeTo;
		this.timeFrom = timeFrom;
		this.timeTo = timeTo;
		this.carType = carType;
		this.tripID = tripID;
		
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getCarNumberSlot() {
		return carNumberSlot;
	}

	public void setCarNumberSlot(int carNumberSlot) {
		this.carNumberSlot = carNumberSlot;
	}

	public int getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
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
	
	@Override
	public String toString() {
		return "trip [carName=" + carName + ", carNumberSlot=" + carNumberSlot + ", carPrice=" + carPrice + ", routeFrom=" + routeFrom + ", routeTo=" + routeTo + ", timeFrom=" + timeFrom + ", timeTo=" + timeTo + "]";
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public int getTripID() {
		return tripID;
	}

	public void setTripID(int tripID) {
		this.tripID = tripID;
	}
	

}
