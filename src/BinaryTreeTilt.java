import java.util.ArrayList;

public class BinaryTreeTilt {
    private int sum = 0;

    public int findTilt(TreeNode root) {
        helper(root);
        return sum;
    }

    private int helper(TreeNode root) {
        if (root == null)
            return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        sum += Math.abs(left - right);
        return left + right + root.val;
    }
}
