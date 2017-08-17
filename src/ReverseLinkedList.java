
import java.util.Random;

/** Created by panmengguan on 2015/11/13.
 *
 * Reverse a linked list.
 *
 * Example
 * For linked list 1->2->3, the reversed linked list is 3->2->1
 *
 * Challenge
 * Reverse it in-place and in one-pass
 * */

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
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
        int N = 10;
        int[] b = new int[N];
        Random r = new Random();
        for (int i = 0; i < N; i++)
            b[i] = r.nextInt(100);

        ListNode x = LinkedListBasic.array2list(b);
        LinkedListBasic.show(x);
        LinkedListBasic.show(reverseList(x));
    }
}
