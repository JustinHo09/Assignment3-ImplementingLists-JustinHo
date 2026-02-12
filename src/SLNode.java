public class SLNode {

    Song data;
    SLNode next;

    public SLNode(){
        data= null;
        next=null;
    }

    public SLNode getNext(){
        return next;
    }

    public Song getData(){
        return data;
    }

    public void setNext(SLNode newNext){
        next = newNext;
    }

    public void setData(Song newSong){
        data = newSong;
    }

}
