package day6.leetCode;

import java.util.Arrays;

/*
A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise, return false.
 */
public class LeetCodeProblemFour {
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int a = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (a != arr[i] - arr[i - 1])
                return false;
        }
        return true;
    }
}
