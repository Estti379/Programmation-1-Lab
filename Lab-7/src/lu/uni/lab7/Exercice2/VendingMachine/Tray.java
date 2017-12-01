package lu.uni.lab7.Exercice2.VendingMachine;

import lu.uni.lab7.Exercice2.Product.Product;

public class Tray {
	
	private Product storedProduct;
	private int storedAmount;
	private final int maxCapacity;

	public Tray(int trayMaxCapacity) {
		maxCapacity = trayMaxCapacity;
		storedAmount = 0;
		storedProduct = null;
	}
	
	public void setStoredProduct(Product newProduct) {
		this.storedProduct = newProduct;
		storedAmount = maxCapacity;
	}
	
	
	public Product getProduct() {
		return storedProduct;
		
	}

	public int getProductSize() {
		int size = 0;
		if ( storedProduct != null ) {
			size = storedProduct.getSize();
		}
		
		return size;
	}

	public boolean isEmpty() {
		boolean trayIsEmpty = false;
		
		if ( storedAmount < 0 ) {
			trayIsEmpty = true;
		} else {
			trayIsEmpty = false;
		}
		
		return trayIsEmpty;
	}

	public void deliverItem() {
		storedAmount--;
		
	}
	
	// TODO method reset()
}
