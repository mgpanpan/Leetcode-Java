import java.util.HashMap;

public class TwoSum {

    // O(n^2)
//    public int[] twoSum(int[] nums, int target) {
//        int[] result = new int[2];
//        for (int i = 0; i < nums.length; i++)
//            for (int j = i + 1; j < nums.length; j++)
//                if (nums[i] + nums[j] == target) {
//                    result[0] = i;
//                    result[1] = j;
//                }
//        return result;
//    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(target - nums[i]) != null) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
            }
            map.put(nums[i], i);
        }
        return result;
    }

}
