/**
 * This class implements a doubly linked list using the
 * DLNode class.
 * @param <T> The generic type to be used for the list.
 */
public class DLList <T> {

    public DLNode<T> head;

    /**
     * This contractor initializes the head to null.
     */
    public DLList(){
        head=null;
    }

    /**
     * This method adds a new node at the end of the list.
     *
     * @param s The data for the node to be added at the end of the list.
     */
    public void addy(T s){
        DLNode<T> node = new DLNode<T>();
        node.setData(s);
        if(head == null){
            head = node;
        }else{
            DLNode<T> current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(node);
            node.setPrevious(current);
        }
    }

    /**
     * This method removes a node at the given position of the list,
     * where 0 is the head.
     *
     * @param pos The position of the node to remove.
     */
    public void removy(int pos){

        if(head == null){
            System.out.println("Cannot remove from an empty list");
            return;
        }

        DLNode<T> current = head;

        if(pos < 0){

            System.out.println("Not a valid position in the list");

        }else if( pos == 0){

            if(current.getNext() == null){

                head = current.getNext();

            }else{

                head = current.getNext();
                current.setNext(null);
                head.setPrevious(null);
            }

        }else{

            int counter=0;
            while( counter < pos && current != null){

                current=current.getNext();
                counter++;
            }

            if(current == null){

                System.out.println("Not a valid position in the list");

            }else{

                current.getPrevious().setNext(current.getNext());
                if(current.getNext() != null){

                    current.getNext().setPrevious(current.getPrevious());
                }

                current.setPrevious(null);
                current.setNext(null);
            }
        }
    }

    /**
     * This returns a string with all the information of the
     * nodes in the list.
     * @return A string with all the information of
     * all the data from every node in the list.
     */
    public String toString(){
        String output="";
        DLNode<T> current=head;
        while(current!=null){
            output = output+ current.getData().toString()+" \n";
            current= current.getNext();
        }
        return output;
    }
}
