import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> result = new LinkedList<List<Integer>>();

        if (root == null) return result;
        q.offer(root);
        while (!q.isEmpty()) {
            int numOfCurrLevel = q.size();
            List<Integer> list = new LinkedList<Integer>();
            for (int i = 0; i < numOfCurrLevel; i++) {
                TreeNode curr = q.poll();
                list.add(curr.val);
                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
            }
            result.add(list);
        }

        return result;
    }
}
