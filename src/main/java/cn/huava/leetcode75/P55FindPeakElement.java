package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/find-peak-element/?envType=study-plan-v2&envId=leetcode-75">162.
 * Find Peak Element</a> <br>
 * [improved] Kudos to <a
 * href="https://leetcode.com/problems/find-peak-element/solutions/1290642/intuition-behind-conditions-complete-explanation-diagram-binary-search">Nam_22</a>
 *
 * @author Camio1945
 */
public class P55FindPeakElement {

  public int findPeakElement(int[] nums) {
    int n = nums.length;
    if (n == 1 || nums[0] > nums[1]) {
      return 0;
    }
    if (nums[n - 1] > nums[n - 1 - 1]) {
      return n - 1;
    }
    // search in the remaining array
    int left = 1;
    int right = n - 2;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      int currentVal = nums[mid];
      int leftVal = nums[mid - 1];
      int rightVal = nums[mid + 1];
      if (currentVal > leftVal && currentVal > rightVal) {
        return mid;
      } else if (currentVal < leftVal) {
        right = mid - 1;
      } else if (currentVal < rightVal) {
        left = mid + 1;
      }
    }
    return -1;
  }
}
