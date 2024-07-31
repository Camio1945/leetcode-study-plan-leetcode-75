package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P67CountingBits}
 *
 * @author Camio1945
 */
class P67CountingBitsTest {
  @Test
  void test() {
    example1();
    example2();
  }

  private static void example1() {
    P67CountingBits solution = new P67CountingBits();
    int[] expect = {0, 1, 1};
    assertArrayEquals(expect, solution.countBits(2));
  }

  private static void example2() {
    P67CountingBits solution = new P67CountingBits();
    int[] expect = {0, 1, 1, 2, 1, 2};
    assertArrayEquals(expect, solution.countBits(5));
  }
}
