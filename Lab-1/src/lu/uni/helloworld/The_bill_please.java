package lu.uni.helloworld;

import java.util.Scanner;

public class The_bill_please {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("How many Items do you wish to buy?");
		int numberOfItems = scanner.nextInt();
		
		System.out.println("How much does each item cost?");
		float priceSingleItem = scanner.nextFloat();
		
		System.out.println("What is the current VAT of the current Item? (in %)");
		float vatOfItem = scanner.nextFloat();
		
		
		float priceNoVAT = numberOfItems * priceSingleItem;
		System.out.println("The total price without VAT: " + priceNoVAT +"€");
		
		float justVAT = priceNoVAT * vatOfItem / 100 ;
		System.out.println("The VAT value: " + justVAT +"€");
		
		float priceWithVAT = priceNoVAT + justVAT ;
		System.out.println("The total price including VAT: " + priceWithVAT +"€");
		
		scanner.close();

	}

}
