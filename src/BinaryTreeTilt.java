import java.util.ArrayList;

public class BinaryTreeTilt {
//    private int sum = 0;
//
//    public int findTilt(TreeNode root) {
//        helper(root);
//        return sum;
//    }
//
//    private int helper(TreeNode root) {
//        if (root == null)
//            return 0;
//        int left = helper(root.left);
//        int right = helper(root.right);
//        sum += Math.abs(left - right);
//        return left + right + root.val;
//    }

    public int findTilt(TreeNode root) {
            int[] result = helper(root);
            // result[0] is the answer, result[1] is sum of all sub nodes.
            return result[0];
    }

    private int[] helper(TreeNode root) {
        if (root == null)
            return new int[]{0, 0};
        int[] left = helper(root.left);
        int[] right = helper(root.right);

        return new int[]{left[0] + right[0] + Math.abs(left[1] - right[1]), left[1] + right[1] + root.val};
    }
}
