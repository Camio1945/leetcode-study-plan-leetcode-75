package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P22DetermineIfTwoStringsAreClose}
 *
 * @author Camio1945
 */
class P22DetermineIfTwoStringsAreCloseTest {
  @Test
  void test() {
    P22DetermineIfTwoStringsAreClose solution = new P22DetermineIfTwoStringsAreClose();
    assertTrue(solution.closeStrings("abbzccca", "babzzczc"));
    assertTrue(solution.closeStrings("cabbba", "abbccc"));
    assertFalse(solution.closeStrings("uau", "ssx"));
    assertTrue(solution.closeStrings("abc", "bca"));
    assertFalse(solution.closeStrings("a", "aa"));
  }
}
