class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // dummy node to handle removing head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // move fast n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // move both pointers until fast reaches end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // remove the nth node
        slow.next = slow.next.next;

        return dummy.next;
    }
}
