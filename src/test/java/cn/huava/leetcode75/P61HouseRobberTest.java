package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P61HouseRobber}
 *
 * @author Camio1945
 */
class P61HouseRobberTest {
  @Test
  void test() {
    example1();
    example2();
    example3();
    example4();
    example5();
  }

  private static void example1() {
    P61HouseRobber solution = new P61HouseRobber();
    assertEquals(4, solution.rob(new int[] {1, 2, 3, 1}));
  }

  private static void example2() {
    P61HouseRobber solution = new P61HouseRobber();
    assertEquals(12, solution.rob(new int[] {2, 7, 9, 3, 1}));
  }

  private static void example3() {
    P61HouseRobber solution = new P61HouseRobber();
    assertEquals(0, solution.rob(new int[] {0}));
  }

  private static void example4() {
    P61HouseRobber solution = new P61HouseRobber();
    assertEquals(2, solution.rob(new int[] {2, 1}));
  }

  private static void example5() {
    P61HouseRobber solution = new P61HouseRobber();
    assertEquals(4, solution.rob(new int[] {2, 1, 1, 2}));
  }
}
