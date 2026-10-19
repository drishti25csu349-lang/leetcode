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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        Set<Integer> chk = new HashSet<>();
        for(int j = 0 ;j<nums.length;j++){
            chk.add(nums[j]);
        }
        int i = 0;
        while(curr.next!= null){
        if(chk.contains(curr.next.val)){
            curr.next = curr.next.next;
        }
        else{
            curr= curr.next;
        }
        }
        return dummy.next;
    }
}