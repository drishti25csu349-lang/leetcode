
class Solution {
    public boolean isPalindrome(ListNode head) {
    ListNode  slow = head;
    ListNode fast = head;
     while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
     }
     ListNode prev = null;
     ListNode next = null;
     ListNode curr = slow;
     while(curr != null){
        next = curr.next;
        curr.next = prev;
prev = curr;
curr = next;
     }
     ListNode firsthead = head;
     ListNode secondhead = prev;
     while(secondhead!= null){
        if(firsthead.val != secondhead.val){
            return false;
        }
        firsthead = firsthead.next;
        secondhead = secondhead.next;
     }
     return true;
    }
}