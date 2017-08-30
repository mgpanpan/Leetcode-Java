import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.List;

public class AverageOfLevelsBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        LinkedList<Double> result = new LinkedList<Double>();

        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        if (root == null) return result;

        q.offer(root);

        while (!q.isEmpty()) {
            int numOfCurrLevel = q.size();
            double sum = 0.0;
            for (int i = 0; i < numOfCurrLevel; i++) {
                TreeNode curr = q.poll();
                sum += curr.val;
                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
            }
            result.offer(sum / numOfCurrLevel);
        }

        return result;
    }

}
