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
}
