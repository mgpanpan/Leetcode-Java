/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 *
 * For example, the following two linked lists:
 *
 * : A:          a1 → a2
 * :                    ↘
 * :                      c1 → c2 → c3
 * :                    ↗
 * : B:     b1 → b2 → b3
 *
 * begin to intersect at node c1.
 *
 * Notes:
 * 1. If the two linked lists have no intersection at all, return null.
 * 2. The linked lists must retain their original structure after the function returns.
 * 3. You may assume there are no cycles anywhere in the entire linked structure.
 * 4. Your code should preferably run in O(n) time and use only O(1) memory.
 * */

public class IntersectionTwoLinkedLists {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lA = lengthLinkedList(headA);
        int lB = lengthLinkedList(headB);
        ListNode pA = headA;
        ListNode pB = headB;
        if (lA <= lB)
            for (int i = 0; i < lB - lA; i++)
                pB = pB.next;
        else
            for (int i = 0; i < lA - lB; i++)
                pA = pA.next;
        while (pA != null && pB != null) {
            if (pA == pB)
                return pA;
            pA = pA.next;
            pB = pB.next;
        }
        return null;
    }

    private static int lengthLinkedList(ListNode head) {
        int N = 0;
        while (head != null) {
            head = head.next;
            N++;
        }
        return N;
    }
}
