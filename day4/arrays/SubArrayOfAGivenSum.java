package day4.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArrayOfAGivenSum {
    public static ArrayList<Integer> subarraySum(int[] arr, int n, long s) {
        //sliding window
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = i; j < n; j++) {
                if (sum > s)
                    break;
                sum += arr[j];
                if (sum == s) {
                    return new ArrayList<Integer>(Arrays.asList(i+1, j+1));
                }
            }
        }
        return new ArrayList<Integer>(List.of(-1));
    }
}
