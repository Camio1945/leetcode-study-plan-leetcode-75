package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P04CanPlaceFlowers}
 *
 * @author Camio1945
 */
class P04CanPlaceFlowersTest {
  @Test
  void test() {
    P04CanPlaceFlowers solution = new P04CanPlaceFlowers();
    assertFalse(solution.canPlaceFlowers(new int[] {0, 1, 0}, 1));
    assertTrue(solution.canPlaceFlowers(new int[] {1, 0, 0, 0, 1}, 1));
    assertFalse(solution.canPlaceFlowers(new int[] {1, 0, 0, 0, 1}, 2));
  }
}
