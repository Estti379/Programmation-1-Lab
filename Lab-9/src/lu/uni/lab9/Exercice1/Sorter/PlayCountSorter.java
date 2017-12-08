package lu.uni.lab9.Exercice1.Sorter;

import java.util.Collections;
import java.util.List;
import lu.uni.lab9.Exercice1.MusicPlayer.Playlist;
import lu.uni.lab9.Exercice1.MusicPlayer.Song;

public class PlayCountSorter implements PlaylistSorter {

	@Override
	public List<Song> sort(Playlist toBeSorted) {
		List<Song> sortedList = toBeSorted.getSongs();
		Collections.sort(sortedList);
		
		return sortedList;
	}

	
}
