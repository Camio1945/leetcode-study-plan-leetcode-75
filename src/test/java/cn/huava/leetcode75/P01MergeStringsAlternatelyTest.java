package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P01MergeStringsAlternately}
 *
 * @author Camio1945
 */
class P01MergeStringsAlternatelyTest {
  @Test
  void test() {
    P01MergeStringsAlternately solution = new P01MergeStringsAlternately();
    assertEquals("apbqcr", solution.mergeAlternately("abc", "pqr"));
    assertEquals("apbqrs", solution.mergeAlternately("ab", "pqrs"));
    assertEquals("apbqcd", solution.mergeAlternately("abcd", "pq"));
  }
}
