package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P12ContainerWithMostWater}
 *
 * @author Camio1945
 */
class P12ContainerWithMostWaterTest {
  @Test
  void test() {
    P12ContainerWithMostWater solution = new P12ContainerWithMostWater();
    assertEquals(2, solution.maxArea(new int[] {1, 2, 1}));
    assertEquals(49, solution.maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}));
    assertEquals(1, solution.maxArea(new int[] {1, 1}));
    assertEquals(0, solution.maxArea(new int[] {0, 2}));
  }
}
