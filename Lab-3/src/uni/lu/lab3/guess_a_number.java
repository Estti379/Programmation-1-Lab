package uni.lu.lab3;

import java.util.Random;
import java.util.Scanner;

public class guess_a_number {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random generator = new Random(System.currentTimeMillis());
		
		//NOTE: generator.nextInt(99) is a number between 0 and 99
		// generator.nextInt(99) + 1 is a number between 1 and 100
		int randomNumber = generator.nextInt(99) + 1;
		int numberOfTries = 0, userGuess= 0; 
		
		System.out.println("Try to guess my number! (1 to 100)");
		
		do {
			userGuess= scanner.nextInt();
			numberOfTries++;
			
			if (userGuess < randomNumber) {
				System.out.println("Nah, my number is bigger!");
			} else { // if (userGuess > randomNumber)
				System.out.println("Nah, my number is smaller!");
			} // Note: if userGuess = randomNumber this condition structure is ignored!
			
		} while (userGuess != randomNumber);
		
		System.out.println("Oh, waouh! You guessed right! My number really is "
						+ randomNumber + "!\nIt took you " + numberOfTries
						+ " tries to find it, impressive!");

		scanner.close();
	}

}
