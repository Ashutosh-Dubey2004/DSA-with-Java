/*
287. Find the Duplicate Number

Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant extra space.

Example 1:
    Input: nums = [1,3,4,2,2]
    Output: 2
Example 2:
    Input: nums = [3,1,3,4,2]
    Output: 3
 */
public class leetcode_287 {
    // static public int findDuplicate(int[] nums) {
    //     int n = nums.length-1;
    //     int i = 0;
    //     while (i <= n) {
    //         int correctIndex = nums[i]-1;
    //         if (nums[i] != nums[correctIndex]) {
    //             swap(nums, i, correctIndex);
    //         }else{
    //             i++;
    //         }
    //     }
    //     for (int j = 0; j < n; j++) {
    //         if (nums[j] != j+1) {
    //             return j+1;
    //         }
    //     }
    //     return nums[n];
    // }

    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correctIndex = nums[i] - 1;
                
                if (nums[i] == nums[correctIndex]) {
                    return nums[i];
                }

                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        return -1; 
    }

    static public void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
}