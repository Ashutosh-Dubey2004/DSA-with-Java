/*
2874. Maximum Value of an Ordered Triplet II

You are given a 0-indexed integer array nums.

Return the maximum value over all triplets of indices (i, j, k) such that i < j < k. If all such triplets have a negative value, return 0.

The value of a triplet of indices (i, j, k) is equal to (nums[i] - nums[j]) * nums[k].

Example 1:

Input: nums = [12,6,1,2,7]
Output: 77
Explanation: The value of the triplet (0, 2, 4) is (nums[0] - nums[2]) * nums[4] = 77.
It can be shown that there are no ordered triplets of indices with a value greater than 77. 
 */

public class leetcode_2874 {
    static public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long maxLeft = 0;
        long maxDiff = 0;
        long result = 0;
        for(int i=0; i<n; i++){
            result = Math.max(result, (maxDiff * nums[i]));
            maxDiff = Math.max(maxDiff, (maxLeft - nums[i]));
            maxLeft = Math.max(maxLeft, nums[i]);
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {12,6,1,2,7};
        System.out.println(maximumTripletValue(nums));
    }
}
