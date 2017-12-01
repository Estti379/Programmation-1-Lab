package lu.uni.lab7.Exercice2.VendingMachine;

import lu.uni.lab7.Exercice2.Product.Product;

public class VendingMachine {
	
	private final Button[] programmedButton;
	private final Cart myCart;
	private final Tray[] myTray;
	/* Tray width tells how many trays each row of trays has.*/
	private final int trayWidth;
	private final int trayRows;
	
	public VendingMachine(int maxButtons, int cartCapacity, int trayWidth,
						  int trayRows, int trayMaxCapcity) {
		
		programmedButton = new Button[maxButtons];
		for ( int i = 0 ; i < programmedButton.length  ; i++ ) {
			programmedButton[i] = new Button();
		}
		
		myCart = new Cart(cartCapacity);
		
		this.trayWidth = trayWidth;
		this.trayRows = trayRows;
		myTray = new Tray[trayRows * trayWidth];
		for ( int i = 0 ; i < myTray.length  ; i++ ) {
			myTray[i] = new Tray(trayMaxCapcity);
		}
		
		
	}
	
	
	public void pressButton(int number) {
		if ( (number < programmedButton.length)) {
			System.out.println("Error - VendingMachine: Button doesn't "
					+ "exist.");
			
		} else if ( !programmedButton[number].isProgrammed() ) {
			System.out.println("Error - VendingMachine: Button isn't "
					+ "programmed.");
			
		} else {
			programmedButton[number].provideItem(this.myCart);
		}
	}
	
	public void addNewProduct(Product newProduct) {
		Button emptyButton = getEmptyButton();
		Tray[] emptyTrays = getEmptyTrays(newProduct.getSize() );
		
		if( newProduct.getSize() > myCart.getMaxCapacity() ) {
			System.out.println("Error - VendingMachine: Cart can't handle "
					+ "products of that size!");
		} else if ( newProduct.getSize() > trayWidth) {
			System.out.println("Error - VendingMachine: Product is too big for "
					+ "each tray row!");
		} else if ( emptyButton == null ) {
			System.out.println("Error - VendingMachine: All buttons are "
					+ "already programmed. Failed to add the product.");
		} else {
			// TODO finish him
		}
		
		
	}
	
	private Button getEmptyButton() {
		Button emptyButton = null;
		boolean foundEmpty = false;
		int i = 0;
		
		while ( (i < programmedButton.length) && !foundEmpty) {
			if ( programmedButton[i] == null ) {
				foundEmpty = true;
			}
		}
		
		if (foundEmpty) {
			emptyButton = programmedButton[i];
		}
		
		return emptyButton;
	}
	
	private Tray[] getEmptyTrays(int size) {
		Tray[] emptyTrays = null;
		int i = 0, j = 0;
		boolean foundEmptyTray = false;
		
		for (i = 0 ; ( i < (myTray.length - size) ) 
				  && !foundEmptyTray ; i++ ) {
			
			foundEmptyTray = true;
			for ( j = 0 ; j < size ; j++ ) {
				if ( myTray[i+j] != null) {
					foundEmptyTray = false;
				}
			}
			
			if ( ( (i + size + 1) % trayWidth) == 0 ) {
				i = i + size;
			}
		}
		
		if ( foundEmptyTray ) {
			emptyTrays = new Tray[size];
			for (j = 0 ; j < size ; j++, i++ ) {
				emptyTrays[j] = myTray[i];
			}
		}
		
		return emptyTrays;
	}
}
