package entity;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<trip> trips;
	public Cart() {
		trips= new ArrayList<>();
		
	}
	public Cart(List<trip> trips) {
		this.trips=trips;
	}
	public List<trip> getTrips(){
		return trips;
	}
	public void setTrips(List<trip> trips) {
		this.trips=trips;
	}
	public trip getTripById(int id) {
		trip p = this.trips.get(id);		
		return p;
	}
	@Override
	public String toString() {
		return "Cart [trips=" + trips + "]";
	}
	
	

}
