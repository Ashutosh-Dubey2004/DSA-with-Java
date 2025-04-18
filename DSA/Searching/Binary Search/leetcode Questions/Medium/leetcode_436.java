/*
436. Find Right Interval

You are given an array of intervals, where intervals[i] = [starti, endi] and each starti is unique.

The right interval for an interval i is an interval j such that startj >= endi and startj is minimized. Note that i may equal j.

Return an array of right interval indices for each interval i. If no right interval exists for interval i, then put -1 at index i.

Example 1:
Input: intervals = [[1,2]]
Output: [-1]
Explanation: There is only one interval in the collection, so it outputs -1.


Example 2:
Input: intervals = [[3,4],[2,3],[1,2]]
Output: [-1,0,1]
Explanation: There is no right interval for [3,4].
The right interval for [2,3] is [3,4] since start0 = 3 is the smallest start that is >= end1 = 3.
The right interval for [1,2] is [2,3] since start1 = 2 is the smallest start that is >= end2 = 2.
 */

import java.util.Arrays;
import java.util.HashMap;

public class leetcode_436 {
    static public int[] findRightInterval(int[][] intervals) {
        // Brute force Approch 
        /* 
        int[] ans = new int[intervals.length];

        for(int i=0;i<intervals.length;i++){
            int minStart = Integer.MAX_VALUE;
            int index = -1;
            for(int j=0;j<intervals.length;j++){
                if(intervals[j][0] >= intervals[i][1]  && minStart > intervals[j][0]){
                    minStart = intervals[j][0];
                    index = j;
                }
            }
            ans[i] = index;
        }

       return ans;
       */

        // Binary Search Approch

        HashMap<Integer, Integer> hash = new HashMap<>();
        int[] firstArray = new int[intervals.length];

        for(int i=0; i<intervals.length;i++){
            hash.put(intervals[i][0], i);
            firstArray[i] = intervals[i][0];
        }

        Arrays.sort(firstArray);
        int[] ans = new int[intervals.length];

        for(int i=0; i<intervals.length;i++){
            int index = binearySearch(firstArray, intervals[i][1]);
            if(index == intervals.length){
                ans[i] = -1;
            }else if(index == 0){
                if(intervals[i][1] <= firstArray[index]){
                    ans[i] = hash.get(firstArray[index]);
                }else{
                    ans[i] = -1;
                }
            }else{
                ans[i] = hash.get(firstArray[index]);
            }
        }

        return ans;
    }

    static int binearySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start) / 2;
            if(arr[mid] >= target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[][] intervals = {{3,4},{2,3},{1,2}};
        int[] ans = findRightInterval(intervals);
        System.out.println(Arrays.toString(ans));
    }
}
