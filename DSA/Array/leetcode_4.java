public class leetcode_4 {
    // static public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    // int m = nums1.length;
    // int n = nums2.length;
    // int size = m + n;
    // int[] mergedArray = new int[size];
    // double median;

    // for (int i = 0; i < m; i++) {
    // mergedArray[i] = nums1[i];
    // }
    // for (int i = 0, j = m; i < n; i++, j++) {
    // mergedArray[j] = nums2[i];
    // }

    // Arrays.sort(mergedArray);

    // if (size % 2 != 0) {
    // median = mergedArray[size / 2];
    // } else {
    // int left = mergedArray[(size / 2) - 1];
    // int right = mergedArray[size / 2];
    // median = (left + right) / 2.0;
    // }
    // return median;
    // }
    static public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int totalLength = m + n;
        int[] nums = new int[totalLength];

        int index = 0, i = 0, j = 0;
        while (i<m && j<n) {
            if (nums1[i] < nums2[j]) {
                nums[index++] = nums1[i++];
            } else {
                nums[index++] = nums2[j++];
            }
        }
        while (i < m) {
            nums[index++] = nums1[i++];
        }
        while (j < n) {
            nums[index++] = nums2[j++];
        }
        
        double median = 0;
        if (totalLength % 2 != 0) {
            median = nums[totalLength/2];
        } else {
            int left = nums[(totalLength / 2)-1];
            int right = nums[totalLength / 2];
            median = (left + right) / 2.0;
        }
        return median;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2 }, nums2 = { 3, 4 };
        System.out.println(findMedianSortedArrays(nums1, nums2)); 
    }
}
