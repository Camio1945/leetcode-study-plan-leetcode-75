package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P21UniqueNumberOfOccurrences}
 *
 * @author Camio1945
 */
class P21UniqueNumberOfOccurrencesTest {
  @Test
  void test() {
    P21UniqueNumberOfOccurrences solution = new P21UniqueNumberOfOccurrences();
    assertTrue(solution.uniqueOccurrences(new int[] {1, 2, 2, 1, 1, 3}));
    assertFalse(solution.uniqueOccurrences(new int[] {1, 2}));
  }
}
