package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P49KthLargestElementInAnArray}
 *
 * @author Camio1945
 */
class P49KthLargestElementInAnArrayTest {
  @Test
  void test() {
    example1();
    example2();
  }

  private static void example1() {
    P49KthLargestElementInAnArray solution = new P49KthLargestElementInAnArray();
    assertEquals(5, solution.findKthLargest(new int[] {3, 2, 1, 5, 6, 4}, 2));
  }

  private static void example2() {
    P49KthLargestElementInAnArray solution = new P49KthLargestElementInAnArray();
    assertEquals(4, solution.findKthLargest(new int[] {3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
  }
}
