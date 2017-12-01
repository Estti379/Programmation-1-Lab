package lu.uni.lab5.exercice1;

import java.util.Scanner;

public class TestingGrounds {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);		
	Vector firstVector = null, secondVector = null, thirdVector = null;
	
	int dimensionN = -1;
	
	
	do {
		System.out.println("Type dimension:");
		while( !scanner.hasNextInt() ){
			scanner.nextLine();
			System.out.println("Type dimension:");
		} 
		dimensionN = scanner.nextInt();
		scanner.nextLine();
	} while ( dimensionN <= 0 );
	
	
	firstVector = new Vector(dimensionN);
	secondVector = new Vector(dimensionN);
	
	firstVector.randomFill(100, 0);	
	secondVector.randomFill(100, 0);
	
	thirdVector = firstVector.add(secondVector);
	
	
	System.out.println("First Norm: " + firstVector.getNorm() 
						+ ". First vector: " + firstVector.toString());
	
	System.out.println("Second Norm: " + secondVector.getNorm() 
	+ ". Second vector: " + secondVector.toString());
	
	System.out.println("Third Norm: " + thirdVector.getNorm() 
	+ ". Third vector: " + thirdVector.toString());
	
	scanner.close();
	}

}
