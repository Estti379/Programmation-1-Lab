package lu.uni.lab7.Exercice2.Product;

public class Drink extends Product {
	
	private int volume;
	private String bottleType;
	
	public Drink(int traySizeNeeded, int newPrice, int volume,
				String bottleType, String brand) {
		
		super(traySizeNeeded, newPrice, brand);
		this.bottleType = bottleType;
		this.volume = volume;
	}
	
	@Override
	public String toString() {
		String description = "Brand: " + brand + "\nBottle type: "
							+ bottleType + "\nVolume: " + volume 
							+ "\nPrice: " + price + " €";
		
		return description;
	}
}
