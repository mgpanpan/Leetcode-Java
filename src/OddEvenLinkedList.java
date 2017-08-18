/**
 * Given a singly linked list, group all odd nodes together followed by
 * the even nodes. Please note here we are talking about the node number
 * and not the value in the nodes.
 *
 * You should try to do it fin place. The program should run in O(1) space
 * complexity and O(nodes) time complexity.
 *
 * Example:
 * : Given 1->2->3->4->5->NULL,
 * : return 1->3->5->2->4->NULL.
 *
 * Note:
 * 1. The relative order inside both the even and odd groups should remain
 *    as it was in the input.
 * 2. The first node is considered odd, the second node even and so on ...
 *
 * */

public class OddEvenLinkedList {
    /**
     * First submit
     * */
//    public static ListNode oddEvenList(ListNode head) {
//        if (head == null) return null;
//
//        ListNode odd = head;
//        ListNode even = new ListNode(-1);
//        ListNode even1 = even;
//
//        while (odd != null) {
//            even1.next = odd.next;
//            even1 = even1.next;
//            if (even1 != null && even1.next != null) {
//                odd.next = even1.next;
//                odd = odd.next;
//            }
//            else
//                break;
//        }
//        odd.next = even.next;
//        return head;
//    }

    /**
     * Second submit
     * */
    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode even1 = even;

        while (even1 != null && even1.next != null) {
            odd.next = even1.next;
            odd = odd.next;
            even1.next = odd.next;
            even1 = even1.next;
        }

        odd.next = even;
        return head;
    }

    public static void main(String[] args) {
//        int[] a = {2, 4, 3};
//        int[] b = {5, 6, 4};
        int[] a = {1, 2, 3, 4, 5};
        ListNode x = LinkedListBasic.array2list(a);
        LinkedListBasic.show(x);

        LinkedListBasic.show(oddEvenList(x));
    }
}
