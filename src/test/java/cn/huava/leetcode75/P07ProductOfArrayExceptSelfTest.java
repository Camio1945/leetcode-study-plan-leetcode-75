package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P07ProductOfArrayExceptSelf}
 *
 * @author Camio1945
 */
class P07ProductOfArrayExceptSelfTest {
  @Test
  void test() {
    P07ProductOfArrayExceptSelf solution = new P07ProductOfArrayExceptSelf();
    assertArrayEquals(
        new int[] {60, 40, 30, 24}, solution.productExceptSelf(new int[] {2, 3, 4, 5}));
    assertArrayEquals(new int[] {24, 12, 8, 6}, solution.productExceptSelf(new int[] {1, 2, 3, 4}));
    assertArrayEquals(
        new int[] {0, 0, 9, 0, 0}, solution.productExceptSelf(new int[] {-1, 1, 0, -3, 3}));
  }
}
