package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/edit-distance/?envType=study-plan-v2&envId=leetcode-75">72.
 * Edit Distance</a> <br>
 *
 * @author Camio1945
 */
public class P66EditDistance {
  public int minDistance(String word1, String word2) {
    int m = word1.length();
    int n = word2.length();
    if (m * n == 0) {
      return m + n;
    }
    int[][] dp = new int[m + 1][n + 1];
    for (int i = 0; i <= m; i++) {
      dp[i][0] = i;
    }
    for (int j = 0; j <= n; j++) {
      dp[0][j] = j;
    }
    for (int i = 1; i <= m; i++) {
      for (int j = 1; j <= n; j++) {
        if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
          dp[i][j] = dp[i - 1][j - 1];
        } else {
          int min = Math.min(dp[i - 1][j], dp[i][j - 1]);
          min = Math.min(min, dp[i - 1][j - 1]);
          dp[i][j] = min + 1;
        }
      }
    }
    return dp[m][n];
  }
}
