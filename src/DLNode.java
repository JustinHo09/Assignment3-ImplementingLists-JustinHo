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
    
}
