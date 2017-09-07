public class DiameterOfBinaryTree {

    // version 1 using a member variable
//    int diameter = 0;
//    public int diameterOfBinaryTree(TreeNode root) {
//        postOrderTraversal(root);
//        return diameter;
//    }
//
//    private int postOrderTraversal(TreeNode root) {
//        if (root == null) return 0;
//        if (root.left == null && root.right == null) return 1;
//
//        int left = postOrderTraversal(root.left);
//        int right = postOrderTraversal(root.right);
//        int currDiameter = left + right;
//        if (currDiameter > diameter) diameter = currDiameter;
//
//        return Math.max(left, right) + 1;
//    }

    public int diameterOfBinaryTree(TreeNode root) {
        int[] result = postOrderTraversal(root);
        // result[0] is current longest, result[1] is
        return result[0];
    }

    private int[] postOrderTraversal(TreeNode root) {
        if (root == null) return new int[]{0, 0};

        int[] left = postOrderTraversal(root.left);
        int[] right = postOrderTraversal(root.right);

        int best = Math.max(left[1] + right[1], Math.max(left[0], right[0]));
        int height = Math.max(left[1], right[1]) + 1;
        return new int[] {best, height};
    }
}
