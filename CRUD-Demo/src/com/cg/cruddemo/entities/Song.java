package com.cg.cruddemo.entities;

import javax.persistence.*;

@Entity
@Table(name="songs")
public class Song {

	@Id
	private Integer songId;
	
	@Column(name="singers",nullable=false,length=30)
	private String singer;
	
	@Column(name="album",length=120)
	private String album;

	public Integer getSongId() {
		return songId;
	}

	public void setSongId(Integer songId) {
		this.songId = songId;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public Song() {
		super();
	}

	public Song(Integer songId, String singer, String album) {
		super();
		this.songId = songId;
		this.singer = singer;
		this.album = album;
	}

	
}
