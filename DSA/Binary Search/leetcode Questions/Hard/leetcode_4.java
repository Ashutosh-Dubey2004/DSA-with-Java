/*
4. Median of Two Sorted Arrays

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

Example 1:
    Input: nums1 = [1,3], nums2 = [2]
    Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:
    Input: nums1 = [1,2], nums2 = [3,4]
    Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 
Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
 */

import java.util.Arrays;
public class leetcode_4 {
    static public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int size = m + n;
        int[] mergedArray = new int[size];
        double median;

        for (int i = 0; i < m; i++) {
            mergedArray[i] = nums1[i];
        }
        for (int i = 0, j = m; i < n; i++, j++) {
            mergedArray[j] = nums2[i];
        }
        
        Arrays.sort(mergedArray);

        if (size % 2 != 0) {
            median = mergedArray[size/2];
        } else {
            int left = mergedArray[(size / 2)-1];
            int right = mergedArray[size / 2];
            median = (left + right) / 2.0;
        }
        return median;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,3};
        int[] arr2 = {2,6,7};
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
}
