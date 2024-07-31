package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/single-number/?envType=study-plan-v2&envId=leetcode-75">136.
 * Single Number</a> <br>
 * [improved] Kudos to <a
 * href="https://leetcode.com/problems/single-number/solutions/3021354/java-easy-solution-beats-100-runtime-1ms-bit-manipulation">vashi16</a>
 *
 * @author Camio1945
 */
public class P68SingleNumber {
  public int singleNumber(int[] nums) {
    int ans = 0;
    for (int num : nums) {
      ans ^= num;
    }
    return ans;
  }
}
