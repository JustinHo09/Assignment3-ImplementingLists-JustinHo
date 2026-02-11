public class Song {
    public String title;
    public String artist;
    public double length;

    public Song(String title, String artist, double length){
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    public String toString(){
        String dataString = "{ Title :"+title+", Artist: "+artist+",Length: "+length+ " }";
        return dataString;
    }
}
