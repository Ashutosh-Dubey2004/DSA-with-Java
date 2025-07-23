/*
1717. Maximum Score From Removing Substrings

You are given a string s and two integers x and y. You can perform two types of operations any number of times.

Remove substring "ab" and gain x points.
For example, when removing "ab" from "cabxbae" it becomes "cxbae".
Remove substring "ba" and gain y points.
For example, when removing "ba" from "cabxbae" it becomes "cabxe".
Return the maximum points you can gain after applying the above operations on s.

Example 1:

Input: s = "cdbcbbaaabab", x = 4, y = 5
Output: 19
Explanation:
- Remove the "ba" underlined in "cdbcbbaaabab". Now, s = "cdbcbbaaab" and 5 points are added to the score.
- Remove the "ab" underlined in "cdbcbbaaab". Now, s = "cdbcbbaa" and 4 points are added to the score.
- Remove the "ba" underlined in "cdbcbbaa". Now, s = "cdbcba" and 5 points are added to the score.
- Remove the "ba" underlined in "cdbcba". Now, s = "cdbc" and 5 points are added to the score.
Total score = 5 + 4 + 5 + 5 = 19.
 */

 public class leetcode_1717 {
    static public String removeSubstring(String s, String matchStr, int[] count) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            sb.append(ch);
            int len = sb.length();
            if (len >= 2 && sb.charAt(len - 2) == matchStr.charAt(0) && sb.charAt(len - 1) == matchStr.charAt(1)) {
                sb.delete(sb.length() - 2, sb.length());
                count[0]++;
            }
        }
        return sb.toString();
    }

    static public int maximumGain(String s, int x, int y) {
        int score = 0;
        String first, second;
        int firstScore, secondScore;

        if (x > y) {
            first = "ab";
            second = "ba";
            firstScore = x;
            secondScore = y;
        } else {
            first = "ba";
            second = "ab";
            firstScore = y;
            secondScore = x;
        }

        int[] firstCount = new int[1];
        s = removeSubstring(s, first, firstCount);
        score += firstCount[0] * firstScore;

        int[] secondCount = new int[1];
        s = removeSubstring(s, second, secondCount);
        score += secondCount[0] * secondScore;

        return score;
    }

    public static void main(String[] args) {
        String s = "cdbcbbaaabab";
        int x = 4, y = 5;
        System.out.println(maximumGain(s, x, y));  
    }
}
