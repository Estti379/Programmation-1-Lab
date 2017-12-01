package lu.uni.lab2;

import java.util.Scanner;

public class comparison_positive_numbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Get 2 integer values as input from user and turn them into their positive
		//counter-part, if applicable.
		System.out.println("Input 2 positive integers:");
		int integerA = Math.abs(scanner.nextInt());
		int integerB = Math.abs(scanner.nextInt());
		
		//Divide A by B, then pick the biggest between it and 1.
		//If A is smaller than  B, then A/B = 0
		int resultInteger = Math.min( (integerA/integerB) , 1);
		System.out.println("The result is: " + resultInteger);
		
		//Same as before
		System.out.println("Input 2 positive numbers:");
		double doubleA = Math.abs(scanner.nextDouble());
		double doubleB = Math.abs(scanner.nextDouble());
		
		//Same as before. But, this time, we need to get rid of the decimals.
		double resultDouble = Math.floor( Math.min( (doubleA/doubleB) , 1));
		System.out.println("The result is: " + resultDouble);	
		
		
		scanner.close();

	}

}
