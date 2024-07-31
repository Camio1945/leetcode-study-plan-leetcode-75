package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/min-cost-climbing-stairs/?envType=study-plan-v2&envId=leetcode-75">746.
 * Min Cost Climbing Stairs</a> <br>
 *
 * @author Camio1945
 */
public class P60MinCostClimbingStairs {
  public int minCostClimbingStairs(int[] cost) {
    int n = cost.length;
    int[] dp = new int[n + 1];
    dp[0] = cost[0];
    dp[1] = cost[1];
    for (int i = 2; i <= n; i++) {
      int val = i == n ? 0 : cost[i];
      dp[i] = Math.min(dp[i - 1] + val, dp[i - 2] + val);
    }
    return dp[n];
  }
}
