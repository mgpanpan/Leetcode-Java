import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal0 {
    public static List<Integer> levelOrder(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        if (root == null) return list;
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            list.add(curr.val);
            if (curr.left != null) q.offer(curr.left);
            if (curr.right != null) q.offer(curr.right);
        }
        return list;
    }
}
