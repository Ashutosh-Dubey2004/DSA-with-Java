/*
2873. Maximum Value of an Ordered Triplet I

You are given a 0-indexed integer array nums.

Return the maximum value over all triplets of indices (i, j, k) such that i < j < k. If all such triplets have a negative value, return 0.

The value of a triplet of indices (i, j, k) is equal to (nums[i] - nums[j]) * nums[k].

 

Example 1:

Input: nums = [12,6,1,2,7]
Output: 77
Explanation: The value of the triplet (0, 2, 4) is (nums[0] - nums[2]) * nums[4] = 77.
It can be shown that there are no ordered triplets of indices with a value greater than 77. 
 */

import java.util.Arrays;

public class leetcode_2873 {
    static public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = 0;
        for (int j = 1; j < n; j++) {
            leftMax[j] = Math.max(leftMax[j - 1], nums[j - 1]);
        }

        rightMax[n - 1] = 0;
        for (int j = n - 2; j >= 0; j--) {
            rightMax[j] = Math.max(rightMax[j + 1], nums[j + 1]);
        }

        // System.out.println(Arrays.toString(leftMax));
        // System.out.println(Arrays.toString(rightMax));

        long result = 0;
        for (int j = 0; j < n; j++) {
            result = Math.max(result, (long) (leftMax[j] - nums[j]) * rightMax[j]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 12, 6, 1, 2, 7 };
        System.out.println(maximumTripletValue(nums));
        int[] nums2 = { 1000000,1,1000000 };
        System.out.println(maximumTripletValue(nums2));
    }
}
