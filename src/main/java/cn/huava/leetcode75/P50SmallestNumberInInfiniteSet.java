package cn.huava.leetcode75;

import java.util.*;

/**
 * <a
 * href="https://leetcode.com/problems/smallest-number-in-infinite-set/?envType=study-plan-v2&envId=leetcode-75">2336.
 * Smallest Number in Infinite Set</a> <br>
 * [improved] Kudos to <a
 * href="https://leetcode.com/problems/smallest-number-in-infinite-set/solutions/3452136/image-explanation-fastest-easiest-with-dry-run-c-java-python">aryan_0077</a>
 *
 * @author Camio1945
 */
public class P50SmallestNumberInInfiniteSet {
  private P50SmallestNumberInInfiniteSet() {}

  static class SmallestInfiniteSet {

    /** Store the values which added back and smaller than current */
    private final Set<Integer> smallerValuesAddedBack = new HashSet<>();

    /**
     * imagine current is the current value of the infinite set, <br>
     * the values before current have all been popped out
     */
    private int current = 1;

    public SmallestInfiniteSet() {
      // empty block
    }

    public int popSmallest() {
      if (smallerValuesAddedBack.isEmpty()) {
        current++;
        return current - 1;
      } else {
        Integer min = Collections.min(smallerValuesAddedBack);
        smallerValuesAddedBack.remove(min);
        return min;
      }
    }

    public void addBack(int num) {
      if (num < current) {
        smallerValuesAddedBack.add(num);
      }
    }
  }
}
