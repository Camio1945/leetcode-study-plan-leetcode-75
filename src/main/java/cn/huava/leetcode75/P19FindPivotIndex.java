package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/find-pivot-index/?envType=study-plan-v2&envId=leetcode-75">724.
 * Find Pivot Index</a> <br>
 *
 * @author Camio1945
 */
public class P19FindPivotIndex {
  public int pivotIndex(int[] nums) {
    int leftSum = 0;
    int rightSum = 0;
    int n = nums.length;
    for (int num : nums) {
      rightSum += num;
    }
    for (int i = 0; i < n; i++) {
      leftSum += (i == 0) ? 0 : nums[i - 1];
      rightSum -= nums[i];
      if (leftSum == rightSum) {
        return i;
      }
    }
    return -1;
  }
}
