/*
3487. Maximum Unique Subarray Sum After Deletion

You are given an integer array nums.

You are allowed to delete any number of elements from nums without making it empty. After performing the deletions, select a subarray of nums such that:

All elements in the subarray are unique.
The sum of the elements in the subarray is maximized.
Return the maximum sum of such a subarray.

 */

import java.util.HashSet;
import java.util.Set;

public class leetcode_3487 {
    static public int maxSum(int[] nums) {
        int maxSum = 0;
        int neg = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                boolean isUnique = true;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == nums[i]) {
                        isUnique = false;
                        break;
                    }
                }
                if (isUnique) {
                    maxSum += nums[i];
                }
            } else {
                neg = Math.max(neg, nums[i]);
            }
        }

        return maxSum == 0 ? neg : maxSum;
    }

    static public int MaximumSum(int[] nums){
        Set<Integer> s = new HashSet<>();
        int neg = Integer.MIN_VALUE;
        int maxSum = 0;

        for (int num : nums) {
            if (num > 0) {
                if (!s.contains(num)) {
                    maxSum += num;
                    s.add(num);
                }
            }else{
                neg = neg > num ? neg : num;
            }
        }

        return maxSum == 0? neg : maxSum;
    }

    public static void main(String[] args) {

        // Test Case 1: All positive and unique
        int[] test1 = {1, 2, 3};
        System.out.println("Test 1 Output: " + MaximumSum(test1)); // Expected: 6

        // Test Case 2: Positive with duplicates
        int[] test2 = {4, 2, 4, 5, 6};
        System.out.println("Test 2 Output: " + MaximumSum(test2)); // Expected: 13 (2+5+6)

        // Test Case 3: All negative numbers
        int[] test3 = {-100, -20, -30};
        System.out.println("Test 3 Output: " + MaximumSum(test3)); // Expected: -20

        // Test Case 4: Mixed with some duplicates
        int[] test4 = {1, 2, 1, 3, 4};
        System.out.println("Test 4 Output: " + MaximumSum(test4)); // Expected: 9 (2+3+4)

        // Test Case 5: Single negative number
        int[] test5 = {-1};
        System.out.println("Test 5 Output: " + MaximumSum(test5)); // Expected: -1

        // Test Case 6: All positive but all duplicates
        int[] test6 = {2, 2, 2};
        System.out.println("Test 6 Output: " + MaximumSum(test6)); // Expected: 0

        // Test Case 7: Empty array (not valid per problem constraints, but good to check)
        int[] test7 = {};
        System.out.println("Test 7 Output: " + (test7.length == 0 ? "Invalid input" : MaximumSum(test7)));
    }
}
