package day4;

/*
Program to find number of 1 bits in a given unsigned integer
 */
public class LeetCodeProblem1 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(-3));
    }

    public static int hammingWeight(int n) {
        int hw = 0;
        while (n != 0) {
            if (n < 0) {
                hw++;
            }
            n <<= 1;
        }
        return hw;
    }
}
