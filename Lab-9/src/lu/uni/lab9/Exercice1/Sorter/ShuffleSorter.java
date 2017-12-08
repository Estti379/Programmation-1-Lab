package lu.uni.lab9.Exercice1.Sorter;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import lu.uni.lab9.Exercice1.MusicPlayer.Playlist;
import lu.uni.lab9.Exercice1.MusicPlayer.Song;

public class ShuffleSorter implements PlaylistSorter {

	@Override
	public List<Song> sort(Playlist toBeSorted) {
		List<Song> sortedList = toBeSorted.getSongs();
		Collections.shuffle( sortedList );
		
		/* TODO Delete me*/
		for (int i = 0 ; i < sortedList.size() ; i++ ) {
			System.out.println( sortedList.get(i).toString() );
		}
		
//		Iterator<Song> iterator = sortedList.iterator();
		/* delete up to here */
		
		return sortedList;
	}

}
