package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P02GreatestCommonDivisorOfStrings}
 *
 * @author Camio1945
 */
class P02GreatestCommonDivisorOfStringsTest {
  @Test
  void test() {
    P02GreatestCommonDivisorOfStrings solution = new P02GreatestCommonDivisorOfStrings();
    assertEquals("ABC", solution.gcdOfStrings("ABCABC", "ABC"));
    assertEquals("AB", solution.gcdOfStrings("ABABAB", "ABAB"));
    assertEquals("", solution.gcdOfStrings("LEET", "CODE"));
    assertEquals(
        "TAUXX",
        solution.gcdOfStrings(
            "TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
  }
}
