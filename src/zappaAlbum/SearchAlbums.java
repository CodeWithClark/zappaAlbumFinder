package zappaAlbum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchAlbums {
	static ArrayList<Album> allAlbums = new ArrayList<Album>();
	private static List<String> songs1;
	private static List<String> songs2;
	private static List<String> songs3;
	private static Scanner scanner;

	public static void initializeSongList() {
		songs1 = new ArrayList<String>(List.of("DON'T EAT THE YELLOW SNOW", "NANOOK RUBS IT", 
	    		"ST. ALPHONZO'S PANKCAKE BREAKFAST", "FATHER O'BLIVION", 
	    		"COSMIK DEBRIS", "EXCENTRIFUGAL FORCE", "APOSTROPHE", 
	    		"UNCLE REMUS", "STINK-FOOT"));
		
		songs2 = new ArrayList<String>(List.of("THE CENTRAL SCRUTINIZER", "JOE'S GARAGE", 
	    		"CATHOLIC GIRLS", "CREW SLUT", 
	    		"WET T-SHIRT NITE", "TOAD-O LINE", "WHY DOES IT HURT WHEN I PEE?", "LUCILLE HAS MESSED MY MIND UP",
	    		"A TOKEN OF MY EXTREME", "STICK IT OUT", "SY BORG", "DONG WORK FOR YUDA", "KEEP IT GREASEY",
	    		"OUTSIDE NOW", "HE USED TO CUT THE GRASS", "PACKARD GOOSE", "WATERMELON IN EASTER HAY", 
	    		"A LITTLE GREEN ROSETTA"));
		
		songs3 = new ArrayList<String>(List.of("SONG1", "SONG2"));
	}
	
	public static void initializeAllAlbumsList() {
		
		// Create new album objects
		Album album1 = new Album("Apostrophe", "1974", songs1);
		Album album2 = new Album("Joe's Garage", "1979",songs2);
		Album album3 = new Album("Album3", "2023", songs3);
		
		// Add albums to allAlbums array list
		allAlbums.add(album1);
		allAlbums.add(album2);	
		allAlbums.add(album3);
	}
	
	// Menu option [2] Print all albums in allAlbums array list
	public static void printAllAlbums() {
		// for each album inside of allAlbums array list, 
		//     print with displayAlbumInformation() 
		for(Album album: allAlbums) {
			album.displayAlbumInformation();
		}
		
		// Prompt user to search or exit
		Menu.keepSearching();
	}

	// Menu option [1]: Search user input through title, year, or track list
	public static void searchAlbums() {
        scanner = new Scanner(System.in);
        
        System.out.println("Enter your search: ");
        String searchInput = scanner.nextLine().toUpperCase();
        
        // For each album in allAlbums array list
        //     Check user input to album title, year, or track list
        //        Print specific information
        for(Album album: allAlbums) {        	
        	if (album.getTitle().toUpperCase().contains(searchInput)) {
        		System.out.println("\nThe album "+ album.getTitle() + " is listed below:\n");
        		album.displayAlbumInformation();
        		
        	}
        	else if (album.getYear().contains(searchInput)) {
        		System.out.println("\nThe albums released in the year " + album.getYear() + " are listed below:");
        		System.out.println("\n" + album.getTitle());
        		
        	}
        	else if (searchSongs(searchInput, album)) {
        		//System.out.println("\n Test Print");
        		album.displayTrack(searchInput);
        	}
        }
        
        Menu.keepSearching(); 
        
    }
	
	private static boolean searchSongs(String searchInput, Album album) {
		
		List<String> albumTrackList = album.getTrackList();
		
		for(String albumTrack: albumTrackList) {
			if(albumTrack.toUpperCase().contains(searchInput)) {
				return true;
			}
		}
		
		return false;
	}

}
