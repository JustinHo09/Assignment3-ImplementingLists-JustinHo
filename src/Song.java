/**
 * This is a class that represents a song in sportify and has
 * three member data, title, artist, and length.
 */
public class Song {
    public String title;
    public String artist;
    public double length;

    /**
     * This constructor creates a new song and initializes all of its
     * values to the parameters.
     *
     * @param title The title of the song.
     * @param artist The song's artist.
     * @param length The song's duration.
     */
    public Song(String title, String artist, double length){
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    /**
     * This returns a string with all the songs information formated
     * { title, artist, length}.
     *
     * @return A string with all the song's information.
     */
    public String toString(){
        String dataString = "{ Title :"+title+", Artist: "+artist+", Length: "+length+ " }";
        return dataString;
    }
}
