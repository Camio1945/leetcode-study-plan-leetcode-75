package cn.huava.leetcode75;

import java.util.*;

/**
 * <a
 * href="https://leetcode.com/problems/asteroid-collision/?envType=study-plan-v2&envId=leetcode-75">735.
 * Asteroid Collision</a> <br>
 * [improved] Kudos to <a
 * href="https://leetcode.com/problems/asteroid-collision/solutions/5513014/beats-100-1ms-virtual-stack-solution">aryaveer1214</a>
 *
 * @author Camio1945
 */
public class P25AsteroidCollision {
  public int[] asteroidCollision(int[] asteroids) {
    int maxSurvivedIndex = -1;
    for (int i = 0; i < asteroids.length; i++) {
      int val = asteroids[i];
      if (val > 0) {
        asteroids[++maxSurvivedIndex] = val;
        continue;
      }
      boolean isNegativeSurvived = true;
      while (maxSurvivedIndex >= 0 && asteroids[maxSurvivedIndex] > 0 && isNegativeSurvived) {
        int sum = asteroids[maxSurvivedIndex] + val;
        if (sum <= 0) {
          maxSurvivedIndex--;
        }
        if (sum >= 0) {
          isNegativeSurvived = false;
        }
      }
      if (isNegativeSurvived) {
        asteroids[++maxSurvivedIndex] = val;
      }
    }
    return Arrays.copyOfRange(asteroids, 0, maxSurvivedIndex + 1);
  }
}
