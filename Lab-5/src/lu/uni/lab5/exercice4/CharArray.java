package lu.uni.lab5.exercice4;

public class CharArray {

	public static void main(String[] args) {
		
		char[] shortAlphabet = { 'a', 'b', 'c' };
		char[] longerAlphabet = new char[4];
		int i = 0;
		int aShort, aLong;
		
		for ( i = 0 ; i < shortAlphabet.length ; i++ ) {
			longerAlphabet[i] = shortAlphabet[i];
		}
		
		longerAlphabet[shortAlphabet.length] = 'd';
		
		for ( i = 0 ; i < longerAlphabet.length ; i++ ) {
			System.out.print( longerAlphabet[i] + " " );
		}
		System.out.println();
		
		aShort = shortAlphabet[0];
		aLong = longerAlphabet[0];
		
		System.out.println( aShort );
		System.out.println( aLong );
		
	}

}
