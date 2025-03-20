/*
448. Find All Numbers Disappeared in an Array

Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

Example 1:
    Input: nums = [4,3,2,7,8,2,3,1]
    Output: [5,6]

Example 2:
    Input: nums = [1,1]
    Output: [2]
 */

import java.util.ArrayList;
import java.util.List;

public class leetcode_448 {
    static public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i =0;
        while (i<nums.length) {
            int correctIndex = nums[i]-1;
            if (nums[i] > 0 && nums[i]<=nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            }else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                ans.add(j+1);
            }
        }
        return ans;
    }
    static public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] nums = { 4,3,2,7,8,2,3,1 };
        List<Integer> ans = findDisappearedNumbers(nums);
        System.out.println(ans);
    }
}
