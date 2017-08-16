public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode l = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                l.next = l1;
                l1 = l1.next;
            } else {
                l.next = l2;
                l2 = l2.next;
            }
            l = l.next;
        }
        l.next = l1 == null ? l2 : l1;

        return dummy.next;
    }


    public static void main(String[] args) {
        int[] a1 = {1, 1, 2, 3, 3, 3};
        int[] a2 = {2, 4, 4, 5};

        LinkedListBasic.show(mergeTwoLists(LinkedListBasic.array2list(a1), LinkedListBasic.array2list(a2)));
    }
}
