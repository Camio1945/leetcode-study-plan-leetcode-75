package cn.huava.leetcode75;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <a
 * href="https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/?envType=study-plan-v2&envId=leetcode-75">452.
 * Minimum Number of Arrows to Burst Balloons</a> <br>
 * [erred] Kudos to <a
 * href="https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/solutions/4890422/easy-91-77-beats-c-java-python-javascript-c">otabek_kholmirzaev</a>
 *
 * @author Camio1945
 */
public class P73MinimumNumberOfArrowsToBurstBalloons {
  public int findMinArrowShots(int[][] points) {
    Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
    int res = 1;
    int prevEnd = points[0][1];
    for (int i = 1; i < points.length; i++) {
      int[] curPoint = points[i];
      int curStart = curPoint[0];
      if (curStart > prevEnd) {
        res++;
        prevEnd = curPoint[1];
      }
    }
    return res;
  }
}
