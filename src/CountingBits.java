public class CountingBits {
    // 思路一
//    public int[] countBits(int num) {
//        int[] result = new int[num + 1];
//        result[0] = 0;
//        for (int i = 1; i <= num; i++) {
//            result[i] = result[i >> 1] + i & 1;
//        }
//        return result;
//    }

    // 思路二
    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        result[0] = 0;
        int offset = 1;
        for (int i = 1; i <= num; i++) {
            if (offset * 2 == i)
                offset *= 2;
            result[i] = result[i - offset] + 1;
        }
        return result;
    }
}
