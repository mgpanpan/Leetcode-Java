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
