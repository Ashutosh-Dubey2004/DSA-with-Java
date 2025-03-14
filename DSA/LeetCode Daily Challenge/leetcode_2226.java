/*
2226. Maximum Candies Allocated to K Children

You are given a 0-indexed integer array candies. Each element in the array denotes a pile of candies of size candies[i]. You can divide each pile into any number of sub piles, but you cannot merge two piles together.

You are also given an integer k. You should allocate piles of candies to k children such that each child gets the same number of candies. Each child can be allocated candies from only one pile of candies and some piles of candies may go unused.

Return the maximum number of candies each child can get.

Example 1:
    Input: candies = [5,8,6], k = 3
    Output: 5
Explanation: We can divide candies[1] into 2 piles of size 5 and 3, and candies[2] into 2 piles of size 5 and 1. We now have five piles of candies of sizes 5, 5, 3, 5, and 1. We can allocate the 3 piles of size 5 to 3 children. It can be proven that each child cannot receive more than 5 candies.

Example 2:
    Input: candies = [2,5], k = 11
    Output: 0
Explanation: There are 11 children but only 7 candies in total, so it is impossible to ensure each child receives at least one candy. Thus, each child gets no candy and the answer is 0.
 */
public class leetcode_2226{
    static public int maximumCandies(int[] candies, long k) {
        int left = 1, right = 0;
        for (int c : candies) {
            right = Math.max(right, c);
        }

        int result = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canDistribute(candies, k, mid)) {
                result = mid;  // Try for a higher value
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    private static boolean canDistribute(int[] candies, long k, int mid) {
        long count = 0;
        for (int c : candies) {
            count += (c / mid);
            if (count >= k) return true;  // No need to count further
        }
        return count >= k;
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 6};
        int k = 3;
        System.out.println(maximumCandies(arr, k)); // Output: 5

        int[] arr2 = {2, 5};
        int k2 = 11;
        System.out.println(maximumCandies(arr2, k2)); // Output: 0
    }
}
