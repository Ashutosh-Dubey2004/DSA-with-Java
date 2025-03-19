/*
    2529. Maximum Count of Positive Integer and Negative Integer

    Input: nums = [-3,-2,-1,0,0,1,2]
    Output: 3
    Explanation: There are 2 positive integers and 3 negative integers. The maximum count among them is 3.
 */
public class leetcode_2529 {
    static public int maximumCount(int[] nums) {
        int neg = findFirstPositiveIndex(nums); // Count of negative numbers
        int pos = nums.length - findFirstNonZeroIndex(nums); // Count of positive numbers
        return Math.max(neg, pos);
    }

    static private int findFirstPositiveIndex(int[] nums) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < 0) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left; // Index of first positive number, also the count of negatives
    }

    static private int findFirstNonZeroIndex(int[] nums) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= 0) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left; // Index of first non-zero positive number
    }
    public static void main(String[] args) {
        int[] arr = {-3,-2,-1,0,0,1,2};
        System.out.println(maximumCount(arr));
    }
}