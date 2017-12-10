package lu.uni.lab9.Exercice1;

import lu.uni.lab9.Exercice1.MusicPlayer.Playlist;
import lu.uni.lab9.Exercice1.MusicPlayer.Song;
import lu.uni.lab9.Exercice1.Sorter.DefaultSorter;
import lu.uni.lab9.Exercice1.Sorter.PlayCountSorter;
import lu.uni.lab9.Exercice1.Sorter.ShuffleSorter;

public class Launcher {

	public static void main(String[] args) {

		Playlist notp = new Playlist("Night of the Proms 2016");
		Playlist prefered, random, defaultList;
		notp.add(new Song("Don't You", "Simple Minds", 261));
		notp.add(new Song("Life Is A Rollercoaster", "Ronan Keating", 237));
		notp.add(new Song("Unwritten", "Natasha Bedingfield", 259, 4));
		notp.add(new Song("The Unforgiven", "Stefanie Heinzmann", 212));
		notp.add(new Song("Music", "John Miles", 352, 10));
		
		PlayCountSorter preferedSorter = new PlayCountSorter();
		ShuffleSorter randomSorter = new ShuffleSorter();
		DefaultSorter defaultSorter = new DefaultSorter();

		// will not be added twice due to use of set
		notp.add(new Song("Music", "John Miles", 352, 10));

		System.out.println("Number of songs in playlist " + notp.getName() 
							+ ": " + notp.getNumberOfSongs());

		notp.play();
		
		System.out.println("____________________");
		
		random = notp.trier(randomSorter, "Random Songs");
		
		System.out.println("Number of songs in playlist " + random.getName() 
							+ ": " + random.getNumberOfSongs());

		random.play();
		
		System.out.println("____________________");
		
		prefered = notp.trier(preferedSorter, "Most played songs!");
		
		System.out.println("Number of songs in playlist " + prefered.getName() 
							+ ": " + prefered.getNumberOfSongs());

		prefered.play();
		
		
		System.out.println("____________________");
		
		defaultList = notp.trier(defaultSorter, "Most played songs!");
		
		System.out.println("Number of songs in playlist " + defaultList.getName() 
							+ ": " + defaultList.getNumberOfSongs());

		defaultList.play();
	}
}
