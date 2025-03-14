/*
1346. Check If N and Its Double Exist
    Input: arr = [10,2,5,3]
    Output: true
    Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
 */
public class leetcode_1346 {
    static public boolean checkIfExist(int[] arr) {
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr.length;j++){
                if(i == j){
                    continue;
                }
                if(arr[i] == 2 * arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {10,2,5,3};
        System.out.println(checkIfExist(arr));
    }
}
