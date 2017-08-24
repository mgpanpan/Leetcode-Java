public class PartitionList {
    public static ListNode partition(ListNode head, int x) {
        ListNode dummy_less = new ListNode(-1);
        ListNode dummy_greater = new ListNode(-1);

        ListNode p = dummy_less;
        ListNode q = dummy_greater;

        while (head != null) {
            if (head.val < x) {
                p.next = head;
                p = p.next;
            } else {
                q.next = head;
                q = q.next;
            }
            head = head.next;
        }

        p.next = dummy_greater.next;
        q.next = null;

        return dummy_less.next;
    }

    public static void main(String[] args) {
        int[] a = {2, 1};

        ListNode x = LinkedListBasic.array2list(a);
        LinkedListBasic.show(x);
        LinkedListBasic.show(partition(x, 2));
    }
}
