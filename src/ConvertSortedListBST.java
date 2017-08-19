/**
 * Given a singly linked list where elements are sorted in ascending order,
 * convert it to a height balanced BST.
 * */

public class ConvertSortedListBST {
    /**
     * 思路一 复杂度 O(nlog(n))
     * */
//    public static TreeNode sortedListToBST(ListNode head) {
//        if (head == null) return null;
//        if (head.next == null) return new TreeNode(head.val);
//
//        ListNode midNode = findMiddleNode(head);
//        ListNode rightList = midNode.next.next;
//        TreeNode root = new TreeNode(midNode.next.val);
//        midNode.next = null;  // construct left list
//        root.left = sortedListToBST(head);
//        root.right = sortedListToBST(rightList);
//        return root;
//    }
    // 4 个元素时，返回指向第二个；3 个元素时返回指向第 1 个
    private static ListNode findMiddleNode(ListNode head) {
        if (head == null) return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    /**
     * 思路二 复杂度
     * */
    private static ListNode current;
    public static TreeNode sortedListToBST(ListNode head) {
        current = head;
        return sortedListToBSTHelper(lengthList(head));
    }

    private static int lengthList(ListNode head) {
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        return len;
    }

    private static TreeNode sortedListToBSTHelper(int length) {
        if (length <= 0) return null;

        TreeNode leftBST = sortedListToBSTHelper(length / 2);
        TreeNode root = new TreeNode(current.val);
        current = current.next;
        TreeNode rightBST = sortedListToBSTHelper(length - length / 2 - 1);
        root.left = leftBST;
        root.right = rightBST;
        return root;
    }

}
