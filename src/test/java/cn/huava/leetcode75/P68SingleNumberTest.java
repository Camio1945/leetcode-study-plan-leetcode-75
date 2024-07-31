package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P68SingleNumber}
 *
 * @author Camio1945
 */
class P68SingleNumberTest {
  @Test
  void test() {
    example1();
    example2();
    example3();
    example4();
  }

  private static void example1() {
    P68SingleNumber solution = new P68SingleNumber();
    assertEquals(1, solution.singleNumber(new int[] {2, 2, 1}));
  }

  private static void example2() {
    P68SingleNumber solution = new P68SingleNumber();
    assertEquals(4, solution.singleNumber(new int[] {4, 1, 2, 1, 2}));
  }

  private static void example3() {
    P68SingleNumber solution = new P68SingleNumber();
    assertEquals(1, solution.singleNumber(new int[] {1}));
  }

  private static void example4() {
    P68SingleNumber solution = new P68SingleNumber();
    assertEquals(4, solution.singleNumber(new int[] {4, 1, 2, 3, 1, 2, 3}));
  }
}
