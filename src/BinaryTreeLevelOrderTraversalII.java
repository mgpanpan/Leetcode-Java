import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();

        if (root == null) return result;
        q.offer(root);

        while (!q.isEmpty()) {
            LinkedList list = new LinkedList();
            int numOfCurrLevel = q.size();
            for (int i = 0; i < numOfCurrLevel; i++) {
                TreeNode curr = q.poll();
                list.offer(curr.val);
                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
            }
            result.push(list);
        }
        return result;
    }
}
