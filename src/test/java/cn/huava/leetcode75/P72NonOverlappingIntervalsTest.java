package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P72NonOverlappingIntervals}
 *
 * @author Camio1945
 */
class P72NonOverlappingIntervalsTest {
  @Test
  void test() {
    example1();
    example2();
    example3();
    example4();
  }

  private static void example1() {
    P72NonOverlappingIntervals solution = new P72NonOverlappingIntervals();
    assertEquals(1, solution.eraseOverlapIntervals(new int[][] {{1, 2}, {2, 3}, {3, 4}, {1, 3}}));
  }

  private static void example2() {
    P72NonOverlappingIntervals solution = new P72NonOverlappingIntervals();
    assertEquals(2, solution.eraseOverlapIntervals(new int[][] {{1, 2}, {1, 2}, {1, 2}}));
  }

  private static void example3() {
    P72NonOverlappingIntervals solution = new P72NonOverlappingIntervals();
    assertEquals(0, solution.eraseOverlapIntervals(new int[][] {{1, 2}, {2, 3}}));
  }

  private static void example4() {
    P72NonOverlappingIntervals solution = new P72NonOverlappingIntervals();
    assertEquals(
        2, solution.eraseOverlapIntervals(new int[][] {{1, 100}, {11, 22}, {1, 11}, {2, 12}}));
  }
}
