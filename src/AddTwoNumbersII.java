import java.util.Stack;

/**
 * You are given two *non-empty* linked lists representing two non-negative
 * integers. The most significant digit comes first and each of their nodes
 * contain a single digit. Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 *
 * *Follow up:*
 * What if you cannot modify the input lists? In other words, reversing the lists is not allowed.
 *
 * *Example:*
 * : Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
 * : Output: 7 -> 8 -> 0 -> 7
 *
 * */

public class AddTwoNumbersII {

    /**
     * 思路1 三个栈
     * */
//    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        Stack<Integer> s1 = new Stack<Integer>();
//        Stack<Integer> s2 = new Stack<Integer>();
//        Stack<Integer> s = new Stack<Integer>();
//
//        while (l1 != null) {
//            s1.push(l1.val);
//            l1 = l1.next;
//        }
//        while (l2 != null) {
//            s2.push(l2.val);
//            l2 = l2.next;
//        }
//
//        int sum, carry = 0;
//        ListNode dummy = new ListNode(-1);
//        ListNode p = dummy;
//
//        while (!s1.empty() || !s2.empty()) {
//            if (s1.empty())
//                sum = s2.pop() + carry;
//            else if (s2.empty())
//                sum = s1.pop() + carry;
//            else
//                sum = s1.pop() + s2.pop() + carry;
//
//            carry = sum / 10;
//            s.push(sum % 10);
//        }
//
//        if (carry != 0)
//            s.push(carry);
//
//        while (!s.empty()) {
//            p.next = new ListNode(s.pop());
//            p = p.next;
//        }
//
//        return dummy.next;
//    }

    /**
     * 思路2 两个栈
     * */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        Stack<Integer> s = new Stack<Integer>();

        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }

        int sum = 0;
        ListNode p = new ListNode(0);
        ListNode q;
        while (!s1.empty() || !s2.empty()) {
            if (s1.empty())
                sum = s2.pop() + p.val;
            else if (s2.empty())
                sum = s1.pop() + p.val;
            else
                sum = s1.pop() + s2.pop() + p.val;

            p.val = sum % 10;
            q = new ListNode(sum / 10);
            q.next = p;
            p = q;
        }

        return p.val == 0 ? p.next : p;
    }

    public static void main(String[] args) {
//        int[] a = {7, 2, 4, 3};
//        int[] b = {5, 6, 4};
        int[] a = {1};
        int[] b = {9};
        ListNode x = LinkedListBasic.array2list(a);
        LinkedListBasic.show(x);

        ListNode y = LinkedListBasic.array2list(b);
        LinkedListBasic.show(y);

        LinkedListBasic.show(addTwoNumbers(x, y));
    }
}
