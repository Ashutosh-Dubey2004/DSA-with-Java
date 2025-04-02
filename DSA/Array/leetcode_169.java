/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */

public class leetcode_169 {
    static public int majorityElement(int[] nums) {
        int element = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == element) {
                count++;
            }else{
                count--;
            }

            if (count==0) {
                element = nums[i];
                count=1;
            }
        }
        return element;
    } 
    public static void main(String[] args) {
        int[] nums = {0,2,1,1,1,2,2,2};
        System.out.println(majorityElement(nums));
    }  
}
