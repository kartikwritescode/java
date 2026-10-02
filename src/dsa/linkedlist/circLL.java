package dsa.linkedlist;

public class circLL {
    private Node head;
    private Node tail;
    private int size;

    public circLL(){
        this.head=null;
        this.tail=null;
    }
    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
        public Node(int val , Node next){
            this.val = val;
            this.next = next;
        }
    }


    public void insertFirst(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            node.next=node;
            size++;
            return;
        }
        node.next=head;
        head=node;
        tail.next=node;
        size++;


    }
    public void display(){
        Node temp = head;
        if(head!=null){
            do {
                System.out.print(temp.val+"->");
                temp=temp.next;
            }while (temp!=head);
        }}


    public void delete(int index){
        if(index < 0 || index>= size){
            throw new IndexOutOfBoundsException("invalid index");
        }
//        only 1 node
        if(size==1){
          head=tail=null;
          size--;
          return;
        }
//        delete first node
        if(index==0){
             head=head.next;
             tail.next=head;
             size--;
             return;
        }

            Node temp = head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
//        deleting tail
        if(index==size-1){
            tail=temp;
        }
        temp.next=temp.next.next;

//        maintaining circular connection
        tail.next=head;
        size--;

    }




    }


