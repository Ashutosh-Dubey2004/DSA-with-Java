/*
3169. Count Days Without Meetings

You are given a positive integer days representing the total number of days an employee is available for work (starting from day 1). You are also given a 2D array meetings of size n where, meetings[i] = [start_i, end_i] represents the starting and ending days of meeting i (inclusive).

Return the count of days when the employee is available for work but no meetings are scheduled.

Note: The meetings may overlap.


Example 1:

Input: days = 10, meetings = [[5,7],[1,3],[9,10]]

Output: 2

Explanation:

There is no meeting scheduled on the 4th and 8th days.

Example 2:

Input: days = 5, meetings = [[2,4],[1,3]]

Output: 1

Explanation:

There is no meeting scheduled on the 5th day.
 */

import java.util.Arrays;

public class leetcode_3169 {
    // There is one error in this method it also count the overlapped dayes....
    // static public int countDays(int days, int[][] meetings) {
    //     int meetingDaysCount = 0;
    //     for (int i = 0; i < meetings.length; i++) {
    //         meetingDaysCount += meetings[i][1] - meetings[i][0] + 1;
    //     }
    //     return days - meetingDaysCount;
    // }

    // Solution 1:
    // static public int countDays(int days, int[][] meetings) {
    //     boolean[] totalDays = new boolean[days];
    //     int count = 0;
    //     for (int i = 0; i < meetings.length; i++) {
    //         for (int j = meetings[i][0]; j <= meetings[i][1]; j++) {
    //             totalDays[j - 1] = true;
    //         }
    //     }
    //     System.out.println(Arrays.toString(totalDays));
    //     for (int i = 0; i < totalDays.length; i++) {
    //         if (!totalDays[i]) {
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    // Solution 2 :
    static public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int meetingDaysCount = 0, prevEnd = 0;
        for (int[] meeting : meetings) {
            int start = Math.max(meeting[0], prevEnd + 1);
            int end = meeting[1];

            if (start <= end) {
                meetingDaysCount += (end - start) + 1;
                prevEnd = end;
            }
        }
        return days - meetingDaysCount;
    }

    public static void main(String[] args) {
        int days = 10;
        int[][] meetings = { { 5, 7 }, { 1, 3 }, { 9, 10 } };
        System.out.println(countDays(days, meetings));
    }
}
