# Frank Zappa Search Engine (Java project)

## Search for an album, a track list, or release year.

This project is a search engine for Frank Zappa's music catalog and showcases my ability to use object-oriented programming to write a functional program from scratch. 
It contains:
* Driver Class - Runs program
* Menu Class - Welcome display; menu selection; keep searching option
* Album Class -  Album constructor; print all format
* SearchAlbums Class - Album objects; track lists; loops to check user input against internal data

## How To Run Program In Terminal / Command Prompt
### Install Java
* In terminal or command prompt copy & paste “java -version” to see which version you have
* Visit https://www.java.com/en/download/help/download_options.html for more info

### In Github
* Locate the green “< > Code” button and select DOWNLOAD ZIP

### In terminal
* Locate file: zappaAlbumFinder-master
* Go to: src
* copy & paste: "javac -cp . zappaAlbum/*.java"
* copy & paste: "java -cp . zappaAlbum/Driver"

## Recommended Use:
There are only 3 album objects created in order to test the program. Once you have opened the program successfully, please do the following:
* Select “[2] View all albums” to find the attached albums, track lists and release date. 
* Afterwards, select “y” to keep searching
* Select “[1] Search album, song, or release year” then copy and paste desired search
* Select “[3] To exit program” if in selection menu, or “n” when asked to “Keep searching?” to close program.
