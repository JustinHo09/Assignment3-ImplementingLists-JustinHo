public class SLList {

    public SLNode head;

    public SLList(){
        head=null;
    }

    public void addy(Song s){
        SLNode test = new SLNode();
        test.setData(s);
        if(head == null){
            head = test;
        }else{
            SLNode current = head;
            while(current.getNext() != null){
                current= current.getNext();
            }
            current.setNext(test);
        }
    }
}
