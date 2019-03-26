package com.cg.cruddemo.dao;

import com.cg.cruddemo.entities.Song;

/*
 * A Service Implementation class MUST NEVER expose JDBC/ORM/JPA code !
 */
public class SongServiceImpl implements SongService {

	private SongDAO dao = new SongDAOImpl();
	
	@Override
	public void addSong(Song song) {
		dao.beginTransaction();
		dao.addSong(song);
		dao.commitTransaction();
	}

	@Override
	public void updateSong(Song song) {
		dao.beginTransaction();
		dao.updateSong(song);
		dao.commitTransaction();
	}

	@Override
	public void removeSong(Song song) {
		dao.beginTransaction();
		dao.removeSong(song);
		dao.commitTransaction();
	}

	@Override
	public Song findSongById(int id) {
		// TODO Auto-generated method stub
		return dao.getSongById(id);
	}

}
