package ua.consultation;

public class Plane {
	private String model;
	private int maxSpeed;
	private int passangers;
	public Plane() {
		super();
	}
	public Plane(String model, int maxSpeed) {
		super();
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public double fly(int fuel, int kmPreLitr, int speed){
		System.out.println("plane fly");
		int hours = fuel*kmPreLitr/speed;
		return hours;
	}
	
	@Override
	public String toString() {
		return "Plane [model=" + model + ", maxSpeed=" + maxSpeed + ", passangers=" + passangers + "]";
	}
	
	
}
