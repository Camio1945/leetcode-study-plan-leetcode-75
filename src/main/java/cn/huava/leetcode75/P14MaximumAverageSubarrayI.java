package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/maximum-average-subarray-i/?envType=study-plan-v2&envId=leetcode-75">643.
 * Maximum Average Subarray I</a> <br>
 * [improved] Kudos to <a
 * href="https://leetcode.com/problems/maximum-average-subarray-i/solutions/3799916/java-100-faster-solution-sliding-window">Jugantar2020</a>
 *
 * @author Camio1945
 */
public class P14MaximumAverageSubarrayI {
  public double findMaxAverage(int[] nums, int k) {
    int n = nums.length;
    int sum = 0;
    for (int i = 0; i < k; i++) {
      sum += nums[i];
    }
    int maxSum = sum;
    for (int i = 1; i <= n - k; i++) {
      sum = sum + nums[i + k - 1] - nums[i - 1];
      maxSum = Math.max(maxSum, sum);
    }
    return (double) maxSum / k;
  }
}
