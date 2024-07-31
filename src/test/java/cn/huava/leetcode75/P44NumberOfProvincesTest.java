package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P44NumberOfProvinces}
 *
 * @author Camio1945
 */
class P44NumberOfProvincesTest {
  @Test
  void test() {
    example1();
    example2();
    example3();
  }

  private static void example1() {
    P44NumberOfProvinces solution = new P44NumberOfProvinces();
    int[][] isConnected = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
    assertEquals(2, solution.findCircleNum(isConnected));
  }

  private static void example2() {
    P44NumberOfProvinces solution = new P44NumberOfProvinces();
    int[][] isConnected = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
    assertEquals(3, solution.findCircleNum(isConnected));
  }

  private static void example3() {
    P44NumberOfProvinces solution = new P44NumberOfProvinces();
    int[][] isConnected = {{1, 0, 0, 1}, {0, 1, 1, 0}, {0, 1, 1, 1}, {1, 0, 1, 1}};
    assertEquals(1, solution.findCircleNum(isConnected));
  }
}
