package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P05ReverseVowelsOfAString}
 *
 * @author Camio1945
 */
class P05ReverseVowelsOfAStringTest {
  @Test
  void test() {
    P05ReverseVowelsOfAString solution = new P05ReverseVowelsOfAString();
    assertEquals("holle", solution.reverseVowels("hello"));
    assertEquals("leotcede", solution.reverseVowels("leetcode"));
  }
}
