package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/counting-bits/?envType=study-plan-v2&envId=leetcode-75">338.
 * Counting Bits</a> <br>
 * [improved] Kudos to <a
 * href="https://leetcode.com/problems/counting-bits/solutions/3986178/97-97-dp-bit-manipulation-offset">vanAmsen</a>
 *
 * @author Camio1945
 */
public class P67CountingBits {
  public int[] countBits(int n) {
    int[] ans = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      ans[i] = ans[i >> 1] + (i & 1);
    }
    return ans;
  }
}
