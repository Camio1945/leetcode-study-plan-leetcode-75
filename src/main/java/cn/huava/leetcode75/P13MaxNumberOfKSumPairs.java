package cn.huava.leetcode75;

import java.util.Arrays;

/**
 * <a
 * href="https://leetcode.com/problems/max-number-of-k-sum-pairs/?envType=study-plan-v2&envId=leetcode-75">1679.
 * Max Number of K-Sum Pairs</a> <br>
 * [erred] Kudos to <a
 * href="https://leetcode.com/problems/max-number-of-k-sum-pairs/solutions/1901186/java-hashmap-solution-best-and-easy-in-few-lines/comments/1376623">vibinjoby</a>
 *
 * @author Camio1945
 */
@SuppressWarnings("AlibabaClassNamingShouldBeCamel")
public class P13MaxNumberOfKSumPairs {
  public int maxOperations(int[] nums, int k) {
    int res = 0;
    Arrays.sort(nums);
    int left = 0;
    int right = nums.length - 1;
    while (left < right) {
      int numLeft = nums[left];
      int numRight = nums[right];
      int sum = numLeft + numRight;
      if (sum == k) {
        res++;
        left++;
        right--;
      } else if (sum < k) {
        left++;
      } else {
        right--;
      }
    }
    return res;
  }
}
