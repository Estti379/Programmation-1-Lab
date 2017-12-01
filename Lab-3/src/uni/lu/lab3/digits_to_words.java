package uni.lu.lab3;

import java.util.Scanner;

public class digits_to_words {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int power10 = 0, division = 0;
		
		System.out.println("Input your integer:");
		int myInteger = scanner.nextInt();
		
		//Find the largest power of then for which 10^x is smaller than myInteger
		for ( power10 = 0 ; myInteger >= Math.pow(10 , power10-1) ; power10++ ) {
			// NOTE: Yes, this for loop is empty. Not a mistake!
		}
		
		
		for (power10 = power10 - 2 ;power10 > -1; power10-- ) {
			//Isolate the first digit from myInteger
			division = myInteger/(int) Math.pow(10 , power10 );
			
			// Display said digit
			switch (division) {
				case 1: System.out.print("one ");
				break;
				
				case 2: System.out.print("two ");
				break;
				
				case 3: System.out.print("three ");
				break;
				
				case 4: System.out.print("four ");
				break;
				
				case 5: System.out.print("five ");
				break;
				
				case 6: System.out.print("six ");
				break;
				
				case 7: System.out.print("seven ");
				break;
				
				case 8: System.out.print("eight ");
				break;
				
				case 9: System.out.print("nine ");
				break;
				
				case 0: System.out.print("zero ");
				break;
			}
			//Get rid of the first digit from myInteger
			myInteger = myInteger % (int)Math.pow(10 , power10) ;		
		}
		
		
		scanner.close();
	}

}
