package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P57LetterCombinationsOfAPhoneNumber}
 *
 * @author Camio1945
 */
class P57LetterCombinationsOfAPhoneNumberTest {
  @Test
  void test() {
    example1();
    example2();
    example3();
  }

  private static void example1() {
    P57LetterCombinationsOfAPhoneNumber solution = new P57LetterCombinationsOfAPhoneNumber();
    List<String> list = solution.letterCombinations("23");
    String[] expects = {"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"};
    for (String expect : expects) {
      assertTrue(list.contains(expect));
    }
  }

  private static void example2() {
    P57LetterCombinationsOfAPhoneNumber solution = new P57LetterCombinationsOfAPhoneNumber();
    List<String> list = solution.letterCombinations("");
    assertTrue(list == null || list.isEmpty());
  }

  private static void example3() {
    P57LetterCombinationsOfAPhoneNumber solution = new P57LetterCombinationsOfAPhoneNumber();
    List<String> list = solution.letterCombinations("2");
    String[] expects = {"a", "b", "c"};
    for (String expect : expects) {
      assertTrue(list.contains(expect));
    }
  }
}
