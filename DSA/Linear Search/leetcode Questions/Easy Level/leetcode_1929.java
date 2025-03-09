// 1929. Concatenation of Array
/* 
    Example 1:

        Input: nums = [1,2,1]
        Output: [1,2,1,1,2,1]
        Explanation: The array ans is formed as follows:
        - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
        - ans = [1,2,1,1,2,1]
    Example 2:

        Input: nums = [1,3,2,1]
        Output: [1,3,2,1,1,3,2,1]
        Explanation: The array ans is formed as follows:
        - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
        - ans = [1,3,2,1,1,3,2,1]
 */
public class leetcode_1929 {
    static public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];

        // Solution - 1
        // int j=0;
        // for (int i = 0; i < ans.length; i++) {
        //     ans[i] = nums[j];
        //     if (j == nums.length - 1) {
        //         j = 0;
        //     }else{
        //         j++;
        //     }
        // }

        // Solution - 2
        // for (int i = 0; i < nums.length; i++) {
        //     ans[i] = nums[i];
        // }
        // int j=nums.length;
        // for (int i : nums) {
        //     ans[j] = i;
        //     j++;
        // }

        // Solution - 3
        for (int i = 0, j = nums.length; i < nums.length; i++, j++) {
            ans[j] = ans[i] = nums[i];
        }

        return ans;
    }

    


    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        int[] result = getConcatenation(arr);
        for (int i : result) {
            System.out.print(i + ", ");
        }
    }
}
