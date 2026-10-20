/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode temp = head;
    int size = 0;

        while(temp != null){
            temp = temp.next;
            size++;
        }
                int stop = size-n;
if(stop == 0){
    return head.next;
}
    
    temp = head;
        if(head == null){
            return null;
        }
      
       for(int i = 0;i<stop-1;i++){
        temp = temp.next;
       }
  temp.next = temp.next.next;
       
          return head;
    }
   
}