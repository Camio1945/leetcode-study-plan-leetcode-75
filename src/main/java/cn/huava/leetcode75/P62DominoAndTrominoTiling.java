package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/domino-and-tromino-tiling/?envType=study-plan-v2&envId=leetcode-75">790.
 * Domino and Tromino Tiling</a> <br>
 * [erred] Kudos to <a
 * href="https://leetcode.com/problems/domino-and-tromino-tiling/solutions/1620809/python-java-c-c-dp-image-visualized-explanation-100-faster-o-n">linfq</a>
 *
 * @author Camio1945
 */
public class P62DominoAndTrominoTiling {
  public int numTilings(int n) {
    long[] dp = new long[n + 3];
    dp[0] = 1;
    dp[1] = 2;
    dp[2] = 5;
    for (int i = 3; i < n; i++) {
      dp[i] = (dp[i - 1] * 2 + dp[i - 3]) % 1000000007;
    }
    return (int) dp[n - 1];
  }
}
