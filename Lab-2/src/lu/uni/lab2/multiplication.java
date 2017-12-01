package lu.uni.lab2;

import java.util.Scanner;

public class multiplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Get 2 values as input from user
		System.out.println("Input 2 integers:");
		int valueA = scanner.nextInt();
		int valueB = scanner.nextInt();
		
		/*
		 * The product of both values is positive if both input values are either
		 * positive or negative at the same time.
		 * 
		 * If the product is positive, return 1, otherwise, return -1
		 */
		
		int result = ( ( (valueA > 1) && (valueB > 1) )
					|| ( (valueA < 1) && (valueB < 1) ) ) ? 1 : -1 ;
		
		System.out.println("The result is: " + result);
		
		
		scanner.close();
	}

}
