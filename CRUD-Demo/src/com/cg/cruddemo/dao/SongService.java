package com.cg.cruddemo.dao;

import com.cg.cruddemo.entities.Song;

public interface SongService {

	public abstract void addSong(Song song);

	public abstract void updateSong(Song song);

	public abstract void removeSong(Song song);

	public abstract Song findSongById(int id);
}
