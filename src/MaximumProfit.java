public class MaximumProfit {
//    public static int maxProfit(int[] prices) {
//        int max_curr = 0, max_total = 0;
//
//        for (int i = 1; i < prices.length; i++) {
//            max_curr = Math.max(prices[i] - prices[i-1], max_curr += prices[i] - prices[i-1]);
//            max_total = Math.max(max_curr, max_total);
//        }
//        return max_total;
//    }

    public static int maxProfit(int[] prices) {
        int[] prices_diff = new int[prices.length - 1];
        for (int i = 1; i < prices.length; i++)
            prices_diff[i-1] = prices[i] - prices[i-1];
        return maxSubArray(prices_diff);
    }

    public static int maxSubArray(int[] nums) {
        int currMax = 0, totalMax = currMax;

        for (int i = 1; i < nums.length; i++) {
            currMax = Math.max(nums[i], currMax + nums[i]);
            totalMax = Math.max(currMax, totalMax);
        }

        return totalMax;
    }

    public static void main(String[] args) {
        int[] a = {7, 6, 4, 3, 1};

        ArrayBasic.show(a);
        System.out.println(maxProfit(a));
    }
}
