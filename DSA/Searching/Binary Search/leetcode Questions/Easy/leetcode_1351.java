/*
1351. Count Negative Numbers in a Sorted Matrix

Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

Example 1:

Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.
 */
public class leetcode_1351 {
    /*
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i=0; i<grid.length;i++){
            count += countRowNegatives(grid[i]);
        }
        return count;
    }
    static int countRowNegatives(int[] row) {
        int start = 0;
        int end = row.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(row[mid] >= 0){
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }

        return row.length - (end+1);
    }
     */
    static public int countNegatives(int[][] grid) {
        int count = 0;
        int totalRows = grid.length;
        int totalCols = grid[0].length;

        int row = 0;
        int clm = totalCols - 1;
        while (row < totalRows && clm >= 0) {
            if (grid[row][clm] < 0) {
                count += totalRows - row;
                clm--;
            } else {
                row++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }
}
