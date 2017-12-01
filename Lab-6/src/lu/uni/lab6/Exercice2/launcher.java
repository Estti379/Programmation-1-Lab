package lu.uni.lab6.Exercice2;

import java.util.Scanner;

public class launcher {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		long timer = 0;
		Fibonacci myFibo;
		
		do {
			System.out.println("(2) input number:");
			i = scanner.nextInt();
			
			timer = System.nanoTime();
			myFibo = new Fibonacci(i);
			System.out.println(myFibo.calcFibonacci(i) );
			System.out.println( System.nanoTime() - timer );
		
		} while( i != 0 );
		
		scanner.close();
	}

}
