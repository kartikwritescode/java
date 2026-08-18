package dsa.linkedlist;

public class doublylinkedlist {
    public class DoublyLL {
        private Node head;
        private Node tail;
        private int size;
        public DoublyLL(){
            this.size=0;
        }
        private class Node {
            int val;
            Node next;
            Node prev;

            private Node(int val) {
                this.val = val;
            }

            private Node(int val, Node next, Node prev) {
                this.val = val;
                this.next = next;
                this.prev = prev;
            }
        }

        public void insertFirst(int val) {

            Node node = new Node(val);
            node.next=head;
            node.prev=null;
            if (head != null) {
                head.prev=node; // if not handled -> will give null pointer exception for the cases where there is no head value
            }else{
                tail=node;
            }

            head = node;
            size++;
        }
        //no tail
        public void insertLast(int val){
            Node node = new Node(val);
            if(head==null){
                head=node;
                size++;
                return;
            }
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next=node;
            node.prev=temp;
            size++;
        }
        public void insert(int index , int val){
            if(index<0 || index>size){
                throw new IndexOutOfBoundsException("Invalid index");
            }

            Node temp = head;
            if(index==0){
                insertFirst(val);
                return;
            }
            if(index==size){
                insertLast(val);
                return;
            }
            for (int i = 0; i < index; i++) {
                temp = temp.next;

            }
            Node node = new Node(val);
            node.next = temp.next;
            temp.next.prev=node;
            node.prev=temp;
            temp.next=node;
            size++;


        }


    }
}
