package lu.uni.lab10.Exercice1.Verse;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Verse {
	
	static Scanner scanner;
	
	public void showVerse(int day, String carolFile) throws FileNotFoundException, IOException {
		
		try (BufferedReader inputStream =
				new BufferedReader( new FileReader(carolFile) ) ) {
			
			int i = 0;
			String line = null;
			
			for ( i = 1 ; i <= day; i++ ) {
				line = inputStream.readLine();
			}
			
			if (line != null) {
				scanner = new Scanner(line);
				System.out.println("On the " + scanner.next() + " day of "
						+ "Christmas,\nMy true love sent to me");
			}
			
			
			countDown(day, carolFile);
			
			System.out.println();
		
		}
		
		
		
	}
	
	private void countDown(int day, String carolFile) throws IOException {
		try (BufferedReader inputStream =
				new BufferedReader( new FileReader(carolFile) ) ) {	
			int i = 0;
			String line = null;
				
			if (day != 0) {
				for ( i = 1 ; i <= day; i++ ) {
					line = inputStream.readLine();
				}
				scanner = new Scanner(line);
				scanner.next();
				line = scanner.nextLine();
				System.out.println( line.substring(1, line.length()) );
				countDown(day - 1, carolFile);
			}
		}
	}
	
}
