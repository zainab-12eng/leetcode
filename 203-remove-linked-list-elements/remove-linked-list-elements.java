class Solution {
    public ListNode removeElements(ListNode head, int val) {

        // dummy node to handle edge case (head itself needs removal)
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next; // skip node
            } else {
                current = current.next;
            }
        }

        return dummy.next;
    }
}
