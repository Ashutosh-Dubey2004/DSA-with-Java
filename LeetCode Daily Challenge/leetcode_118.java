/*
118. Pascal's Triangle

Given an integer numRows, return the first numRows of Pascal's triangle.

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 */

import java.util.ArrayList;
import java.util.List;

public class leetcode_118 {
    static public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int row = 1; row <= numRows; row++) {
            List<Integer> temp = new ArrayList<>();

            for (int i = 1; i <= row; i++) {
                if (i == 1 || i == row) {
                    temp.add(1);
                } else {
                    int val = result.get(row - 2).get(i - 2) + result.get(row - 2).get(i - 1);
                    temp.add(val);
                }
            }

            result.add(temp);
        }

        return result;
    }
    public static void main(String[] args) {
        System.err.println(generate(5));
    }
}
