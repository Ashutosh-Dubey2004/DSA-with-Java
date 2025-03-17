/*
100598. Maximum Unique Subarray Sum After Deletion

You are given an integer array nums.

You are allowed to delete any number of elements from nums without making it empty. After performing the deletions, select a subarray of nums such that:

All elements in the subarray are unique.
The sum of the elements in the subarray is maximized.
Return the maximum sum of such a subarray.

A subarray is a contiguous non-empty sequence of elements within an array.
 

Example 1:

Input: nums = [1,2,3,4,5]

Output: 15

Explanation:

Select the entire array without deleting any element to obtain the maximum sum.

Example 2:

Input: nums = [1,1,0,1,1]

Output: 1

Explanation:

Delete the element nums[0] == 1, nums[1] == 1, nums[2] == 0, and nums[3] == 1. Select the entire array [1] to obtain the maximum sum.

Example 3:

Input: nums = [1,2,-1,-2,1,0,-1]

Output: 3

Explanation:

Delete the elements nums[2] == -1 and nums[3] == -2, and select the subarray [2, 1] from [1, 2, 1, 0, -1] to obtain the maximum sum.

 

Constraints:

1 <= nums.length <= 100
-100 <= nums[i] <= 100
 */

import java.util.Arrays;

class Solution1 {
    public static int maxSum(int[] nums) {
        int newLength = removeDuplicate(nums);
        int maxSum = nums[nums.length-1];

        for (int i=0; i<newLength ; i++) {
            System.out.print(nums[i] + " ");
        }
        
        int sum = 0;
        for (int i=newLength-1; i>=0 ; i--) {
            sum += nums[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }

    public static int removeDuplicate(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        Arrays.sort(a);
        int j = 0;
        for (int i = 1; i < a.length; i++) {
            
            if (a[i] != a[j]) {
                j++;
                a[j] = a[i]; 
            }
        }
        return j + 1;
    }
    public static void main(String[] args) {
        System.out.println(maxSum(new int[] { 1,1,0,1,1 }));
        System.out.println(maxSum(new int[] { 1,2,-1,-2,1,0,-1 }));
        System.out.println(maxSum(new int[] { -20, 20 })); // Expected: 20
        System.out.println(maxSum(new int[] { -100 })); // Expected: -100
        System.out.println(maxSum(new int[] { 1, 2, -3, 4, 5 })); // Expected: 9
        System.out.println(maxSum(new int[] { -1, -2, -3, -4 })); // Expected: -1
    }
}
