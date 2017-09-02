public class TwoSumII {
    // two pointers
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        if (numbers == null || numbers.length < 2) return result;
        int i = 0; int j = numbers.length - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                result[0] = i + 1;
                result[1] = j + 1;
                return result;
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return  result;
    }
}





