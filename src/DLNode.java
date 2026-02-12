public class DLNode {

    DLNode previous;
    DLNode next;
    Song data;

    public DLNode(){
        previous=null;
        next=null;
        data=null;
    }

    public DLNode getPrevious(){
        return previous;
    }

    public DLNode getNext(){
        return next;
    }

    public Song getData(){
        return data;
    }

    public void setPrevious(DLNode newPrevious){
        previous = newPrevious;
    }

    public void setNext(DLNode newNext){
        next = newNext;
    }

    public void setData(Song newData){
        data = newData;
    }

}
