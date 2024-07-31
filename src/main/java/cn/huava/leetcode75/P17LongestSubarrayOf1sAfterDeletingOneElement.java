package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/?envType=study-plan-v2&envId=leetcode-75">1493.
 * Longest Subarray of 1's After Deleting One Element</a> <br>
 *
 * @author Camio1945
 */
public class P17LongestSubarrayOf1sAfterDeletingOneElement {
  public int longestSubarray(int[] nums) {
    int i = 0;
    int j = 0;
    int k = 1;
    int n = nums.length;
    while (j < n) {
      int num = nums[j];
      if (num == 0) {
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
    return j - i - 1;
  }
}
