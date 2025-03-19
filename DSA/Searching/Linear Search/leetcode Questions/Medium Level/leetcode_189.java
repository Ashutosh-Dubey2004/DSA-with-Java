// 189. Rotate Array
/*
    Input: nums = [1,2,3,4,5,6,7], k = 3
    Output: [5,6,7,1,2,3,4]
    Explanation:
    rotate 1 steps to the right: [7,1,2,3,4,5,6]
    rotate 2 steps to the right: [6,7,1,2,3,4,5]
    rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */
public class leetcode_189 {
    static void rotate(int[] nums, int k) {
        // Solution - 1
        // for (int i = 0; i < k; i++) {
        // int temp = nums[nums.length-1];
        //     for (int j = nums.length-1; j > 0; j--) {
        //             nums[j] = nums[j-1];
        //     } 
        //     nums[0] = temp;
        // }

        // // Solution - 2
        // int n = nums.length;
        // k = k % n;  // Ensure k is within array bounds

        // int[] leftArr = new int[n - k];
        // int[] rightArr = new int[k];

        // int j = 0;
        // for (int i = 0; i < n; i++) {
        //     if (i < (n - k)) {
        //         leftArr[i] = nums[i];
        //     } else {
        //         rightArr[j] = nums[i];
        //         j++;
        //     }
        // }

        // for (int i = 0; i < rightArr.length; i++) {
        //     nums[i] = rightArr[i];
        // }

        // j = rightArr.length;
        // for (int i = 0; i < leftArr.length; i++, j++) {
        //     nums[j] = leftArr[i];
        // }

        // Solution - 3
        int n = nums.length;
        k = k%n; 

        reverse(nums, 0, n-1);    // Reverse entier array
        reverse(nums, 0, k-1);      // Reverse first k element
        reverse(nums, k, n-1);          // Reverse remaining elements

    }
    static void reverse(int[] arr,int start, int end){
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr, k);
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}
