package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=leetcode-75">392.
 * Is Subsequence</a> <br>
 *
 * @author Camio1945
 */
public class P11IsSubsequence {
  public boolean isSubsequence(String s, String t) {
    char[] sArr = s.toCharArray();
    char[] tArr = t.toCharArray();
    int start = 0;
    for (char c : sArr) {
      boolean found = false;
      for (int i = start; i < tArr.length; i++) {
        if (tArr[i] == c) {
          start = i + 1;
          found = true;
          break;
        }
      }
      if (!found) {
        return false;
      }
    }
    return true;
  }
}
