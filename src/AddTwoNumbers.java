/**
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order and each of their nodes
 * contain a single digit. Add the two numbers and return it as a linked
 * list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * */

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum, carry = 0;
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;

        while (l1 != null || l2 != null) {
            if (l1 == null) {
                sum = l2.val + carry;
                l2 = l2.next;
            } else if (l2 == null) {
                sum = l1.val + carry;
                l1 = l1.next;
            } else {
                sum = l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            }

            carry = sum / 10;
            sum = sum % 10;
            p.next = new ListNode(sum);
            p = p.next;
        }

        if (carry != 0)
            p.next = new ListNode(carry);

        return dummy.next;
    }

    public static void main(String[] args) {
//        int[] a = {2, 4, 3};
//        int[] b = {5, 6, 4};
        int[] a = {5};
        int[] b = {5};
        ListNode x = LinkedListBasic.array2list(a);
        LinkedListBasic.show(x);

        ListNode y = LinkedListBasic.array2list(b);
        LinkedListBasic.show(y);

        LinkedListBasic.show(addTwoNumbers(x, y));
    }

}
