package lu.uni.lab7.Exercice2.Product;

public abstract class Product {
	
	/* NOTE: stores price in cents! */
	protected int price;
	protected final int traySize;
	protected final String brand;
	
	public Product(int traySizeNeeded, int newPrice, String brand) {
		traySize = traySizeNeeded;
		price = newPrice;
		this.brand = brand;
	}
	
	public int getSize() {
		return traySize;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
}
