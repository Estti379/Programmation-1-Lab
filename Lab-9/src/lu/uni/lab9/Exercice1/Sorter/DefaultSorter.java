package lu.uni.lab9.Exercice1.Sorter;

import java.util.List;
import lu.uni.lab9.Exercice1.MusicPlayer.Playlist;
import lu.uni.lab9.Exercice1.MusicPlayer.Song;

public class DefaultSorter implements PlaylistSorter {

	@Override
	public List<Song> sort(Playlist toBeSorted) {
		return toBeSorted.getSongs();
	}

}
