package zappaAlbum;

import java.lang.String;
import java.util.List;

public class Album {

	// Instance variables
	private String title;
	private String year;
	private List<String> trackList;
	
	public Album(String title, String year, List<String> trackList) {
		this.title = title;
		this.year = year;
		this.trackList = trackList;
	}
	
	public String getTitle() {
		return title;
	}

	public String getYear() {
		return year;
	}

	public List<String> getTrackList() {
		return trackList;
	}	

}