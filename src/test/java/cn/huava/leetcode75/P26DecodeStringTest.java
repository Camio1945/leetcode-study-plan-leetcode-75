package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P26DecodeString}
 *
 * @author Camio1945
 */
class P26DecodeStringTest {
  @Test
  void test() {
    P26DecodeString solution = new P26DecodeString();
    assertEquals(
        "zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef",
        solution.decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef"));
    assertEquals("abcabccdcdcdef", solution.decodeString("2[abc]3[cd]ef"));
    assertEquals("accaccacc", solution.decodeString("3[a2[c]]"));
    assertEquals("aaabcbc", solution.decodeString("3[a]2[bc]"));
  }
}
