
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return head;

        ListNode temp = head.next;
        ListNode check = head;
        ListNode temp1;
        ListNode prev;

        check.next = null;

        while (temp != null) {
            temp1 = temp.next;

            if (temp.val >= check.val) {
                check.next = temp;
                check = temp;
                check.next = null;
            } else {
                prev = null;
                ListNode curr = head;

                while (curr != null && curr.val <= temp.val) {
                    prev = curr;
                    curr = curr.next;
                }

                if (prev == null) {
                    temp.next = head;
                    head = temp;
                } else {
                    temp.next = curr;
                    prev.next = temp;
                }
            }

            temp = temp1;
        }

        return head;
    }
}
