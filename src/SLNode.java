/**
 * This class is a node for a singly linked list.
 *
 * @param <T> The generic type to use for the node.
 */
public class SLNode <T> {

    T data;
    SLNode<T> next;

    /**
     * This constructor iniitilizes the data and next value of the node to null.
     */
    public SLNode(){
        data= null;
        next=null;
    }

    /**
     * This returns the node this current one points to.
     * @return The next node it points to, null if it points to nothing.
     */
    public SLNode<T> getNext(){
        return next;
    }

    /**
     * This returns the data of this node.
     * @return The node's data, null if there is nothing.
     */
    public T getData(){
        return data;
    }

    /**
     * This sets the next value of the node.
     * @param newNext The node ot be this current node's next node.
     */
    public void setNext(SLNode<T> newNext){
        next = newNext;
    }

    /**
     * This sets the data for this node.
     * @param newData The data for this node.
     */
    public void setData(T newData){
        data = newData;
    }

}
