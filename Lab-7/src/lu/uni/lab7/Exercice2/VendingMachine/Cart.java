package lu.uni.lab7.Exercice2.VendingMachine;

import java.util.ArrayList;

import lu.uni.lab7.Exercice2.Product.Product;

public class Cart {
	
	private ArrayList<Product> storedProduct;
	private final int maxCapacity;
	
	public Cart(int cartCapacity) {
		maxCapacity = cartCapacity;
	}
	
	public int getMaxCapacity() {
		return maxCapacity;
	}
	
	public boolean call(int size) {
		boolean enoughSpace = false;
		int currentSpace = maxCapacity;
		
		for (Product product : storedProduct) {
			if (product != null) {
				currentSpace--;
			}
		}		
				
		if ( (currentSpace - size) > 0 ) {
			enoughSpace = true;
		} else  {
			enoughSpace = false;
			System.out.println("ERROR - Cart: The Item can't be added to the"
								+ " cart.");
		}
		
		return enoughSpace;
	}

	public void addItem(Product product) {
		storedProduct.add(product);
		System.out.println( product.getBrand() + " was added to the " );
	}

	// TODO method reset()
}
