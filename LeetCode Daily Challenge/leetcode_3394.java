/*
3394. Check if Grid can be Cut into Sections

You are given an integer n representing the dimensions of an n x n grid, with the origin at the bottom-left corner of the grid. You are also given a 2D array of coordinates rectangles, where rectangles[i] is in the form [startx, starty, endx, endy], representing a rectangle on the grid. Each rectangle is defined as follows:

(startx, starty): The bottom-left corner of the rectangle.
(endx, endy): The top-right corner of the rectangle.
Note that the rectangles do not overlap. Your task is to determine if it is possible to make either two horizontal or two vertical cuts on the grid such that:

Each of the three resulting sections formed by the cuts contains at least one rectangle.
Every rectangle belongs to exactly one section.
Return true if such cuts can be made; otherwise, return false.

Example 1:
Input: n = 5, rectangles = [[1,0,5,2],[0,2,2,4],[3,2,5,3],[0,4,4,5]]
Output: true

The grid is shown in the diagram. We can make horizontal cuts at y = 2 and y = 4. Hence, output is true.
 */

import java.util.Arrays;

public class leetcode_3394 {
    static public boolean checkValidCuts(int n, int[][] rectangles) {
        // For X-Axis
        Arrays.sort(rectangles, (a, b) -> Integer.compare(a[0], b[0]));
        int count = 0;
        int maxEnd = rectangles[0][2];

        for (int i = 1; i < rectangles.length; i++) {
            if (rectangles[i][0] >= maxEnd) {
                count++;
                maxEnd = rectangles[i][2];
            } else {
                maxEnd = Math.max(maxEnd, rectangles[i][2]);
            }
        }

        if (count >= 2) {
            return true;
        }

        // For Y-Axis
        Arrays.sort(rectangles, (a, b) -> Integer.compare(a[1], b[1]));
        count = 0;
        maxEnd = rectangles[0][3];

        for (int i = 1; i < rectangles.length; i++) {
            if (rectangles[i][1] >= maxEnd) {
                count++;
            }
            maxEnd = Math.max(maxEnd, rectangles[i][3]);

        }

        if (count >= 2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] rectangles = { { 0, 2, 2, 4 }, { 1, 0, 3, 2 }, { 2, 2, 3, 4 }, { 3, 0, 4, 2 }, { 3, 2, 4, 4 } };
        System.out.println(checkValidCuts(n, rectangles));
    }
}
