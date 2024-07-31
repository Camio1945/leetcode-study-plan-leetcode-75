package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/find-the-highest-altitude/?envType=study-plan-v2&envId=leetcode-75">1732.
 * Find the Highest Altitude</a> <br>
 *
 * @author Camio1945
 */
public class P18FindTheHighestAltitude {
  public int largestAltitude(int[] gain) {
    int max = 0;
    int altitude = 0;
    for (int i : gain) {
      altitude += i;
      max = Math.max(max, altitude);
    }
    return max;
  }
}
