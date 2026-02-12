public class AList {

    public int size;
    public int maxSize;
    public Song[] ABList;

    public AList(){
        size = 0;
        maxSize = 4;
        ABList = new Song[maxSize];
    }

    public void addy(Song p){
        if(size == maxSize){
            ABList = resize(ABList);

        }
        ABList[size] = p;
        size++;

    }

    public Song[] resize(Song[] original){
        maxSize= maxSize*2;
        Song[] resizedList = new Song[maxSize];
        for(int i = 0; i<original.length;i++){
            resizedList[i] = original[i];
        }
        return resizedList;
    }


}
