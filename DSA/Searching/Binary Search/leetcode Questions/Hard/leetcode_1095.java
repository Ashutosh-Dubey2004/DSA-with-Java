/*
1095. Find in Mountain Array

You may recall that an array arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.

You cannot access the mountain array directly. You may only access the array using a MountainArray interface:

MountainArray.get(k) returns the element of the array at index k (0-indexed).
MountainArray.length() returns the length of the array.
Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that attempt to circumvent the judge will result in disqualification.

Example 1:
    Input: mountainArr = [1,2,3,4,5,3,1], target = 3
    Output: 2
Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.

Example 2:
    Input: mountainArr = [0,1,2,4,2,1], target = 3
    Output: -1
Explanation: 3 does not exist in the array, so we return -1.

Constraints:

3 <= mountainArr.length() <= 104
0 <= target <= 109
0 <= mountainArr.get(index) <= 10
*/

public class leetcode_1095 {
    static public int findInMountainArray(int target, int[] mountainArr) {
        int peakOfMountain = peak(mountainArr);
        int left = accBinarySearch(mountainArr, 0, peakOfMountain, target);
        if (left != -1){
            return left;
        }

        int right = decBinarySearch(mountainArr, peakOfMountain+1, mountainArr.length-1,target);
        return right;
    }
    static public int peak(int[] mountainArr){
        int start = 0;
        int end = mountainArr.length-1;
        while (start < end) {
            int mid = start + (end-start)/2;
            if (mountainArr[mid] < mountainArr[mid+1]) {
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }
    static public int accBinarySearch(int[] arr, int start, int end, int target){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target)
                return mid;
            
            if(arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
    static public int decBinarySearch(int[] arr, int start, int end, int target){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target)
                return mid;
            
            if(arr[mid] > target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(findInMountainArray(target, arr));
    }
}
