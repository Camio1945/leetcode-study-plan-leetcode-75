package cn.huava.leetcode75;

import java.util.Arrays;

/**
 * <a
 * href="https://leetcode.com/problems/kth-largest-element-in-an-array/?envType=study-plan-v2&envId=leetcode-75">215.
 * Kth Largest Element in an Array</a> <br>
 *
 * @author Camio1945
 */
public class P49KthLargestElementInAnArray {
  public int findKthLargest(int[] nums, int k) {
    Arrays.sort(nums);
    for (int i = nums.length - 1; i >= 0; i--) {
      if (--k == 0) {
        return nums[i];
      }
    }
    return 0;
  }
}
