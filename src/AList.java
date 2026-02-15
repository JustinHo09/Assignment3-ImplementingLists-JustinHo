public class AList <T> {

    public int size;
    public int maxSize;
    public T[] ABList;

    public AList(){
        size = 0;
        maxSize = 4;
        ABList =  (T[])(new Object[maxSize]);
    }

    public void addy(T p){
        if(size == maxSize){
            ABList = resize(ABList);
        }
        ABList[size] = p;
        size++;

    }

    public T[] resize(T[] original){
        maxSize= maxSize*2;
        T[] resizedList = (T[]) (new Object[maxSize]);
        for(int i = 0; i<original.length;i++){
            resizedList[i] = original[i];
        }
        return resizedList;
    }

    public void removy(int pos){
        //Checks to see if the entered index is a valid index
        if(pos <size && pos >=0){
            for(int i=pos;i<size-1;i++){
                ABList[i] = ABList[i+1];
            }
            size--;
        }else{
            System.out.println("Not a valid index in AList");
        }
    }

    public String toString(){
        String output="";
        for(int i=0; i<size; i++){
            output= output+ABList[i].toString()+"\n";
        }
        return output;
    }

}
