public class SLNode <T> {

    T data;
    SLNode next;

    public SLNode(){
        data= null;
        next=null;
    }

    public SLNode getNext(){
        return next;
    }

    public T getData(){
        return data;
    }

    public void setNext(SLNode newNext){
        next = newNext;
    }

    public void setData(T newData){
        data = newData;
    }

}
