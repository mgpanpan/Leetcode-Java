import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SumOfLeftLeaves {
    // recursive
//    public int sumOfLeftLeaves(TreeNode root) {
//        if (root == null) return 0;
//
//        int left = 0;
//        if (root.left != null && root.left.left == null && root.left.right == null) left = root.left.val;
//        else
//            left = sumOfLeftLeaves(root.left);
//
//        return left + sumOfLeftLeaves(root.right);
//    }

    // iterative
//    public int sumOfLeftLeaves(TreeNode root) {
//        if (root == null) return 0;
//
//        int sum = 0;
//        Stack<TreeNode> stack = new Stack<TreeNode>();
//        stack.push(root);
//
//        while (!stack.isEmpty()) {
//            TreeNode curr = stack.pop();
//            if (curr.left != null && curr.left.left == null && curr.left.right == null)
//                sum += curr.left.val;
//            else if (curr.left != null)
//                stack.push(curr.left);
//
//            if (curr.right != null)
//                stack.push(curr.right);
//        }
//        return sum;
//    }

    // BFS
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;

        int sum = 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (curr.left != null && curr.left.left == null && curr.left.right == null)
                sum += curr.left.val;
            else if (curr.left != null)
                queue.offer(curr.left);

            if (curr.right != null)
                queue.offer(curr.right);
        }
        return sum;
    }

}

