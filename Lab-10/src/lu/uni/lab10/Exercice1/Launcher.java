package lu.uni.lab10.Exercice1;

import java.io.FileNotFoundException;
import java.io.IOException;

import lu.uni.lab10.Exercice1.Verse.Verse;

public class Launcher {

	public static void main(String[] args) {
		Verse carol = new Verse();
		try {
			
			for (int i = 1 ; i <= 12 ; i++ ) {
			
				carol.showVerse(i, "xmas12.txt");
			}
			
			
			
		} catch (FileNotFoundException e) {
				
				e.printStackTrace();
		} catch (IOException e) {
				
				e.printStackTrace();
		}
		
		
	}

}
