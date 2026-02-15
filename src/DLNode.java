public class DLNode <T>{

    DLNode previous;
    DLNode next;
    T data;

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

    public T getData(){
        return data;
    }

    public void setPrevious(DLNode newPrevious){
        previous = newPrevious;
    }

    public void setNext(DLNode newNext){
        next = newNext;
    }

    public void setData(T newData){
        data = newData;
    }

}
