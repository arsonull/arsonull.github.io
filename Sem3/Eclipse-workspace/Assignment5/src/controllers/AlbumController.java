package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import beans.Album;
import business.MusicManager;
import util.TracksNotFoundException;

@ManagedBean
@ViewScoped
public class AlbumController
{
	public String onSubmit(Album album)
	{
		MusicManager mgr = new MusicManager();
		try
		{
			album = mgr.addAlbum(album);
		}
		catch (TracksNotFoundException e)
		{
			System.out.println("===========> Album not found");
		}
		
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("album", album);
		return "AddAlbumResponse.xhtml";
	}
}
