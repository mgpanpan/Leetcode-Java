public class HouseRobber {
    public static int rob(int[] nums) {
        int curr_pre = 0, curr = 0;
        for (int i = 0; i < nums.length; i++) {
            int tmp = curr;
            curr = Math.max(curr_pre + nums[i], curr);
            curr_pre = tmp;
        }

        return curr;
    }
}
