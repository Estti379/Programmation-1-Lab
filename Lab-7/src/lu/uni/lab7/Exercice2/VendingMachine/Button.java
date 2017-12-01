package lu.uni.lab7.Exercice2.VendingMachine;

import lu.uni.lab7.Exercice2.Product.Product;

public class Button {
	
	private Tray[] myTray;
	
	public Button() {
	/* empty */
	}
	
	public void addTrayList(Tray[] newTrayList) {
		myTray = newTrayList;
	}
	
	public boolean isProgrammed() {
		boolean buttonIsProgrammed = false;
		
		if ( myTray[0] != null ) {
			buttonIsProgrammed = true;
		}
		
		return buttonIsProgrammed;
	}

	public void provideItem(Cart ourCart) {
		if ( ourCart.call(myTray[0].getProductSize() ) ) {
			if ( !myTray[0].isEmpty() ) {
				
				for (int i = 0 ; i < myTray.length ; i++ ) {
					myTray[i].deliverItem();
				}
				ourCart.addItem(myTray[0].getProduct());
				
			}
		}
		
	}
	
	// TODO create method reset()


}
