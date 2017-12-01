package lu.uni.lab5.exercice2;

public class SieveOfEratosthenes {

	public static void main(String[] args) {

		boolean[] prime = new boolean[200];
		int i = 0, p = 0, numberOfPrimes = 0;
		
		
		for ( i = 2 ; i < prime.length ; i++ ) {
			prime[i] = true ;
		}
		prime[0] = false ;
		prime[1] = false ;
		
		p = 2;
		while ( (p*p) < prime.length ) {
			for ( i = 2 ; ( (i * p) < prime.length) ; i++ ) {
				prime[i * p] = false ;
			}
			for (i = p + 1 ; (i < prime.length) && !(prime[i]) ; i++ ) {
				/* empty for structure */
			}
			p = i;
		}
		
		for ( i = 0 ; i < prime.length ; i++ ) {
			if ( prime[i] ) {
				System.out.print( String.format("%3d\t", i) );
				numberOfPrimes++;
				if ( (numberOfPrimes != 0) && ( (numberOfPrimes % 10) == 0) ) {
					System.out.println();
				}
			}
			
		
		}
		
		
		
	}

}
