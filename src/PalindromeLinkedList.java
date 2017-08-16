// [] 为 true

public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        if (head == null) return true;

        ListNode p1 = head;
        ListNode rightHalfpre = findMiddleNode(head);
        ListNode rightHalfReversed = reverseList(rightHalfpre.next);
        ListNode p2 = rightHalfReversed;
        while (p1 != null && p2 != null) {
            if (p1.val != p2.val) {
                rightHalfpre.next = reverseList(rightHalfReversed);
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        rightHalfpre.next = reverseList(rightHalfReversed);
        return true;
    }

    // 4 个元素时，返回指向第二个；3 个元素时返回指向第二个
    private static ListNode findMiddleNode(ListNode head) {
        if (head == null) return null;

        ListNode slow = head, fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode p = head.next;
        ListNode q;
        head.next = null;
        while (p != null) {
            q = p.next;
            p.next = head;
            head = p;
            p = q;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 3, 3, 3, 1};

        ListNode x = LinkedListBasic.array2list(a);
        LinkedListBasic.show(x);
        System.out.println(isPalindrome(x));
        LinkedListBasic.show(x);
    }

}
