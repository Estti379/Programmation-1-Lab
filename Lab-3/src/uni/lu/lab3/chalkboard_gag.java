package uni.lu.lab3;

import java.util.Scanner;

public class chalkboard_gag {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Miss Krabappel, how many times does bart need to copy"
						   + " his message today?");
		
		int numberOfLines = scanner.nextInt();
		
		for (int i=1;i<=numberOfLines;i++) {
		System.out.println("I am not allergic to long division!" + i);
		}
		
		scanner.close();
	}

}
