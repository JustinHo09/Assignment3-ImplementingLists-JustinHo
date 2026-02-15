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

        AListTest(alistSong, songs);

    }

    public static void AListTest(AList list, Song[] songs){

        System.out.println("Initial elements in AList (Should be empty)");
        System.out.println(list.toString());
        System.out.println("Now adding 4 elements(max)");
        for(int i=0; i<4;i++){
            list.addy(songs[i]);
        }
        System.out.println(list.toString());

        System.out.println("Adding an element after max");
        list.addy(songs[4]);
        System.out.println(list.toString());

        System.out.println("Adding a duplicate(should be allowed)");
        list.addy(songs[0]);
        System.out.println(list.toString());

        System.out.println("Removing element at index 1");
        list.removy(1);
        System.out.println(list.toString());

        System.out.println("Removing an element at the end");
        list.removy(4);
        System.out.println(list.toString());

        System.out.println("Removing at an index greater than size");
        list.removy(6);
        System.out.println(list.toString());
        System.out.println("Test done");
    }


}
