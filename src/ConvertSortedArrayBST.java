public class ConvertSortedArrayBST {
    // method 1
//    private int curr_idx = 0;
//
//    public TreeNode sortedArrayToBST(int[] nums) {
//        return arrayTraversal(nums, nums.length);
//    }
//
//    private TreeNode arrayTraversal(int[] nums, int length) {
//        if (length <= 0) return null;
//
//        TreeNode left = arrayTraversal(nums, length / 2);
//        TreeNode root = new TreeNode(nums[curr_idx++]);
//        TreeNode right = arrayTraversal(nums, length - length / 2 - 1);
//        root.left = left;
//        root.right = right;
//        return root;
//    }

    // method 2
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int lo, int hi) {
        if (lo > hi) return null;

        int mid = lo + (hi - lo) / 2;

        TreeNode left = helper(nums, lo, mid - 1);
        TreeNode right = helper(nums, mid + 1, hi);

        TreeNode root = new TreeNode(nums[mid]);
        root.left = left;
        root.right = right;
        return root;
    }

}
