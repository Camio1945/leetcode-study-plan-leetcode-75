package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P23EqualRowAndColumnPairs}
 *
 * @author Camio1945
 */
class P23EqualRowAndColumnPairsTest {
  @Test
  void test() {
    P23EqualRowAndColumnPairs solution = new P23EqualRowAndColumnPairs();
    assertEquals(
        3,
        solution.equalPairs(new int[][] {{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}}));
    assertEquals(1, solution.equalPairs(new int[][] {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}}));
  }
}
