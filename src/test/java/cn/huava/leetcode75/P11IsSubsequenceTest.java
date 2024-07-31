package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P11IsSubsequence}
 *
 * @author Camio1945
 */
class P11IsSubsequenceTest {
  @Test
  void test() {
    P11IsSubsequence solution = new P11IsSubsequence();
    assertTrue(solution.isSubsequence("abc", "ahbgdc"));
    assertFalse(solution.isSubsequence("axc", "ahbgdc"));
    // TODO
  }
}
