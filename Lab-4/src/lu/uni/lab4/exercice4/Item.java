package lu.uni.lab4.exercice4;

public class Item {
	
	private double price;
	
	
	Item(double newPrice) {
		price = ( Math.floor(newPrice * 100) )/100;
		
	}
	
	double getPrice() {
		return price;
	}
	
}
