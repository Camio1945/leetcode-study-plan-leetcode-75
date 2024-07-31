package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P74DailyTemperatures}
 *
 * @author Camio1945
 */
class P74DailyTemperaturesTest {
  @Test
  void test() {
    example1();
    example2();
    example3();
  }

  private static void example1() {
    P74DailyTemperatures solution = new P74DailyTemperatures();
    int[] expect = {1, 1, 4, 2, 1, 1, 0, 0};
    int[] res = solution.dailyTemperatures(new int[] {73, 74, 75, 71, 69, 72, 76, 73});
    assertArrayEquals(expect, res);
  }

  private static void example2() {
    P74DailyTemperatures solution = new P74DailyTemperatures();
    int[] expect = {1, 1, 1, 0};
    int[] res = solution.dailyTemperatures(new int[] {30, 40, 50, 60});
    assertArrayEquals(expect, res);
  }

  private static void example3() {
    P74DailyTemperatures solution = new P74DailyTemperatures();
    int[] expect = {1, 1, 0};
    int[] res = solution.dailyTemperatures(new int[] {30, 60, 90});
    assertArrayEquals(expect, res);
  }
}
