class Solution {
    public ListNode swapPairs(ListNode head) {
     ListNode dummy  = new ListNode(0);
     dummy.next = head;
     ListNode curr = dummy;
while(curr!=null && curr.next!=null && curr.next.next!=null){
    ListNode second = curr.next;
ListNode third = curr.next.next;
second.next = third.next;
third.next = second;
curr.next = third;
curr = second;
}
return dummy.next;
    }
}