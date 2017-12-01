package lu.uni.lab7.Exercice2;

import lu.uni.lab7.Exercice2.Product.Drink;
import lu.uni.lab7.Exercice2.VendingMachine.VendingMachine;

public class Launcher {

	public static void main(String[] args) {
		VendingMachine model42;
		Drink coke, fanta;
		
		coke = new Drink(1, 300, 50, "plastic", "CocaCola");
		fanta = new Drink(1, 280, 50, "plastic", "Fanta");
		
		
		model42 = new VendingMachine(8, 3, 5, 4, 20);
		model42.addNewProduct(fanta);
		model42.addNewProduct(coke);
		
		model42.pressButton(1);

	}

}
