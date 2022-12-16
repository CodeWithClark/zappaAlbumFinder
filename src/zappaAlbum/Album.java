package zappaAlbum;

import java.lang.String;
import java.util.List;

public class Album {

	// Instance variables
	private String title;
	private String year;
	private List<String> trackList;
	
	public Album(String title, String year, List<String> trackList) {
		super();
		this.title = title;
		this.year = year;
		this.trackList = trackList;
	}

	/* Chat GPT suggested this when trying to write code for selection menu item 1.
	 * 
	 *     I feel there is something useful here to consolidate my methods but unsure how to implement it.
	 * 
	 * public boolean checkInput(Object input) {
		if (input instanceof Album) {
			Album inputAsAlbum = (Album) input;
			
		    if(inputAsAlbum.title.equals(this.title) || 
		       inputAsAlbum.year.equals(this.year) ||
		       inputAsAlbum.trackList.equals(this.trackList)) {
		    }
		}
		return true;	
	}
	*
	*/
	
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