package lu.uni.lab2;

import java.util.Scanner;

public class united_states_aggression {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Solution without using conditional clauses
		System.out.println("Input temperature in celsius:");
		double tempCelsius = scanner.nextDouble();
		boolean result = tempCelsius <= 0;
		
		System.out.println("Does water freeze at " + tempCelsius
				+ " degree Celsius? " + result);
		
		
		//Solution with using conditional clauses
		
		if (tempCelsius >= 100) {
			System.out.println("You won't have any water, only steam!");
		} else { // tempCelsius < 100
			
			if(tempCelsius > 0) {
				System.out.println("Yup, water is pretty wet at this "
						+"temperature!");
			} else { // tempCelsius <= 0
				System.out.println("It became hard and expanded. "
									+"Yup, that's what water does when it is "
									+"this cold!");
			}
		}
		
		
		scanner.close();
	}

}
