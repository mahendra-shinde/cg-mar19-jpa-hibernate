package com.cg.cruddemo;

import com.cg.cruddemo.dao.SongService;
import com.cg.cruddemo.dao.SongServiceImpl;
import com.cg.cruddemo.entities.Song;

public class Main {

	public static void main(String[] args) {
		SongService service = new SongServiceImpl();
		service.addSong(new Song(1021, "Swapnil Bandodkar", "Radha"));
		service.addSong(new Song(1022, "Ajay-Atul", "Agnipath"));
		service.addSong(new Song(1023,"Ajay-atul","Sairat"));
		
		Song s = service.findSongById(1022);
		s.setAlbum("Local train");
		service.updateSong(s);
		
		Song s2 = service.findSongById(1022);
		System.out.println("Song album : "+s2.getAlbum()+" Singers: "+s2.getSinger());
	}

}
