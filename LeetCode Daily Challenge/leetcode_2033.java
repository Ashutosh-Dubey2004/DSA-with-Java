/*
2033. Minimum Operations to Make a Uni-Value Grid

You are given a 2D integer grid of size m x n and an integer x. In one operation, you can add x to or subtract x from any element in the grid.

A uni-value grid is a grid where all the elements of it are equal.

Return the minimum number of operations to make the grid uni-value. If it is not possible, return -1.

Example 1:
Input: grid = [[2,4],[6,8]], x = 2
Output: 4
Explanation: We can make every element equal to 4 by doing the following: 
- Add x to 2 once.
- Subtract x from 6 once.
- Subtract x from 8 twice.
A total of 4 operations were used.
 */

import java.util.ArrayList;
import java.util.Collections;

public class leetcode_2033 {
    static public int minOperations(int[][] grid, int x) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                nums.add(grid[i][j]);
            }
        }

        Collections.sort(nums);
        int n = nums.size();
        int commonNum = nums.get(n / 2);
        int operation = 0;

        for (Integer num : nums) {
            if (num % x != commonNum % x) {
                return -1;
            }
            operation += Math.abs(commonNum - num) / x;
        }
        return operation;
    }

    public static void main(String[] args) {
        int[][] grid = { { 1, 4 }, { 2, 3 } };
        int x = 2;
        System.out.println(minOperations(grid, x));
    }
}
