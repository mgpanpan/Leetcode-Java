public class ConvertGreaterBST {
    // version 1
//    public TreeNode convertBST(TreeNode root) {
//        return convert(root, 0);
//    }
//
//    private int findMin(TreeNode root) {
//        if (root == null) return 0;
//        if (root.left == null) return root.val;
//        else return findMin(root.left);
//    }
//
//    private TreeNode convert(TreeNode root, int offset) {
//        if (root == null) return null;
//        TreeNode root1 = new TreeNode(root.val);
//        root1.right = convert(root.right, offset);
//        if (root1.right != null)
//            root1.val += findMin(root1.right);
//        else
//            root1.val += offset;
//        root1.left = convert(root.left, root1.val);
//        return root1;
//    }
    public TreeNode convertBST(TreeNode root) {
        dfs(root, 0);
        return root;
    }

    private int dfs(TreeNode root, int offset) {
        if (root == null) return offset;
        int right = dfs(root.right, offset);
        root.val += right;
        int left = dfs(root.left, root.val);
        return left;
    }

}
