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
    public void removy(int pos){
        SLNode current=head;
        if(pos >0){
            int counter=0;
            while(counter != pos-1 && current != null){
                current = current.getNext();
                counter++;
            }
            if(current == null){
                System.out.println("No node exists at that position");
            }else {
                current.setNext(current.getNext().getNext());
            }
        } else if( pos == 0){
            head = current.getNext();
            current.setNext(null);
        }else{
            System.out.println("Not a valid position");
        }
    }

    public String toString(){
        SLNode current = head;
        String output= "";
        while(current!= null){
            output = output + current.getData().toString();
            current = current.getNext();
        }

        return output;
    }
}
