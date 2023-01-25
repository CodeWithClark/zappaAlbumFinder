package zappaAlbum;

//import java.util.HashMap;
import java.lang.String;
import java.util.List;

public class Album {
	
	// Instance variables
	private String title;
	private String year;
	private List<String> trackList;
	
	// Constructor for Album Object
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
	
	// Method to unify format for displaying album information.
	void displayAlbumInformation() {
        System.out.println("Album: " + title + " (" + year + ")");
        System.out.println("Songs:");
        displayTrackList();
	}
	
	void displayTrackList() {
		for (int i = 0; i < trackList.size(); i++) {
			System.out.println("       " + (i+1) + ". " + trackList.get(i));
		}
		System.out.println();
	}
	
	void displayTrack(String searchInput) {
		int index = trackList.indexOf(searchInput);
	    if (index != -1) {
	        System.out.println("\n" + searchInput + " is track number " + (index + 1) + " on the " + title + " album, released in " + year + ".");
	    } else {
	        System.out.println("Track not found on album " + title);
	    }
	}
}
