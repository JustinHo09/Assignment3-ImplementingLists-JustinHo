public class DLList {

    DLNode head;

    public DLList(){
        head=null;
    }

    public void addy(Song s){
        DLNode node = new DLNode();
        node.setData(s);
        if(head == null){
            head = node;
        }else{
            DLNode current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(node);
            node.setPrevious(current);
        }
    }

    public void removy(int pos){
        DLNode current = head;
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
}
