package lu.uni.lab6.Exercice2Other;

import java.util.Scanner;

public class launcher {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		long timer = 0;
		Fibonacci myFibo;
		
		for ( i = 1 ; i <= 45 ; i++ ) {
			myFibo = new Fibonacci(i);
			
			System.out.println(i + ": ");
			
			timer = System.nanoTime();
			System.out.print("Old: " + myFibo.calcFibonacciOld(i) );
			System.out.println(" + timer: " + ( System.nanoTime() - timer ) );
			
			timer = System.nanoTime();
			System.out.print("New: " + myFibo.calcFibonacciNew(i) );
			System.out.println(" + timer: " + ( System.nanoTime() - timer ) );
			
			
		
		}
		
		scanner.close();
	}

}
