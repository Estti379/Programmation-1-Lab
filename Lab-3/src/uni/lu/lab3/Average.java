package uni.lu.lab3;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sumInteger = 0, i = -1, currentInteger = 0;
		
		//NOTE: "i" starts at -1 since there will be the one iteration where the user
		//inputs 0 to stop the loop. the -1 offsets that!
		do {
			System.out.println("Input an integer:");
			currentInteger = scanner.nextInt();
			sumInteger = sumInteger + currentInteger;
			i++;
			
		} while(currentInteger != 0);
		
		double averageInteger = sumInteger / i;
		System.out.println("The average is "+ averageInteger +"!");
		
		scanner.close();
	}

}
