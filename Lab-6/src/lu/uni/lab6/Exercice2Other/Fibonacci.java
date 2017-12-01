package lu.uni.lab6.Exercice2Other;

public class Fibonacci {
	private long[] storedFibonacci;
	
	public Fibonacci(int n) {
		int i = 0;
		storedFibonacci = new long[ n+1 ];
		
		for ( i = 1; i < storedFibonacci.length ; i++ ) {
			storedFibonacci[i] = 0;
		}
	}
	
	long calcFibonacciNew(int n) {
		long fibonacciNumber = 0;
		
		if ( storedFibonacci[n] == 0 ) {
		
			if ( n == 0 ) {
				fibonacciNumber = 0;
				storedFibonacci[n] = fibonacciNumber;
				
			} else if ( (n == 1) | (n == 2) ) {
				fibonacciNumber = 1;
				storedFibonacci[n] = fibonacciNumber;
				
			} else {
				fibonacciNumber = calcFibonacciNew(n-1) + calcFibonacciNew(n-2);
				storedFibonacci[n] = fibonacciNumber;
			}
		
			
		} else {
			fibonacciNumber = storedFibonacci[n];
		}
		
		return fibonacciNumber;
		
	}
	
	
	
	long calcFibonacciOld(int n) {
		long fibonacciNumber = 0;
		
	if ( n == 0 ) {
		fibonacciNumber = 0;
	} else if ( (n == 1) | (n == 2) ) {
			fibonacciNumber = 1;
		
		} else {
			fibonacciNumber = calcFibonacciOld(n-1) + calcFibonacciOld(n-2);
		}
		
		return fibonacciNumber;
		
	}
	
	
	
	
	
	
}
