package day4;
/*
Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 */
public class LeetCodeProblem2 {
    public static int subtractProductAndSum(int n) {
        int productOfDigits = 1;
        int sumOfDigits = 0;
        while (n != 0) {
            productOfDigits *= n % 10;
            sumOfDigits += n % 10;
            n /= 10;
        }
        return productOfDigits - sumOfDigits;
    }
}
