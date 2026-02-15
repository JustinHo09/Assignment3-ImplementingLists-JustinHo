public class Test {

    public static void main(String[] args){
        AList alistSong = new AList();
        SLList slSong = new SLList();
        DLList dlSong = new DLList();

        Song [] songs = new Song[5];

        Song song1 = new Song("Gira Gira", "Ado", 2.58);
        Song song2 = new Song("Color Your Night",  "Atlus", 2.45);
        Song song3 = new Song("New Genisis", "Ado", 3.00);
        Song song4 = new Song("Whims of Fate", "Lyn", 4.25);
        Song song5 = new Song("Virtual Insanity", "Jamiroquai", 3.55);

        songs[0] = song1;
        songs[1] = song2;
        songs[2] = song3;
        songs[3] = song4;
        songs[4] = song5;

    }

    


}
