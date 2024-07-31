package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P17LongestSubarrayOf1sAfterDeletingOneElement}
 *
 * @author Camio1945
 */
class P17LongestSubarrayOf1sAfterDeletingOneElementTest {
  @Test
  void test() {
    P17LongestSubarrayOf1sAfterDeletingOneElement solution =
        new P17LongestSubarrayOf1sAfterDeletingOneElement();
    assertEquals(5, solution.longestSubarray(new int[] {0, 1, 1, 1, 0, 1, 1, 0, 1}));
    assertEquals(2, solution.longestSubarray(new int[] {1, 1, 1}));
    assertEquals(3, solution.longestSubarray(new int[] {1, 1, 0, 1}));
  }
}
