package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P51MaximumSubsequenceScore}
 *
 * @author Camio1945
 */
class P51MaximumSubsequenceScoreTest {
  @Test
  void test() {
    example1();
    example2();
  }

  private static void example1() {
    P51MaximumSubsequenceScore solution = new P51MaximumSubsequenceScore();
    assertEquals(12, solution.maxScore(new int[] {1, 3, 3, 2}, new int[] {2, 1, 3, 4}, 3));
  }

  private static void example2() {
    P51MaximumSubsequenceScore solution = new P51MaximumSubsequenceScore();
    assertEquals(30, solution.maxScore(new int[] {4, 2, 3, 1, 1}, new int[] {7, 5, 10, 9, 6}, 1));
  }
}
