/**
 * This Class is used to implement a listed with an array
 * making it an array based list. It also uses generics
 * so it can take in any object.
 * @param <T> The generic to use across the class.
 */
public class AList <T> {

    public int size;
    public int maxSize;
    public T[] ABList;

    /**
     * This is the constructor for AList, and it sets size to 0
     * max to 4 and makes an array of maxSize.
     */
    public AList(){
        size = 0;
        maxSize = 4;
        ABList =  (T[])(new Object[maxSize]);
    }

    /**
     * This adds an element at the end of the list, updating size
     * by one and then resizes if needed.
     *
     * @param p The object to add to the list.
     */
    public void addy(T p){
        if(size == maxSize){
            ABList = resize(ABList);
        }
        ABList[size] = p;
        size++;

    }

    /**
     * This method resizes the array.
     *
     * @param original The array to resize.
     * @return The resized array.
     */
    public T[] resize(T[] original){
        maxSize= maxSize*2;
        T[] resizedList = (T[]) (new Object[maxSize]);
        for(int i = 0; i<original.length;i++){
            resizedList[i] = original[i];
        }
        return resizedList;
    }

    /**
     * This removes an element at the specified index.
     *
     * @param pos The index of the element to be removed.
     */
    public void removy(int pos){
        if(size ==0){
            System.out.println("Cannot remove from an empty list.");
            return;
        }
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

    /**
     * This makes one string with all information from the elements in the list.
     *
     * @return A string with all of the information from all of the elements in the
     * list.
     */
    public String toString(){
        String output="";
        for(int i=0; i<size; i++){
            output= output+ABList[i].toString()+"\n";
        }
        return output;
    }

}
