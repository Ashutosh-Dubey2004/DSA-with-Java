/*
442. Find All Duplicates in an Array

Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output

Example 1:
    Input: nums = [4,3,2,7,8,2,3,1]
    Output: [2,3]

Example 2:
    Input: nums = [1,1,2]
    Output: [1]
 */

import java.util.ArrayList;
import java.util.List;

public class leetcode_442 {
    static public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;

            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            }else {
                i++;
            }
        }

        List<Integer> duplicates = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                duplicates.add(nums[j]);
            }
        }

        return duplicates;
    }

    static public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] ans = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> duplicates = findDuplicates(ans);
        System.out.println(duplicates); // Expected-[2,3]
    }
}
