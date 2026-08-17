package dsa.linkedlist;
public class link {
    
    public class LL{
        private Node head;
        private Node tail;
        private int size;

        private class Node{
        private int val;
        private Node next;
        public Node(int val){
            this.val = val;
        }
        public Node(int val , Node next){
            this.val = val;
            this.next = next;
        }

    }

        public LL(){
            this.size=0;
        }

    
    public void traverse(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            // only 1 item
            tail=head;
        }
        size+=1;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(head==null){
            //only node
            insertFirst(val);
            return;
        }
        tail.next=node;
        node.next=null;
        size++;
    }

    public void insert(int index,int val){

        if(index<0 || index > size ){
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
            
        }
        Node node = new Node(val,temp.next);
        temp.next=node;
        size+=1;
    }


    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        if(head==null){
            tail = null ;
        }
        size--;
        return val;
        
    }
    // to get reference pointer to nth node
    public Node get(int index){
        Node node = head;
        for (int i = 1; i < index; i++) {
            node = node.next;

        }
        return node;

    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next=null;
        return val;

          

    }







}
}
