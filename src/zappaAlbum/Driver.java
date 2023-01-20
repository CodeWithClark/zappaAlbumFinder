/**
 * A program to search through Frank Zappa's catalog.
 * 
 * Author: Jordan Clark
 * Email: CodeWithClark@gmail.com
 * Web site: CodeWithClark.com
 * Date Modified: 23JAN19
 */

package zappaAlbum;

public class Driver {

	// Runs program
	public static void main(String[] args) {
		SearchAlbums.initializeSongList();
		SearchAlbums.initializeAllAlbumsList();
		Menu.displayWelcomeScreen();
	}
}
