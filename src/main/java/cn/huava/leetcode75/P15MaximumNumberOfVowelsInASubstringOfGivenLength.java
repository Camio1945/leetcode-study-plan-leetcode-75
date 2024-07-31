package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/?envType=study-plan-v2&envId=leetcode-75">1456.
 * Maximum Number of Vowels in a Substring of Given Length</a> <br>
 *
 * @author Camio1945
 */
@SuppressWarnings("AlibabaClassNamingShouldBeCamel")
public class P15MaximumNumberOfVowelsInASubstringOfGivenLength {
  public int maxVowels(String s, int k) {
    int n = s.length();
    int max = 0;
    for (int i = 0; i < k; i++) {
      char c = s.charAt(i);
      if (isVowel(c)) {
        max++;
      }
    }
    int prevNum = max;
    for (int i = 1; i <= n - k; i++) {
      boolean oldIsVowel = isVowel(s.charAt(i - 1));
      boolean newIsVowel = isVowel(s.charAt(i + k - 1));
      if (!oldIsVowel && newIsVowel) {
        prevNum++;
        max = Math.max(max, prevNum);
      } else if (oldIsVowel && !newIsVowel) {
        prevNum--;
      }
    }
    return max;
  }

  private static boolean isVowel(char c) {
    return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o'
        || c == 'O' || c == 'u' || c == 'U';
  }
}
