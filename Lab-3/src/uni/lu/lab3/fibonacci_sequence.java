package uni.lu.lab3;

import java.util.Scanner;

public class fibonacci_sequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int fibonacciN = 0, fibonacciN1 = 1 ,fibonacciN2 = 1;
		//NOTE: fibonacciN is the nth term, fibonacciN1 is for n-1 and fibonacciN2 is for n-2
		
		System.out.println("What is your n? (it has to be 1 or greater)");
		int userN = scanner.nextInt();
		
		if ( (userN == 1) ||  (userN == 2) ) {
			fibonacciN = 1;
		} else { 
			for(int n = 3; n <= userN; n++) {
				fibonacciN = fibonacciN1 + fibonacciN2 ;
				fibonacciN2 = fibonacciN1;
				fibonacciN1 = fibonacciN;
			}
		}
		System.out.println("The n-th term (where n = " + userN + ") of the fibonacci "
							+"sequence is " + fibonacciN +"!");
		
		scanner.close();
	}

}
