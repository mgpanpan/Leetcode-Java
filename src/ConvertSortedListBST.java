/**
 * Given a singly linked list where elements are sorted in ascending order,
 * convert it to a height balanced BST.
 * */

public class ConvertSortedListBST {
    public static TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return new TreeNode(head.val);

        ListNode midNode = findMiddleNode(head);
        ListNode rightList = midNode.next.next;
        TreeNode root = new TreeNode(midNode.next.val);
        midNode.next = null;  // construct left list
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(rightList);
        return root;
    }

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

}
