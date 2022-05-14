package day8.leetCode;

import java.util.HashMap;
import java.util.Map;

/*
The next greater element of some element x in an array is
    the first greater element that is to the right of x in the same array.
You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine
    the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.
Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
 */
public class LeetCodeProblemOne {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] answer = new int[nums1.length];
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            hashMap.put(nums2[i], i);
        }
        for (int i = 0; i < nums1.length; i++) {
            int index = hashMap.get(nums1[i]);
            int greaterNumber = -1;
            while (index != nums2.length) {
                if (nums1[i] < nums2[index]){
                    greaterNumber = nums2[index];
                    break;
                }
                index++;
            }
            answer[i] = greaterNumber;
        }
        return answer;
    }
}
