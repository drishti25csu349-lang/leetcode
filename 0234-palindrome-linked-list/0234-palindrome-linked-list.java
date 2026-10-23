class Solution {
    public boolean isPalindrome(ListNode head) {
      ListNode fast = head;
      ListNode slow = head;
      while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
      }
      ListNode prev = null;
      ListNode curr = slow;
      ListNode next = null;

      while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
      }
      ListNode firsthead = head;
      ListNode secondhead = prev;
      while(secondhead != null){
        if(firsthead.val != secondhead.val){
            return false;
        }
        firsthead = firsthead.next;
        secondhead = secondhead.next;
      }
      return true;
    }
}