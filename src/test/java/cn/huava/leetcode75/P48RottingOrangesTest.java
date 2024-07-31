package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P48RottingOranges}
 *
 * @author Camio1945
 */
class P48RottingOrangesTest {
  @Test
  void test() {
    example1();
    example2();
    example3();
    example4();
    example5();
    example6();
    example7();
    example8();
  }

  private static void example1() {
    P48RottingOranges solution = new P48RottingOranges();
    assertEquals(4, solution.orangesRotting(new int[][] {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}));
  }

  private static void example2() {
    P48RottingOranges solution = new P48RottingOranges();
    assertEquals(-1, solution.orangesRotting(new int[][] {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}}));
  }

  private static void example3() {
    P48RottingOranges solution = new P48RottingOranges();
    assertEquals(0, solution.orangesRotting(new int[][] {{0, 2}}));
  }

  private static void example4() {
    P48RottingOranges solution = new P48RottingOranges();
    assertEquals(0, solution.orangesRotting(new int[][] {{0}}));
  }

  private static void example5() {
    P48RottingOranges solution = new P48RottingOranges();
    assertEquals(-1, solution.orangesRotting(new int[][] {{1}}));
  }

  private static void example6() {
    P48RottingOranges solution = new P48RottingOranges();
    assertEquals(0, solution.orangesRotting(new int[][] {{2}}));
  }

  private static void example7() {
    P48RottingOranges solution = new P48RottingOranges();
    assertEquals(-1, solution.orangesRotting(new int[][] {{0, 1}}));
  }

  private static void example8() {
    P48RottingOranges solution = new P48RottingOranges();
    assertEquals(0, solution.orangesRotting(new int[][] {{0, 0, 0, 0}}));
  }
}
