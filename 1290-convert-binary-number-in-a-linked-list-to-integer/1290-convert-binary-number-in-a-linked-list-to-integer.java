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
    public int getDecimalValue(ListNode head) {
     StringBuilder ans =  new StringBuilder();
ListNode curr = head;
while(curr!=null){
ans.append(curr.val);
curr = curr.next;

}
 
int decimal  = 0 ;  

for(int i  = 0 ;i<ans.length();i++){
    decimal = decimal*2+(ans.charAt(i) -'0');
}
return decimal ;

}
}