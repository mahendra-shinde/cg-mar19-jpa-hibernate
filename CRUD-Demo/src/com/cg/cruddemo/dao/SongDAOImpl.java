package com.cg.cruddemo.dao;

import javax.persistence.EntityManager;

import com.cg.cruddemo.entities.Song;
// Implementation for SongDAO
public class SongDAOImpl implements SongDAO {
	
	//Inject "EntityManager" using JPAUtils class
	private EntityManager em = JPAUtil.getEntityManager();
	
	@Override
	public Song getSongById(int id) {
		return em.find(Song.class, id);
	}

	@Override
	public void addSong(Song song) {
		em.persist(song);
	}

	@Override
	public void removeSong(Song song) {
		em.remove(song);
	}

	@Override
	public void updateSong(Song song) {
		em.persist(song);
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
	}

}
