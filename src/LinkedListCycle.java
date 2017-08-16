import java.util.Random;

/**
 * Created by panmengguan on 2017/8/16.
 *
 * Given a linked list, determine if it has a cycle in it.
 * Follow up:
 * Can you solve it without using extra space?
 */

public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head, fast = head.next;
        while (slow != null && fast != null && fast.next != null) {
            if (fast == slow)
                return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

    public static void main(String[] args) {
        int N = 20;
        int[] b = new int[N];
        Random r = new Random();
        for (int i = 0; i < N; i++)
            b[i] = r.nextInt(100);

        ListNode x = LinkedListBasic.array2list(b);
        x.next.next = x;
        System.out.println(hasCycle(x));
    }
}
