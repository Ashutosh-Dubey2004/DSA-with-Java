// 724. Find Pivot Index
/*
    Example 1:
        Input: nums = [1,7,3,6,5,6]
        Output: 3
        Explanation:
        The pivot index is 3.
        Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
        Right sum = nums[4] + nums[5] = 5 + 6 = 11
    
    Example 2:
        Input: nums = [1,2,3]
        Output: -1
        Explanation:
        There is no index that satisfies the conditions in the problem statement.

    Example 3:
        Input: nums = [2,1,-1]
        Output: 0
        Explanation:
        The pivot index is 0.
        Left sum = 0 (no elements to the left of index 0)
        Right sum = nums[1] + nums[2] = 1 + -1 = 0
 */

public class leetcode_724{
    static public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int totalSum = 0;
        
        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    } 

    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        System.out.println(pivotIndex(arr));
    }
}