package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P24RemovingStarsFromAString}
 *
 * @author Camio1945
 */
class P24RemovingStarsFromAStringTest {
  @Test
  void test() {
    P24RemovingStarsFromAString solution = new P24RemovingStarsFromAString();
    assertEquals("lecoe", solution.removeStars("leet**cod*e"));
    assertEquals("", solution.removeStars("erase*****"));
  }
}
