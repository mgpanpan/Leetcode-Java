/**
 *
 * */

public class RemoveNthNodeFromEndofList {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p = dummy;
        ListNode q = head;
        for (int i = 0; i < n; i++)
            q = q.next;

        while (q != null) {
            p = p.next;
            q = q.next;
        }
        p.next = p.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {
//        int[] a = {2, 4, 3};
//        int[] b = {5, 6, 4};
        int[] a = {1, 2, 3, 4, 5};

        ListNode x = LinkedListBasic.array2list(a);
        LinkedListBasic.show(x);

        LinkedListBasic.show(removeNthFromEnd(x, 5));
    }
}
