package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P60MinCostClimbingStairs}
 *
 * @author Camio1945
 */
class P60MinCostClimbingStairsTest {
  @Test
  void test() {
    example1();
    example2();
  }

  private static void example1() {
    P60MinCostClimbingStairs solution = new P60MinCostClimbingStairs();
    assertEquals(15, solution.minCostClimbingStairs(new int[] {10, 15, 20}));
  }

  private static void example2() {
    P60MinCostClimbingStairs solution = new P60MinCostClimbingStairs();
    assertEquals(6, solution.minCostClimbingStairs(new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
  }
}
