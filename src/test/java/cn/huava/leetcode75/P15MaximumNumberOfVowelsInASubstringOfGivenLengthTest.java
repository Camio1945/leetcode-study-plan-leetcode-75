package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P15MaximumNumberOfVowelsInASubstringOfGivenLength}
 *
 * @author Camio1945
 */
class P15MaximumNumberOfVowelsInASubstringOfGivenLengthTest {
  @Test
  void test() {
    P15MaximumNumberOfVowelsInASubstringOfGivenLength solution =
        new P15MaximumNumberOfVowelsInASubstringOfGivenLength();
    assertEquals(3, solution.maxVowels("abciiidef", 3));
    assertEquals(2, solution.maxVowels("aeiou", 2));
    assertEquals(2, solution.maxVowels("leetcode", 3));
  }
}
