package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/koko-eating-bananas/?envType=study-plan-v2&envId=leetcode-75">875.
 * Koko Eating Bananas</a> <br>
 * [erred] Kudos to <a
 * href="https://leetcode.com/problems/koko-eating-bananas/solutions/1703687/java-c-a-very-very-well-detailed-explanation">hi-malik</a>
 * and <a
 * href="https://leetcode.com/problems/koko-eating-bananas/solutions/1703687/java-c-a-very-very-well-detailed-explanation/comments/2099138">JohnZhong2021</a>
 *
 * @author Camio1945
 */
public class P56KokoEatingBananas {
  public int minEatingSpeed(int[] piles, int h) {
    int left = 1;
    int right = 1_000_000_000;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (canEatInTime(piles, mid, h)) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return left;
  }

  public boolean canEatInTime(int[] piles, int k, int h) {
    long hours = 0;
    for (int pile : piles) {
      int div = pile / k;
      hours += div;
      if (pile % k != 0) {
        hours++;
      }
    }
    return hours <= h;
  }
}
