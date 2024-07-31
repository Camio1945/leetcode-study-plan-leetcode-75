package cn.huava.leetcode75;

/**
 * <a href="https://leetcode.com/problems/unique-paths/?envType=study-plan-v2&envId=leetcode-75">62.
 * Unique Paths</a> <br>
 *
 * @author Camio1945
 */
public class P63UniquePaths {

  public int uniquePaths(int m, int n) {
    if (m == 1 && n == 1) {
      return 1;
    }
    int[][] dp = new int[m + 2][n + 2];
    dp[0][0] = 0;
    dp[0][1] = 0;
    dp[1][0] = 0;
    dp[0][2] = 1;
    dp[2][0] = 1;
    for (int i = 1; i <= m; i++) {
      for (int j = 1; j <= n; j++) {
        dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
      }
    }
    return dp[m][n];
  }
}
