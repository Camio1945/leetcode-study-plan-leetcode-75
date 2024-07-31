package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/can-place-flowers/?envType=study-plan-v2&envId=leetcode-75">605.
 * Can Place Flowers</a> <br>
 *
 * @author Camio1945
 */
public class P04CanPlaceFlowers {
  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    int len = flowerbed.length;
    int oldFlowers = 0;
    int newFlowers = 0;
    for (int i = 0; i < len; i++) {
      if (flowerbed[i] == 1) {
        oldFlowers++;
        newFlowers++;
      }
      // If either of these 3 conditions happens, we cannot plant a flower on this spot:
      // 1. This spot has already planted a flower
      // 2. The left spot has already planted flower
      // 3. The right spot has already planted flower
      boolean canNotPlace =
          (flowerbed[i] == 1)
              || (i - 1 >= 0 && flowerbed[i - 1] == 1)
              || (i + 1 < len && flowerbed[i + 1] == 1);
      if (canNotPlace) {
        continue;
      }
      flowerbed[i] = 1;
      newFlowers++;
    }
    return oldFlowers + n <= newFlowers;
  }
}
