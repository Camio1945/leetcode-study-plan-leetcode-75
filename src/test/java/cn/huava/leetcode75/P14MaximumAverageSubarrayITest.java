package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P14MaximumAverageSubarrayI}
 *
 * @author Camio1945
 */
class P14MaximumAverageSubarrayITest {
  @Test
  void test() {
    P14MaximumAverageSubarrayI solution = new P14MaximumAverageSubarrayI();
    assertEquals(2.5, solution.findMaxAverage(new int[] {1, 3, 1, 4, 2}, 4));
    assertEquals(4, solution.findMaxAverage(new int[] {0, 4, 0, 3, 2}, 1));
    assertEquals(12.75, solution.findMaxAverage(new int[] {1, 12, -5, -6, 50, 3}, 4));
    assertEquals(5.0, solution.findMaxAverage(new int[] {5, 5}, 2));
    assertEquals(5.0, solution.findMaxAverage(new int[] {5}, 1));
    assertEquals(5.0, solution.findMaxAverage(new int[] {5, 5}, 1));
  }
}
