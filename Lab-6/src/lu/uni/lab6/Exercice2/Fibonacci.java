package lu.uni.lab6.Exercice2;

public class Fibonacci {
	private int[] storedFibonacci;
	
	public Fibonacci(int n) {
		int i = 0;
		storedFibonacci = new int[ n+1 ];
		
		for ( i = 1; i < storedFibonacci.length ; i++ ) {
			storedFibonacci[i] = 0;
		}
	}
	
	int calcFibonacci(int n) {
		int fibonacciNumber = 0;
		
		if ( storedFibonacci[n] == 0 ) {
		
			if ( n == 0 ) {
				fibonacciNumber = 0;
				storedFibonacci[n] = fibonacciNumber;
				
			} else if ( (n == 1) | (n == 2) ) {
				fibonacciNumber = 1;
				storedFibonacci[n] = fibonacciNumber;
				
			} else {
				fibonacciNumber = calcFibonacci(n-1) + calcFibonacci(n-2);
				storedFibonacci[n] = fibonacciNumber;
			}
		
			
		} else {
			fibonacciNumber = storedFibonacci[n];
		}
		
		return fibonacciNumber;
		
	}
	
}
