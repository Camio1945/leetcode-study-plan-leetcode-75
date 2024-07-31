package cn.huava.leetcode75;

import java.util.Arrays;

/**
 * <a
 * href="https://leetcode.com/problems/successful-pairs-of-spells-and-potions/?envType=study-plan-v2&envId=leetcode-75">2300.
 * Successful Pairs of Spells and Potions</a> <br>
 * [improved] Kudos to <a
 * href="https://leetcode.cn/problems/successful-pairs-of-spells-and-potions/solutions/2520333/gong-shui-san-xie-jing-dian-er-fen-yun-y-86y0">宫水三叶</a>
 *
 * @author Camio1945
 */
public class P54SuccessfulPairsOfSpellsAndPotions {

  public int[] successfulPairs(int[] spells, int[] potions, long success) {
    int[] res = new int[spells.length];
    Arrays.sort(potions);
    for (int i = 0; i < spells.length; i++) {
      double leastPotion = success * 1D / spells[i];
      int left = 0;
      int right = potions.length - 1;
      while (left < right) {
        int middle = left + (right - left) / 2;
        // important 2 lines
        if (potions[middle] >= leastPotion) {
          right = middle;
        } else {
          left = middle + 1;
        }
      }
      if ((long) potions[right] * spells[i] >= success) {
        res[i] = potions.length - right;
      }
    }
    return res;
  }
}
