package zappaAlbum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
        
		// Welcome user to app
		System.out.println("*****************************************************\n");
		System.out.println("        Welcome to EAT THAT ALBUM!\n (the Frank Zappa Album search enigne)");
		System.out.println("\n\nPlease select one of the following: ");
		selectionMenu();
		
		Scanner scnr = new Scanner(System.in);
		
		// User input for selection menu
		String userInput = scnr.nextLine();
		
		// Loop through selection menu
		while(!userInput.equalsIgnoreCase("q")) {
			
			if(userInput.contains("1")) {
				albumToSong(scnr);
				userInput = scnr.nextLine();
			}
			
			else if(userInput.contains("2")) {
				songToAlbum(scnr);
				userInput = scnr.nextLine();
			}
			
			else if(userInput.contains("3")) {
				yearToAlbum(scnr);
				userInput = scnr.nextLine();
			}
	     	
			// Input validation
	     	else {
	     		System.out.println("You're request is invalid. Please select 1 through 3, or 'q' for quit.");
	     		System.out.println("======================================================================");
	     		selectionMenu(); // Display selection menu again
	     		userInput = scnr.nextLine(); // Prompt user to input again
	     	}
	     }
	     
		// Allow user to quit program
	     if (userInput.equalsIgnoreCase("q")) {
	    	 System.out.println("\n\n===========");
	    	 System.out.println("\nGood bye.");
	    	 System.out.println("\n===========");
	    	 scnr.close();
	    	 System.exit(0);
	    }
	}
		    
	// Create Album objects
	    // Create an Array List for trackList parameter
	    public static List<String> songs = new ArrayList<String>(List.of("Don't Eat the Yellow Snow", "Nanook Rubs It", 
	    		"St. Alphonzo's Pankcake Breakfast", "Father O'Blivion", 
	    		"Cosmik Debris", "Excentrifugal Force", "Apostrophe", 
	    		"Uncle Remus", "Stink-Foot"));
	    
	    // Create album
		static Album album1 = new Album("Apostrophe", "1974", songs);
		
		public static List<String> songs2 = new ArrayList<String>(List.of("The Central Scrutinizer", "Joe's Garage", 
	    		"Catholic Girls", "Crew Slut", 
	    		"Wet T-Shirt Nite", "Toad-O Line", "Why Does It Hurt When I Pee?", "Lucille Has Messed My Mind Up",
	    		"A Token of My Extreme", "Stick It Out", "Sy Borg", "Dong Work for Yuda", "Keep It Greasey",
	    		"Outside Now", "He Used to Cut the Grass", "Packard Goose", "Watermelon in Easter Hay", 
	    		"A Little Green Rosetta"));
	    
		static Album album2 = new Album("Joe's Garage", "1979", songs2);
		
		// static ArrayList<Object> allAlbums = new ArrayList<>(List.of(album1, album2));
		
		/*
		 * TODO:
		 * Create an Array list containing all albums (Array List of objects)
		 *     Should be able to access constructor parameters (Title, Year, trackList)
		 *     
		 *     Attempted code:
		 *         static ArrayList<Object> allAlbums = new ArrayList<>(List.of(album1, album2));
		 * 
		 *     Problem:
		 *         - System out's [zappaAlbum.Album@42a57993, zappaAlbum.Album@75b84c92]
		 *         - How can I print a parameter from an object within a array list?
		 * 
		 *     Why do this?
		 *         - I could simplify the code by creating a method which loops though 1 array list.
		 *         - I want to prevent having to update each function every time an album is added.
		 */
	
	// Menu method to select type of search
    public static void selectionMenu() {
    	System.out.println();
		System.out.println("[1] Enter album to view songs");
		System.out.println("[2] Enter a song to find album");
		System.out.println("[3] Enter a year to find album");
		System.out.println("[q] To exit program\n");
	}
    
    
    /* Implementing suggestion from Chat GPT:
     *     boolean result = Album.checkInput();
     */
  
    
    // Method for Menu Selection 1
    public static void albumToSong(Scanner scanner) {
    	// Prompt user
        System.out.println("\nEnter an album: ");
        // Get user input
        String userAlbum = scanner.nextLine();
      
		/* 
		 * Compare user input to album title
		 *     If user input is in the object parameter
		 *     print the track list parameter.
		 */
		if (album1.getTitle().contains(userAlbum.toUpperCase())) {
			System.out.println("\n" + album1.getTitle() + ": \n" + 
		                       String.join("\n", album1.getTrackList()));
			
		} else if (album2.getTitle().contains(userAlbum.toUpperCase()))
			System.out.println("\n" + album2.getTitle() + ": \n" + 
                    String.join("\n", album2.getTrackList()));
		
		// Input validation
		else
			System.out.println("Your request is not in our data base.");
		
		// Return user to menu
		selectionMenu();
	}
		
    
	// Method for menu selection 2
	public static void songToAlbum(Scanner scnr){
		// Prompt user
		System.out.println("\nEnter a song: ");
		// Get user input
		String userSong = scnr.nextLine();
		
		/* 
		 * Compare user input to array lists
		 *     If user input is in array list
		 *     print album title
		 */
		
		if (songs.contains(userSong)) {
			System.out.println("\n" + userSong + "is on the " + album1.getTitle() + " album, released in " + album1.getYear() + ".");
			
		} else if (songs2.contains(userSong))
			System.out.println("\n" + userSong + "is on the " + album2.getTitle() + " album, released in " + album2.getYear() + ".");
		
		// Input validation
		else
			System.out.println("Your request is not in our data base.");
		
		// Return user to menu
		selectionMenu();
	}
	
	
	// Method for menu selection 3
	public static void yearToAlbum(Scanner scnr){
		// Prompt user
		System.out.println("\nEnter a year: ");
		// Get user input
		String userYear = scnr.nextLine();
		
		/* 
		 * Compare user input to year parameter
		 *     If user input is in the constructor parameter
		 *     print which album was released that year
		 */
		if (album1.getYear().contains(userYear)) {
			System.out.println("\n" + album1.getTitle());
			
		} else if (album2.getYear().contains(userYear))
			System.out.println("\n" + album2.getTitle());
		
		// Input validation
		else
			System.out.println("Your request is not in our data base.");
		
		// Return user to menu
		selectionMenu();
		}
}
