package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P16MaxConsecutiveOnesIii}
 *
 * @author Camio1945
 */
class P16MaxConsecutiveOnesIiiTest {
  @Test
  void test() {
    P16MaxConsecutiveOnesIii solution = new P16MaxConsecutiveOnesIii();
    int[] nums1 = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
    assertEquals(6, solution.longestOnes(nums1, 2));
    int[] nums2 = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
    assertEquals(10, solution.longestOnes(nums2, 3));
  }
}
