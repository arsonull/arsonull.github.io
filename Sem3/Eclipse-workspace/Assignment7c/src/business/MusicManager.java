package business;

import beans.Album;
import beans.Track;
import data.DataAccessInterface;
import data.MusicDataService;
import util.AlbumNotFoundException;
import util.LoggingInterceptor;
import util.TracksNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.interceptor.Interceptors;

/**
 * Session Bean implementation class MusicManager
 */
@Interceptors(LoggingInterceptor.class)
@Stateless
@Local(MusicManagerInterface.class)
@LocalBean
public class MusicManager implements MusicManagerInterface
{
	@EJB
	DataAccessInterface<Album> dao;
	@EJB
	Cache cache;
	@Inject
	TrackFinderInterface tf;
	HashMap<String, List<Track>> trackInfo;
	
    /**
     * Default constructor. 
     */
    public MusicManager()
    {
    	trackInfo = new HashMap<String, List<Track>>();
    	List<Track> tracks1 = new ArrayList<Track>();
    	tracks1.add(new Track("Taxman", 1));
    	tracks1.add(new Track("Eleanor Rigby", 2));
    	
    	trackInfo.put("The Beatles - Revolver - 1966", tracks1);
    }

	/**
	 * example of Facade design pattern
     * 1. Looks up the albums' tracks
     * 2. Validates the Tracks are valid
     * 3. Persists the Album in the Database (next week)
     */
    public Album addAlbum(Album album) throws TracksNotFoundException
    {
    	// Step 1
		//MusicDataService dao = new MusicDataService();
    	album.setTracks(tf.getTracks(album));
    	
		Album album2 = dao.findBy(album);
		if (album2 == null)
		{
			System.out.println("====================> Album does not exist");
			dao.create(album);
			album = dao.findBy(album);
		}
		else
		{
			System.out.println("=====================> Album already exists");
		}
		//Step 4 return the album
        return album;
    }
    
    public Album getAlbum(Album album) throws AlbumNotFoundException
    {
    	//MusicDataService dao = new MusicDataService();
    	Album albumNew = cache.getObject(album);
    	if (albumNew != null)
    	{
    		return albumNew;
    	}
    	Album album2 = dao.findBy(album);
    	
    	if (album2 == null)
    	{
    		throw new AlbumNotFoundException();
    	}
    	else
    	{
    		cache.putObject(album2);
    		return album2;
    	}
    }

}