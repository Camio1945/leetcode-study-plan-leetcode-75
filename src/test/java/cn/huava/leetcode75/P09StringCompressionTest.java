package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P09StringCompression}
 *
 * @author Camio1945
 */
class P09StringCompressionTest {
  @Test
  void test() {
    P09StringCompression solution = new P09StringCompression();
    char[] chars = new char[] {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
    assertEquals(6, solution.compress(chars));
    assertEquals('a', chars[0]);
    assertEquals('2', chars[1]);
    assertEquals('b', chars[2]);
    assertEquals('2', chars[3]);
    assertEquals('c', chars[4]);
    assertEquals('3', chars[5]);

    chars = new char[] {'a'};
    assertEquals(1, solution.compress(chars));
    assertEquals('a', chars[0]);

    chars = new char[] {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
    assertEquals(4, solution.compress(chars));
    assertEquals('a', chars[0]);
    assertEquals('b', chars[1]);
    assertEquals('1', chars[2]);
    assertEquals('2', chars[3]);
  }
}
