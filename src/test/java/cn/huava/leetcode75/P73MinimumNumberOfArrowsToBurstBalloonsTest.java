package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P73MinimumNumberOfArrowsToBurstBalloons}
 *
 * @author Camio1945
 */
class P73MinimumNumberOfArrowsToBurstBalloonsTest {
  @Test
  void test() {
    example1();
    example2();
    example3();
    example4();
  }

  private static void example1() {
    P73MinimumNumberOfArrowsToBurstBalloons solution =
        new P73MinimumNumberOfArrowsToBurstBalloons();
    int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
    assertEquals(2, solution.findMinArrowShots(points));
  }

  private static void example2() {
    P73MinimumNumberOfArrowsToBurstBalloons solution =
        new P73MinimumNumberOfArrowsToBurstBalloons();
    int[][] points = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
    assertEquals(4, solution.findMinArrowShots(points));
  }

  private static void example3() {
    P73MinimumNumberOfArrowsToBurstBalloons solution =
        new P73MinimumNumberOfArrowsToBurstBalloons();
    int[][] points = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
    assertEquals(2, solution.findMinArrowShots(points));
  }

  private static void example4() {
    P73MinimumNumberOfArrowsToBurstBalloons solution =
        new P73MinimumNumberOfArrowsToBurstBalloons();
    int[][] points = {{-2147483646, -2147483645}, {2147483646, 2147483647}};
    assertEquals(2, solution.findMinArrowShots(points));
  }
}
