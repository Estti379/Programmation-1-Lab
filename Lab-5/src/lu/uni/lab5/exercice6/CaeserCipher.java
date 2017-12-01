package lu.uni.lab5.exercice6;

import java.util.Scanner;

public class CaeserCipher {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String plainText = new String(), cipherText = new String("");
		int i = 0;
		int shift = 0;
		char currentChar = ' ';
		
		System.out.println("What is your message?");
		plainText = scanner.nextLine();
		plainText = plainText.replaceAll("[^a-zA-Z0-9 ]", "");
		
		do {
			System.out.println("What is your shift?"
								+"(Can't be 0 or a multiple of 26)");
			while ( !scanner.hasNextInt() ) {
				scanner.nextLine();
				System.out.println("What is your shift?"
									+"(Can't be 0 or a multiple of 26)");
			}
			shift = scanner.nextInt();
			scanner.nextLine();
		} while ( (shift % 26) == 0 );
		
		for ( i = 0 ; i < plainText.length() ; i ++) {
			currentChar = plainText.charAt(i);
			if ( currentChar == ' ' ) {
				cipherText = cipherText + ' ';
				
			} else if ( (currentChar >= 'a') && (currentChar <= 'z') ) {
				if ( (currentChar + shift) > 'z' ) {
					cipherText = cipherText + (char)(currentChar + shift - 26);
					
				} else if ( (currentChar + shift) < 'a' ) {
					cipherText = cipherText + (char)(currentChar + shift + 26);
					
				} else {
					cipherText = cipherText + (char)(currentChar + shift);
				}
				
			} else if ( (currentChar >= 'A') && (currentChar <= 'Z') ) {
				if ( (currentChar + shift) > 'Z' ) {
					cipherText = cipherText + (char)(currentChar + shift - 26);
				} else if ( (currentChar + shift) < 'A' ) {
					cipherText = cipherText + (char)(currentChar + shift + 26);
				} else {
					cipherText = cipherText + (char)(currentChar + shift);
				}
				
			} else if ( (currentChar >= '0') && (currentChar <= '9') ) {
				if ( (currentChar + shift) > '9' ) {
					cipherText = cipherText + (char)(currentChar + shift - 10);
				} else if ( (currentChar + shift) < '0' ) {
					cipherText = cipherText + (char)(currentChar + shift + 10);
				} else {
					cipherText = cipherText + (char)(currentChar + shift);
				}
				
			}
		}
		
		System.out.println(plainText);
		System.out.println(cipherText);
		
		
		scanner.close();
	}

}
