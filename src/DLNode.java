/**
 * This class represents a node for a doubly linked list.
 * @param <T>
 */
public class DLNode <T>{

    DLNode <T> previous;
    DLNode <T> next;
    T data;

    /**
     * This creates a node an initializes all of its values ot null.
     */
    public DLNode(){
        previous=null;
        next=null;
        data=null;
    }

    /**
     * This retrieves the node that was before this one.
     *
     * @return The previous node of this current node.
     */
    public DLNode <T> getPrevious(){
        return previous;
    }

    /**
     * This retrieves the node that follows this one.
     *
     * @return The next node that follows this current one.
     */
    public DLNode <T> getNext(){
        return next;
    }

    /**
     * This method retrieves the data of this node.
     *
     * @return This node's data.
     */
    public T getData(){
        return data;
    }

    /**
     * This method sets the node's previous to the input.
     *
     * @param newPrevious The node to be this one's previous.
     */
    public void setPrevious(DLNode <T> newPrevious){
        previous = newPrevious;
    }

    /**
     * This method sets the node's next to the input.
     *
     * @param newNext The node to be this one's next.
     */
    public void setNext(DLNode <T> newNext){
        next = newNext;
    }

    /**
     * This sets the data of the node to be the input.
     *
     * @param newData The new data for the node.
     */
    public void setData(T newData){
        data = newData;
    }

}
