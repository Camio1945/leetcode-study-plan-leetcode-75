package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/n-th-tribonacci-number/?envType=study-plan-v2&envId=leetcode-75">1137.
 * N-th Tribonacci Number</a> <br>
 *
 * @author Camio1945
 */
public class P59NThTribonacciNumber {

  public int tribonacci(int n) {
    int[] dp = new int[n + 3];
    dp[0] = 0;
    dp[1] = 1;
    dp[2] = 1;
    for (int i = 3; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
    }
    return dp[n];
  }
}
