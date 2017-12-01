package lu.uni.lab6.Exercice3;

public class Airport {
	
	String city;
	String country;
	String iataCode;
	
	public Airport(String newCity, String newCountry, String newIatacode) {
		city = newCity;
		country = newCountry;
		iataCode = newIatacode;
	}
	
	
	
	public String getCity() {
		return city;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getIataCode() {
		return iataCode;
	}
	
}
