public class leetcode_35 {
    // 35. Search Insert Position
    static class Solution {
        public int searchInsert(int[] nums, int target) {
            int start = 0;
            int end = nums.length-1;
            while(start <= end){
                int mid = start + (end - start) / 2;
                if(nums[mid] == target)
                    return mid;
                
                if(nums[mid] < target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
            return start;
        }
    }
    public static void main(String[] args){
        Solution obj = new Solution();
        int[] arr = {1,3,5,6};
        int target = 2;
        int result = obj.searchInsert(arr, target);
        System.out.println("Result is :"+ result);
    }

}
