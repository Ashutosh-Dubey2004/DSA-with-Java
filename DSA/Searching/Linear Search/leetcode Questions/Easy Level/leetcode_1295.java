// 1295. Find Numbers with Even Number of Digits
/*
 Input: nums = [12,345,2,6,7896]
    Output: 2
    Explanation: 
    12 contains 2 digits (even number of digits). 
    345 contains 3 digits (odd number of digits). 
    2 contains 1 digit (odd number of digits). 
    6 contains 1 digit (odd number of digits). 
    7896 contains 4 digits (even number of digits). 
    Therefore only 12 and 7896 contain an even number of digits.
*/


public class leetcode_1295 {
    static public int findNumbers(int[] nums) {
            // int result = 0;
            // int digitCounter = 0;
            // for(int num: nums){
            //     while(num > 0){
            //         digitCounter ++;
            //         num /= 10;
            //     }
            //     if(digitCounter % 2 == 0){
            //         result ++;
            //     }
            //     digitCounter = 0;
            // }
    
            int result = 0;
            int digitCounter = 0;
            for(int num: nums){
                digitCounter = (int)(Math.log10(num)) + 1;
                if(digitCounter % 2 == 0){
                    result ++;
                }
                digitCounter = 0;
            }
    
            return result;
        }

    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
}