package day6.leetCode;

import java.util.Arrays;

/*
Given an integer array nums, return the largest perimeter of a triangle with a non-zero area,
    formed from three of these lengths. If it is impossible to form any triangle of a non-zero area, return 0.
 */
public class LeetCodeProblemOne {
    public static int largestPerimeter(int[] nums) {
        int solution = 0;
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            int a = nums[i];
            int b = nums[i - 1];
            int c = nums[i - 2];
            if (b + c > a) {
                solution = a + b + c;
                break;
            }
        }
        return solution;
    }
}
