/*
34. Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

Example 1:
    Input: nums = [5,7,7,8,8,10], target = 8
    Output: [3,4]

Example 2:
    Input: nums = [5,7,7,8,8,10], target = 6
    Output: [-1,-1]

Example 3:
    Input: nums = [], target = 0
    Output: [-1,-1]
 */
public class leetcode_34 {
    static public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        if (nums.length == 0) {
            return result;
        }

        int starting = leftBinarySearch(nums, target);  
        int ending = rightBinarySearch(nums, target);  

        // If the target is not found, return [-1, -1]
        if (starting <= ending) {
            result[0] = starting;
            result[1] = ending;
        }
        return result;
    }

    static public int leftBinarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // Check if found
        if (start < arr.length && arr[start] == target) return start;
        return -1;
    }

    static public int rightBinarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // Check if found
        if (end >= 0 && arr[end] == target) return end;
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8,8,8, 8, 10};
        int target = 8;
        int[] result = searchRange(arr, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
