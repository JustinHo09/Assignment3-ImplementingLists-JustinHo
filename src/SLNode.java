public class SLNode <T> {

    T data;
    SLNode<T> next;

    public SLNode(){
        data= null;
        next=null;
    }

    public SLNode<T> getNext(){
        return next;
    }

    public T getData(){
        return data;
    }

    public void setNext(SLNode<T> newNext){
        next = newNext;
    }

    public void setData(T newData){
        data = newData;
    }

}
