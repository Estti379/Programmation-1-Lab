package lu.uni.lab6.Exercice3;

public class Plane {
	private String registrationNumber;
	private int capacity;
	
	public Plane(String newRegistrationNNumber, int newCapacity) {
		registrationNumber = newRegistrationNNumber;
		capacity = newCapacity;
		
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	
}
