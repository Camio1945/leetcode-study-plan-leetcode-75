package cn.huava.leetcode75;

/**
 * <a href="https://leetcode.com/problems/move-zeroes/?envType=study-plan-v2&envId=leetcode-75">283.
 * Move Zeroes</a> <br>
 * [improved] Kudos to <a
 * href="https://leetcode.com/problems/move-zeroes/solutions/5246963/video-two-pointer-solution">niits</a>
 *
 * @author Camio1945
 */
public class P10MoveZeroes {
  public void moveZeroes(int[] nums) {
    int left = 0;
    for (int right = 0; right < nums.length; right++) {
      if (nums[right] != 0) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
      }
    }
  }
}
