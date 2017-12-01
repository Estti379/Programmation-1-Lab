package lu.uni.lab6.Exercice1;

import java.util.Scanner;

public class launcher {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		long timer = 0;
		Fibonacci myFibo = new Fibonacci();
		
		do {
			System.out.println("(1) input number:");
			i = scanner.nextInt();
			
			timer = System.nanoTime();
			System.out.println(myFibo.calcFibonacci(i) );
			System.out.println( System.nanoTime() - timer );
		
		} while( i != 0 );
		
		scanner.close();
	}

}
