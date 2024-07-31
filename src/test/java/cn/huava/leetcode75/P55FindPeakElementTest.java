package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P55FindPeakElement}
 *
 * @author Camio1945
 */
class P55FindPeakElementTest {
  @Test
  void test() {
    example1();
    example2();
  }

  private static void example1() {
    P55FindPeakElement solution = new P55FindPeakElement();
    assertEquals(2, solution.findPeakElement(new int[] {1, 2, 3, 1}));
  }

  private static void example2() {
    P55FindPeakElement solution = new P55FindPeakElement();
    int[] nums = {1, 2, 1, 3, 5, 6, 4};
    int res = solution.findPeakElement(nums);
    assertTrue(res == 1 || res == 5);
  }
}
