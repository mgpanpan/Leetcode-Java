public class ConvertGreaterBST {
    public TreeNode convertBST(TreeNode root) {
        if (root == null) return null;
        return convert(root, 0);
    }

    private TreeNode convert(TreeNode root, int offset) {
        if (root == null) return null;
        TreeNode root1 = new TreeNode(root.val + offset);
        if (root.right != null) {
            root1.right = convert(root.right, 0);
            root1.val += root1.right.val;
        }
        root1.left = convert(root.left, root1.val);
        return root1;
    }
}
