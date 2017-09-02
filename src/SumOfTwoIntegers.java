import java.util.LinkedList;

public class SumOfTwoIntegers {
    public static int getSum(int a, int b) {
        int carry = 0;
        int result = 0;
        LinkedList<Integer> bits = new LinkedList<Integer>();

        while (a != 0 || b != 0 || carry != 0) {
            int a0 = a & 1;
            int b0 = b & 1;
            bits.push(a0 ^ b0 ^ carry);
            carry = a0 & b0 | a0 & carry | b0 & carry;
            a >>>= 1;
            b >>>= 1;
        }

        while (!bits.isEmpty()) {
            result = result << 1 | bits.pop();
        }
        return  result;
    }

    public static void main(String[] args) {
        System.out.println(getSum(-1, 1));
    }
}
