public class ClimbingStairs {
    public int climbStairs(int n) {
        int x0 = 1, x1 = 1;

        for (int i = 1; i < n; i++) {
            int tmp = x0;
            x0 = x1;
            x1 = tmp + x1;
        }

        return x1;
    }
}
