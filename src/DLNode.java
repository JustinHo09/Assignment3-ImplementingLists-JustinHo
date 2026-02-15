public class DLNode <T>{

    DLNode <T> previous;
    DLNode <T> next;
    T data;

    public DLNode(){
        previous=null;
        next=null;
        data=null;
    }

    public DLNode <T> getPrevious(){
        return previous;
    }

    public DLNode <T> getNext(){
        return next;
    }

    public T getData(){
        return data;
    }

    public void setPrevious(DLNode <T> newPrevious){
        previous = newPrevious;
    }

    public void setNext(DLNode <T> newNext){
        next = newNext;
    }

    public void setData(T newData){
        data = newData;
    }

}
