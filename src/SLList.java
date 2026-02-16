/**
 * This class implements a singly linked list using the
 * SLNode class.
 * @param <T> The generic type that will be used for the lists.
 */
public class SLList<T> {

    public SLNode<T> head;

    /**
     * This creates a SLList and intilizes its head to null.
     */
    public SLList(){
        head=null;
    }

    /**
     * This adds a node to the end of the list and
     * will update the head to be the new element if
     * the list is empty.
     *
     * @param s The object to be the data for the new node.
     */
    public void addy(T s){
        SLNode<T> test = new SLNode<T>();
        test.setData(s);
        if(head == null){
            head = test;
        }else{
            SLNode<T> current = head;
            while(current.getNext() != null){
                current= current.getNext();
            }
            current.setNext(test);
        }
    }

    /**
     * This removes a node at a given position in the list, where
     * 0 is the head.
     *
     * @param pos The position of the node to remove.
     */
    public void removy(int pos){
        if(head == null){
            System.out.println("Cannot remove from an empty list");
            return;
        }
        SLNode<T> current=head;
        if(pos >0){
            int counter=0;
            while(counter != pos-1 && current != null){
                current = current.getNext();
                counter++;
            }
            if(current == null || current.getNext() == null){
                System.out.println("No node exists at that position");
            }else if(current.getNext() != null){
                current.setNext(current.getNext().getNext());
            }
        } else if( pos == 0){
            head = current.getNext();
            current.setNext(null);
        }else{
            System.out.println("Not a valid position");
        }
    }

    /**
     * This returns a string with all the data from the nodes
     * in the list.
     *
     * @return A string with all data from the nodes.
     */
    public String toString(){
        SLNode<T> current = head;
        String output= "";
        while(current!= null){
            output = output + current.getData().toString()+"\n";
            current = current.getNext();
        }

        return output;
    }
}
