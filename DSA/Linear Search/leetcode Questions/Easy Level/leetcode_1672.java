// 1672. Richest Customer Wealth
/*
    Input: accounts = [[1,5],[7,3],[3,5]]
    Output: 10
    Explanation: 
    1st customer has wealth = 6
    2nd customer has wealth = 10 
    3rd customer has wealth = 8
    The 2nd customer is the richest with a wealth of 10.
 */
public class leetcode_1672 {
    static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            if (maxWealth <= wealth) {
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,5},{7,3},{3,5}};
        int result = maximumWealth(arr);
        System.out.println(result);
    }
}
