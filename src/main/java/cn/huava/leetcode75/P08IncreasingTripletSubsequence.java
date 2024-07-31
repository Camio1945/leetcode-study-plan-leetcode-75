package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/increasing-triplet-subsequence/?envType=study-plan-v2&envId=leetcode-75">334.
 * Increasing Triplet Subsequence</a> <br>
 * [improved] Kudos to <a
 * href="https://leetcode.com/problems/increasing-triplet-subsequence/solutions/2688492/java-short-solution-easy-approach-100-faster">Jugantar2020</a>
 *
 * @author Camio1945
 */
public class P08IncreasingTripletSubsequence {
  public boolean increasingTriplet(int[] nums) {
    int firstGate = Integer.MAX_VALUE;
    int secondGate = Integer.MAX_VALUE;
    for (int num : nums) {
      if (num <= firstGate) {
        firstGate = num;
      } else if (num <= secondGate) {
        secondGate = num;
      } else {
        return true;
      }
    }
    return false;
  }
}
