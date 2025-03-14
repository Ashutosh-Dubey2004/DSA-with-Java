/*
    2529. Maximum Count of Positive Integer and Negative Integer

    Input: nums = [-3,-2,-1,0,0,1,2]
    Output: 3
    Explanation: There are 2 positive integers and 3 negative integers. The maximum count among them is 3.
 */
public class leetcode_2529 {
    static public int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;
        for(int num: nums){
            if(num==0){
                continue;
            }else if(num<0){
                neg++;
            }else{
                pos++;
            }
        }
        if(pos <= neg){
            return neg;
        }else{
            return pos;
        }
    }

    public static void main(String[] args) {
        int[] arr = {-3,-2,-1,0,0,1,2};
        System.out.println(maximumCount(arr));
    }
}