package lu.uni.lab6.Exercice3;

public class Person {

	String name;
	String passportNumber;
	
	public Person(String newName, String newPassportNumber) {
		
		name = newName;
		passportNumber = newPassportNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPassportNumber() {
		return passportNumber;
	}
	
	public void setPassportNumber(String newPassportNumber) {
		passportNumber = newPassportNumber;
	}
	
}
