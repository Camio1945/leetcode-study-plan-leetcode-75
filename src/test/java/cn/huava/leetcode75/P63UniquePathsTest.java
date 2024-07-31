package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P63UniquePaths}
 *
 * @author Camio1945
 */
class P63UniquePathsTest {
  @Test
  void test() {
    example1();
    example2();
    example3();
    example4();
  }

  private static void example1() {
    P63UniquePaths solution = new P63UniquePaths();
    assertEquals(28, solution.uniquePaths(3, 7));
  }

  private static void example2() {
    P63UniquePaths solution = new P63UniquePaths();
    assertEquals(3, solution.uniquePaths(3, 2));
  }

  private static void example3() {
    P63UniquePaths solution = new P63UniquePaths();
    assertEquals(1, solution.uniquePaths(1, 10));
  }

  private static void example4() {
    P63UniquePaths solution = new P63UniquePaths();
    assertEquals(1, solution.uniquePaths(1, 1));
  }
}
