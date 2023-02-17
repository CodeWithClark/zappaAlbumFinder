# Frank Zappa - CLI Search (Written in Java)

## Search Frank Zappa's music catalog for an album, a track, or a release year.

This project allows you to search Frank Zappa's music catalog from the command line. It showcases my ability to use object-oriented programming to write a functional Java program from scratch. 

* Driver Class - Initializes program
* Menu Class - Welcome message, menu options
* Album Class -  Album constructor, print all tracks
* SearchAlbums Class - Initialize album objects & track lists, searches using user input

## How To Run (Terminal / Command Prompt)

### 1. Install Java

Make sure you have Java installed:

```
java -version
```

* Visit https://www.java.com/en/download/help/download_options.html for more info.

### 2. Clone this repository

```
git clone https://github.com/CodeWithClark/zappaAlbumFinder.git
```

Or:

Locate the green **`< > Code`** button and select DOWNLOAD ZIP

### 3. Compile program

```
cd zappaAlbumFinder
cd src
javac -cp . zappaAlbum/*.java
java -cp . zappaAlbum/Driver
```

## Notes

There are currently only 3 Zappa albums available in this project.

I would suggest using this program like this:

1. Select **[2] View all albums** to find the attached albums, track lists, and release dates
2. Pick one you'd like to search for
3. Select **y** to keep searching
4. Select **[1] Search album, song, or release year** then type your chosen search
5. To exit the program, type **3** if on the main menu or **n** if asked to **Keep searching?**
