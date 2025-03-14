public class leetcode_287 {
    static public boolean search(int[] nums, int start, int end, int target){
        for(int i = start; i <= end; i++){
            if(nums[i] == target){
                return true;
            }
        }
        return false;
    }
    static public int findDuplicate(int[] nums) {
        int n = nums.length-1;
        for(int i=0; i<= n-1;i++){
            boolean result = search(nums, i+1, n, nums[i]);
            if(result == true){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,1};
        System.out.println(findDuplicate(arr));
        // System.out.println(search(arr, 4, 4, 2));
    }
}
