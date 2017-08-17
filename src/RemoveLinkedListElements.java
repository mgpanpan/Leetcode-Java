/***
 * Remove all elements from a linked list of integers that have value val.
 * Example
 * Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 * Return: 1 --> 2 --> 3 --> 4 --> 5
 *
 */

public class RemoveLinkedListElements {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p = dummy;
        while (p.next != null) {
            if (p.next.val == val)
                p.next = p.next.next;
            else p = p.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 3, 3};

        ListNode x = LinkedListBasic.array2list(a);
        LinkedListBasic.show(x);
        LinkedListBasic.show(removeElements(x, 3));
    }
}
