package dsa.linkedlist;


public class lengthofCycle {

      class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }


    public int lengthCycle(ListNode head){

          ListNode fast = head;
          ListNode slow = head;

          while(fast!=null && fast.next!=null){
              fast=fast.next.next;
              slow=slow.next;
              if(fast==slow){
                  int count = 1;
                  slow = slow.next;
                  while(slow!=fast){
                      slow=slow.next;
                      count++;
                  }
                  return count;
              }

          }
          return 0;




    }

}
