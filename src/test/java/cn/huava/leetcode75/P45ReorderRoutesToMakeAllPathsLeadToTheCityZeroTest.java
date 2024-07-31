package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P45ReorderRoutesToMakeAllPathsLeadToTheCityZero}
 *
 * @author Camio1945
 */
class P45ReorderRoutesToMakeAllPathsLeadToTheCityZeroTest {
  @Test
  void test() {
    example1();
    example2();
    example3();
  }

  private static void example1() {
    P45ReorderRoutesToMakeAllPathsLeadToTheCityZero solution =
        new P45ReorderRoutesToMakeAllPathsLeadToTheCityZero();
    assertEquals(3, solution.minReorder(6, new int[][] {{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}}));
  }

  private static void example2() {
    P45ReorderRoutesToMakeAllPathsLeadToTheCityZero solution =
        new P45ReorderRoutesToMakeAllPathsLeadToTheCityZero();
    assertEquals(2, solution.minReorder(6, new int[][] {{1, 0}, {1, 2}, {3, 2}, {3, 4}}));
  }

  private static void example3() {
    P45ReorderRoutesToMakeAllPathsLeadToTheCityZero solution =
        new P45ReorderRoutesToMakeAllPathsLeadToTheCityZero();
    assertEquals(0, solution.minReorder(6, new int[][] {{1, 0}, {2, 0}}));
  }
}
