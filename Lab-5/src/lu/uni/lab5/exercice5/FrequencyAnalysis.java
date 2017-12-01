package lu.uni.lab5.exercice5;

import java.util.Scanner;

public class FrequencyAnalysis {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] frequency = new int[26];
		int i = 0, letter = 0;
		
		String text;
		
		System.out.println("Type something:");
		text = scanner.nextLine();
			
		text = text.toUpperCase().replaceAll("[^A-Z]", "");
		
		for ( letter = (int)'A'; letter <= (int)'Z' ; letter++) {
			for ( i = 0 ; i < text.length() ; i++ ) {
				if ( text.charAt(i) == ( (char)letter ) ) {
					frequency[letter - (int)'A']++;
				}
			}
		}
		
		for ( letter = (int)'A'; letter <= (int)'Z' ; letter++) {
			System.out.println( (char)letter + " appears "
								+ frequency[letter - (int)'A'] + " times.");
		}
		
		
		scanner.close();
	}

}
