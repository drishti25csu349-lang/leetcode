class Solution {
    public void deleteNode(ListNode node) {
      
        node.val = node.next.val; //here value next is being copied to the actual node value to be removed 
        
      
        node.next = node.next.next; // and here it is pointing the box address to the next as it was pointing to before 
    }
}
