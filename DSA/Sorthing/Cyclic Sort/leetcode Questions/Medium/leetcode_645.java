import java.util.Arrays;

public class leetcode_645 {
    static public int[] findErrorNums(int[] nums) {
        int i=0;
        while (i<nums.length) {
            int correctIndex = nums[i]-1;
            if (nums[i]!=nums[correctIndex]) {
                swap(nums, i, correctIndex);
            }else{
                i++;
            }
        }

        int[] ans = new int[2];
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                ans[0] = nums[j];
                ans[1] = j+1;
            }
        }
        return ans;
    }
    static public void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
}
