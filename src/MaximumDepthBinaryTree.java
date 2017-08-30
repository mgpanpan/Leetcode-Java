import java.util.LinkedList;

public class MaximumDepthBinaryTree {

    // DFS
//    public int maxDepth(TreeNode root) {
//        if (root == null) return 0;
//        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
//    }

    // BFS
    public int maxDepth(TreeNode root) {
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        if (root == null) return 0;
        q.offer(root);

        int depth = 0;

        while (!q.isEmpty()) {
            int numOfCurrLevel = q.size();
            for (int i = 0; i < numOfCurrLevel; i++) {
                TreeNode curr = q.poll();
                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);

            }
            depth++;
        }

        return depth;
    }
}
