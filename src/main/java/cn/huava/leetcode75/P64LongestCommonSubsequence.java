package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/longest-common-subsequence/?envType=study-plan-v2&envId=leetcode-75">1143.
 * Longest Common Subsequence</a> <br>
 * [erred] I don't know how to write the dynamic programming formula. <br>
 * So I followed the hints on the official website page.
 *
 * @author Camio1945
 */
public class P64LongestCommonSubsequence {
  public int longestCommonSubsequence(String text1, String text2) {
    int m = text1.length();
    int n = text2.length();
    int[][] dp = new int[m + 1][n + 1];
    for (int i = 1; i <= m; i++) {
      for (int j = 1; j <= n; j++) {
        if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
          dp[i][j] = dp[i - 1][j - 1] + 1;
        } else {
          dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
        }
      }
    }
    return dp[m][n];
  }
}
