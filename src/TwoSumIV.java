import java.util.HashSet;

public class TwoSumIV {
// method 1, HashSet
    /*
    private boolean dfs(TreeNode root, HashSet<Integer> map, int k) {
        if (root == null) return false;

        if (map.contains(k - root.val))
            return true;
        map.add(root.val);
        return dfs(root.left, map, k) || dfs(root.right, map, k);
    }

    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> map = new HashSet<Integer>();
        return dfs(root, map, k);
    } */

    // method 2, convert to sorted array
    /*
    private void bstToSortedArray(TreeNode root, ArrayList<Integer> arr) {
        if (root == null) return;
        bstToSortedArray(root.left, arr);
        arr.add(root.val);
        bstToSortedArray(root.right, arr);
    }

    private boolean twoSumSortedArray(ArrayList<Integer> arr, int k) {
        int i = 0, j = arr.size() - 1;
        while (i < j) {
            int curr = arr.get(i) + arr.get(j);
            if (curr == k)
                return true;
            else if (curr < k)
                i++;
            else
                j--;
        }
        return false;
    }

    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        bstToSortedArray(root, arr);
        return twoSumSortedArray(arr, k);
    }
    */

    // method 3, binary search
    // add current node to avoid the situation such as 4 + 4 = 8
    private boolean bstContains(TreeNode root, TreeNode curr, int num) {
        if (root == null) return false;
        if (root != curr && root.val == num) return true;

        if (root.val < num) return bstContains(root.right, curr, num);
        else return bstContains(root.left, curr, num);
    }

    private boolean bstAllContains(TreeNode root, TreeNode curr, int k) {
        return curr != null && (bstContains(root, curr, k - curr.val) ||
                bstAllContains(root, curr.left, k) ||
                bstAllContains(root, curr.right, k));
    }

    public boolean findTarget(TreeNode root, int k) {
        return bstAllContains(root, root, k);
    }
}
