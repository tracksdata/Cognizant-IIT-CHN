package oo;

import java.util.ArrayList;
import java.util.List;

class Song {
	private String name;
	private int duration;

	public Song(String name, int duration) {
		this.name = name;
		this.duration = duration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Song{" + "name=" + name + ", duration=" + duration + '}';
	}
}

interface SchedulingStrategy {
	public Song nextSong(List<Song> Songs);
}

class PlayList {
	private List<Song> songs;
	private SchedulingStrategy strategy;

	public PlayList() {
		songs = new ArrayList<>();
	}

	public void addSong(Song song) {
		songs.add(song);
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}

	public void setStrategy(SchedulingStrategy strategy) {
		this.strategy = strategy;
	}

	public Song getNextSong() {
		return strategy.nextSong(songs);
	}
}

class FCFSStrategy implements SchedulingStrategy {

	@Override
	public Song nextSong(List<Song> songs) {
		return songs.get(0);
	}
}

class SSFStrategy implements SchedulingStrategy {

	@Override
	public Song nextSong(List<Song> songs) {
		Song shortest = songs.get(0);
		for (Song task : songs) {
			if (shortest.getDuration() > task.getDuration()) {
				shortest = task;
			}
		}
		return shortest;
	}
}

class LSFStrategy implements SchedulingStrategy {

	@Override
	public Song nextSong(List<Song> songs) {
		Song longest = songs.get(0);
		for (Song task : songs) {
			if (longest.getDuration() < task.getDuration()) {
				longest = task;
			}
		}
		return longest;
	}
}

public class Strategy_Ex {

	public static void main(String[] args) {

		PlayList playList = new PlayList();
		playList.addSong(new Song("la la", 3));
		playList.addSong(new Song("ha ha", 1));
		playList.addSong(new Song("whoo whoo", 4));

		playList.setStrategy(new SSFStrategy());

		System.out.println(playList.getNextSong());
		
		
		

	}

}
