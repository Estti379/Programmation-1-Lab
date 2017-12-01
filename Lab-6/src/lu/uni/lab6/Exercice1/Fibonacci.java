package lu.uni.lab6.Exercice1;

public class Fibonacci {
	
	
	public Fibonacci() {
		//empty
	}
	
	int calcFibonacci(int n) {
		int fibonacciNumber = 0;
		
	if ( n == 0 ) {
		fibonacciNumber = 0;
	} else if ( (n == 1) | (n == 2) ) {
			fibonacciNumber = 1;
		
		} else {
			fibonacciNumber = calcFibonacci(n-1) + calcFibonacci(n-2);
		}
		
		return fibonacciNumber;
		
	}
	
}
