package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P59NThTribonacciNumber}
 *
 * @author Camio1945
 */
class P59NThTribonacciNumberTest {
  @Test
  void test() {
    example1();
    example2();
    example3();
    example4();
    example5();
  }

  private static void example1() {
    P59NThTribonacciNumber solution = new P59NThTribonacciNumber();
    assertEquals(4, solution.tribonacci(4));
  }

  private static void example2() {
    P59NThTribonacciNumber solution = new P59NThTribonacciNumber();
    assertEquals(1389537, solution.tribonacci(25));
  }

  private static void example3() {
    P59NThTribonacciNumber solution = new P59NThTribonacciNumber();
    assertEquals(0, solution.tribonacci(0));
  }

  private static void example4() {
    P59NThTribonacciNumber solution = new P59NThTribonacciNumber();
    assertEquals(1, solution.tribonacci(1));
  }

  private static void example5() {
    P59NThTribonacciNumber solution = new P59NThTribonacciNumber();
    assertEquals(1, solution.tribonacci(2));
  }
}
