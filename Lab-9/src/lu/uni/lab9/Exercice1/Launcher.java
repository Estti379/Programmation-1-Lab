package lu.uni.lab9.Exercice1;

import lu.uni.lab9.Exercice1.MusicPlayer.Playlist;
import lu.uni.lab9.Exercice1.MusicPlayer.Song;

public class Launcher {

	public static void main(String[] args) {

		Playlist notp = new Playlist("Night of the Proms 2016");
		notp.add(new Song("Don't You", "Simple Minds", 261));
		notp.add(new Song("Life Is A Rollercoaster", "Ronan Keating", 237));
		notp.add(new Song("Unwritten", "Natasha Bedingfield", 259, 4));
		notp.add(new Song("The Unforgiven", "Stefanie Heinzmann", 212));
		notp.add(new Song("Music", "John Miles", 352, 10));

		// will not be added twice due to use of set
		notp.add(new Song("Music", "John Miles", 352, 10));

		System.out.println("Number of songs in playlist " + notp.getName() + ": " + notp.getNumberOfSongs());

		notp.play();
	}
}
