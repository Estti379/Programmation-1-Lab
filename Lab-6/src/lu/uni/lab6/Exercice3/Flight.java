package lu.uni.lab6.Exercice3;

public class Flight {
	
	private String number;
	private Airport origin;
	private Airport destination;
	
	public Flight(String newNumber, Airport newOrigin,
				  Airport newDestination) {
		
		number = newNumber;
		origin = newOrigin;
		destination = newDestination;
	}
	
	public String getNumber() {
		return number;
	}
	
	public Airport getOrigin() {
		return origin;
	}
	
	public Airport getDestination() {
		return destination;
	}
	
	public void setDestination(Airport newDestination) {
		destination = newDestination;
	}
	
	public void setNumber(String newNumber) {
		number = newNumber;
	}
	
	public void setOrigin(Airport newOrigin) {
		origin = newOrigin;
	}
	
	
}
