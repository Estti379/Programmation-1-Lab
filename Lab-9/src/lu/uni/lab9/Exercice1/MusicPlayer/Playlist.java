package lu.uni.lab9.Exercice1.MusicPlayer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import lu.uni.lab9.Exercice1.Sorter.PlaylistSorter;

public class Playlist {

	private String name;
	private Set<Song> songs;

	public Playlist(String name) {
		this.name = name;
		this.songs = new LinkedHashSet<>();
	}
	
	public String getName() {
		return this.name;
	}

	public List<Song> getSongs() {
		return new ArrayList<Song>(this.songs);
	}

	public int getTotalDuration() {
		int sum = 0;

		for (Song s : this.songs) {
			sum += s.getDuration();
		}

		return sum;
	}

	public int getNumberOfSongs() {
		return this.songs.size();
	}

	public void add(Song s) {
		this.songs.add(s);
	}
	
	public void setSongs(Set<Song> list) {
		this.songs = list;
	}

	public void play() {
		System.out.println("Playing list '" + this.name + "' (total running time: "
				+ Song.formatDuration(this.getTotalDuration()) + ")");

		for (Song s : this.songs) {
			s.play();
		}
	}

	@Override
	public String toString() {
		return this.getName();
	}
	
	public Playlist trier(PlaylistSorter sorter, String name) {	
		Playlist newList = new Playlist(name);
		Set<Song> sortedList = new ArrayList<Song>;
		sortedList.addAll( sorter.sort(this) );
		newList.setSongs(sortedList);
		return newList; 
	}

}
