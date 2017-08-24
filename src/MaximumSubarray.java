public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int currMax = nums[0], totalMax = currMax;

        for (int i = 1; i < nums.length; i++) {
            currMax = Math.max(nums[i], currMax + nums[i]);
            totalMax = Math.max(currMax, totalMax);
        }

        return totalMax;
    }

    public static void main(String[] args) {
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        ArrayBasic.show(a);
        System.out.println(maxSubArray(a));
    }
}
