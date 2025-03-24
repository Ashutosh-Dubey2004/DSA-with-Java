/*
Q1. Maximum Containers on a Ship

You are given a positive integer n representing an n x n cargo deck on a ship. Each cell on the deck can hold one container with a weight of exactly w.

However, the total weight of all containers, if loaded onto the deck, must not exceed the ship's maximum weight capacity, maxWeight.

Return the maximum number of containers that can be loaded onto the ship.

 

Example 1:

Input: n = 2, w = 3, maxWeight = 15

Output: 4

Explanation:

The deck has 4 cells, and each container weighs 3. The total weight of loading all containers is 12, which does not exceed maxWeight
 */

public class leetcode_3492 {
    // static public int maxContainers(int n, int w, int maxWeight) {
    //     int count = 0;
    //     int totalWeight = 0;
    //     for (int i = 1; i <= n * n; i++) {  
    //         if (totalWeight + w > maxWeight) {  
    //             break;
    //         }
    //         totalWeight += w;
    //         count++;
    //     }
    //     return count;
    // }

    // static public int maxContainers(int n, int w, int maxWeight){
    //     int totalWeight = n*n * w;
    //     if (totalWeight<maxWeight) {
    //         return n*n;
    //     }else{
    //         return maxWeight / w;
    //     }
    // }

    static  public int maxContainers(int n, int w, int maxWeight) {
        return (n*n > maxWeight/w) ? maxWeight / w : n*n;
    }

    public static void main(String[] args) {
        int n = 2;
        int w = 3;
        int maxWeight = 15;
        System.out.println(maxContainers(n, w, maxWeight));
    }
}