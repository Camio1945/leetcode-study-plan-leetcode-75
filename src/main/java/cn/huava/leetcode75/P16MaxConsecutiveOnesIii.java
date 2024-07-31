package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/max-consecutive-ones-iii/?envType=study-plan-v2&envId=leetcode-75">1004.
 * Max Consecutive Ones III</a> <br>
 * [erred] Kudos to <a
 * href="https://leetcode.com/problems/max-consecutive-ones-iii/solutions/3540704/solution">deleted_user</a>
 * and <a
 * href="https://leetcode.com/problems/max-consecutive-ones-iii/solutions/3540704/solution/comments/2307432">meghraj__ranaware0078</a>
 *
 * @author Camio1945
 */
public class P16MaxConsecutiveOnesIii {
  public int longestOnes(int[] nums, int k) {
    int i = 0;
    int j = 0;
    while (j < nums.length) {
      if (nums[j] == 0) {
        k--;
      }
      if (k < 0) {
        if (nums[i] == 0) {
          k++;
        }
        i++;
      }
      j++;
    }
    return j - i;
  }
}
