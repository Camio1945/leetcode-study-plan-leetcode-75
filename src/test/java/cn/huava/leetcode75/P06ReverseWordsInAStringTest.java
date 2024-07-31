package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P06ReverseWordsInAString}
 *
 * @author Camio1945
 */
class P06ReverseWordsInAStringTest {
  @Test
  void test() {
    P06ReverseWordsInAString solution = new P06ReverseWordsInAString();
    assertEquals("example good a", solution.reverseWords("a good   example"));
    assertEquals("blue is sky the", solution.reverseWords("the sky is blue"));
    assertEquals("world hello", solution.reverseWords("  hello world  "));
  }
}
