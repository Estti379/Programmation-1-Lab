package lu.uni.lab6.Exercice3;

public class Passenger extends Person {

	int loyalityCardNumber;
	
	public Passenger(String newName, String newPassportNumber,
					 int newLoyalityCardNumber) {
		
		super(newName, newPassportNumber);
		
		loyalityCardNumber = newLoyalityCardNumber;
	}
}
