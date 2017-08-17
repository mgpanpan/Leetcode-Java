import java.util.Random;

/**
 * Created by panmengguan on 2017/8/16.
 * Basic functions for the processing of linked list.
 * Including:
 *     array2list
 *     show
 */

public class LinkedListBasic {
    public static ListNode array2list(int[] arr) {
        if (arr.length == 0) return null;
        ListNode dummy = new ListNode(-1);
        ListNode x = dummy;
        for (int i : arr) {
            x.next = new ListNode(i);
            x = x.next;
        }
        return dummy.next;
    }

    public static void show(ListNode lst)
    {
        for (; lst != null; lst = lst.next)
            System.out.print(lst.val + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        show(array2list(a));

        int N = 20;
        int[] b = new int[N];
        Random r = new Random();
        for (int i = 0; i < N; i++)
            b[i] = r.nextInt(100);

        show(array2list(b));
    }
}
