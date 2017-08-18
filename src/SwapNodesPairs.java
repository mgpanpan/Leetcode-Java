/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 *
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 *
 * Your algorithm should use only constant space. You may not modify the
 * values in the list, only nodes itself can be changed.
 * */

public class SwapNodesPairs {
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode h = dummy;

        while (h.next != null) {
            ListNode p = h.next;
            if (p.next == null)
                return dummy.next;
            ListNode q = p.next;
            ListNode r = q.next;
            q.next = p;
            p.next = r;
            h.next = q;
            h = p;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
//        int[] a = {2, 4, 3};
//        int[] b = {5, 6, 4};
        int[] a = {1, 2, 3, 4};
        ListNode x = LinkedListBasic.array2list(a);
        LinkedListBasic.show(x);

        LinkedListBasic.show(swapPairs(x));
    }
}
