package com.cg.cruddemo.dao;

import com.cg.cruddemo.entities.Song;

public interface SongDAO {
	public abstract Song getSongById(int id);

	public abstract void addSong(Song Song);

	public abstract void removeSong(Song Song);

	public abstract void updateSong(Song Song);

	public abstract void commitTransaction();

	public abstract void beginTransaction();
}
