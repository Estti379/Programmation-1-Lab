package lu.uni.lab6.Exercice3;

public class Pilot extends Person {

	String airline;
	
	public Pilot(String newName, String newPassportNumber,
			 String newAirline) {
		
		super(newName, newPassportNumber);
		
		airline = newAirline;
	}
}
