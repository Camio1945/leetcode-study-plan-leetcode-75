package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P64LongestCommonSubsequence}
 *
 * @author Camio1945
 */
class P64LongestCommonSubsequenceTest {
  @Test
  void test() {
    example1();
    example2();
    example3();
  }

  private static void example1() {
    P64LongestCommonSubsequence solution = new P64LongestCommonSubsequence();
    assertEquals(3, solution.longestCommonSubsequence("abcde", "ace"));
  }

  private static void example2() {
    P64LongestCommonSubsequence solution = new P64LongestCommonSubsequence();
    assertEquals(3, solution.longestCommonSubsequence("abc", "abc"));
  }

  private static void example3() {
    P64LongestCommonSubsequence solution = new P64LongestCommonSubsequence();
    assertEquals(0, solution.longestCommonSubsequence("abc", "def"));
  }
}
