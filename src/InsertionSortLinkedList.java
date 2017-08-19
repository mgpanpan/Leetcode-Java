/**
 * Sort a linked list using insertion sort.
 */

public class InsertionSortLinkedList {
    public static ListNode insertionSortList(ListNode head) {
        if (head == null) return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode scan_outter = head;
        while (scan_outter.next != null) {
            ListNode scan_inner = dummy;
            while (scan_inner != scan_outter) {
                if (scan_inner.next.val > scan_outter.next.val) {
                    // insert
                    ListNode inner_next_backup = scan_inner.next;
                    ListNode outter_next_backup = scan_outter.next;

                    scan_outter.next = scan_outter.next.next;
                    scan_inner.next = outter_next_backup;
                    outter_next_backup.next = inner_next_backup;

                    break;
                }
                scan_inner = scan_inner.next;
            }
            if (scan_inner == scan_outter)
                scan_outter = scan_outter.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
//        int[] a = {2, 4, 3};
//        int[] b = {5, 6, 4};
        int[] a = {3, 2, 1};

        ListNode x = LinkedListBasic.array2list(a);
        LinkedListBasic.show(x);

        LinkedListBasic.show(insertionSortList(x));
    }
}
