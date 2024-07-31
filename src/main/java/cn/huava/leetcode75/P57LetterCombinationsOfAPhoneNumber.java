package cn.huava.leetcode75;

import java.util.*;

/**
 * <a
 * href='https://leetcode.com/problems/letter-combinations-of-a-phone-number/?envType=study-plan-v2&envId=leetcode-75'>17.
 * Letter Combinations of a Phone Number</a> <br>
 * Kudos to <a
 * href="https://leetcode.com/problems/letter-combinations-of-a-phone-number/?envType=study-plan-v2&envId=leetcode-75">vanAmsen</a>
 * <br>
 * My own solution can beat 44% solutions, but did not use backtrack, <br>
 * and since this problem's knowledge points is about backtrack, I used vanAmsen's solution. <br>
 * and since this problem's knowledge points is about backtrack, I used vanAmsen's solution. <br>
 * the java version of vanAmsen's solution is not that good, can beat around 40%.
 *
 * @author Camio1945
 */
@SuppressWarnings("AlibabaClassNamingShouldBeCamel")
public class P57LetterCombinationsOfAPhoneNumber {
  private static final String[] WORDS = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

  public List<String> letterCombinations(String digits) {
    if (digits == null || digits.isEmpty()) {
      return Collections.emptyList();
    }
    List<String> res = new ArrayList<>();
    backtrack("", digits, res);
    return res;
  }

  private void backtrack(String combination, String remainingDigits, List<String> res) {
    if (remainingDigits.isEmpty()) {
      res.add(combination);
    } else {
      char digit = remainingDigits.charAt(0);
      char[] chars = WORDS[digit - '2'].toCharArray();
      for (char c : chars) {
        backtrack(combination + c, remainingDigits.substring(1), res);
      }
    }
  }
}
