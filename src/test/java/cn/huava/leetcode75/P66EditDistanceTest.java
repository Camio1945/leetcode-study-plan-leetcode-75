package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P66EditDistance}
 *
 * @author Camio1945
 */
class P66EditDistanceTest {
  @Test
  void test() {
    example1();
    example2();
    example3();
    example4();
  }

  private static void example1() {
    P66EditDistance solution = new P66EditDistance();
    assertEquals(3, solution.minDistance("horse", "ros"));
  }

  private static void example2() {
    P66EditDistance solution = new P66EditDistance();
    assertEquals(5, solution.minDistance("intention", "execution"));
  }

  private static void example3() {
    P66EditDistance solution = new P66EditDistance();
    assertEquals(1, solution.minDistance("", "a"));
  }

  private static void example4() {
    P66EditDistance solution = new P66EditDistance();
    assertEquals(9, solution.minDistance("distance", "springbok"));
  }
}
