import java.util.Random;

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
