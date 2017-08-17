/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 * */

public class RemoveDuplicatesSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        if (p == null) return null;
        while (p.next != null) {
            if (p.val == p.next.val)
                p.next = p.next.next;
            else p = p.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 3, 3};

        ListNode x = LinkedListBasic.array2list(a);
        LinkedListBasic.show(x);
        LinkedListBasic.show(deleteDuplicates(x));
    }
}
