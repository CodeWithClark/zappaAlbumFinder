package zappaAlbum;
import java.util.Scanner;

public class Menu {
	static Scanner scnr = new Scanner(System.in);

	/*
	 *  Method to welcome the user to the application
	 *  and send user to selection menu
	 */
	public static void displayWelcomeScreen() {
		// Welcome user to application
		System.out.println("*****************************************************\n");
		System.out.println("        Welcome to EAT THAT ALBUM!\n (the Frank Zappa Album search enigne)");
		System.out.println("\n\nPlease select one of the following: ");
		selectionMenu();
    }

	
	/*
	 *  Method to display selection menu, take user input
	 *  and execute desired action
	 */
    public static void selectionMenu() {
		
    	System.out.println();
		System.out.println("[1] Search album, song, or release year");
		System.out.println("[2] View all albums");
		System.out.println("[3] To exit program\n");
		String input = scnr.nextLine();

		// User "try and catch" for input validation
		try {
			int userSelection = Integer.parseInt(input);
			//userSearchInput = scnr.nextLine();
			
			switch(userSelection) {
				case 1:
					SearchAlbums.searchAlbums();
					break;
			
				case 2:
					SearchAlbums.printAllAlbums();
					break;
			
				case 3:
					System.out.println("\n\n===========");
					System.out.println("\nGood bye.");
					System.out.println("\n===========");
					scnr.close();
					System.exit(0);
					
				// Input validation for out of range numbers
				default:
					System.out.println("\nYou entered a number other than 1, 2, or 3. \n");
					System.out.println("LET'S TRY THAT AGAIN!\n");
					selectionMenu();
			}
		
		// Input validation when user does not enter an integer
		} catch (NumberFormatException e) {
			System.out.println("\nInvalid input. Please enter 1, 2, or 3.");
			selectionMenu();
		}
    }
	
    public static void keepSearching() {	
	    System.out.println();
		System.out.println("\nKeep searching? (y or n)");
		
		String input = scnr.nextLine();
		String userKeepSearching = input;
	
		//userSearchInput = scnr.nextLine();
		if (userKeepSearching.equalsIgnoreCase("y")) {
			System.out.println();
			selectionMenu();
		} 
		
		else if(userKeepSearching.equalsIgnoreCase("n")){
			System.out.println("\n\n===========");
			System.out.println("\nGood bye.");
			System.out.println("\n===========");
			scnr.close();
			System.exit(0);
			return;
	
		} else
			System.out.println("PLEASE ENTER 'Y' OR 'N'.\n");
			keepSearching();
		}
}