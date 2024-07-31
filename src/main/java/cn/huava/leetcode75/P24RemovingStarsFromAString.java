package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/removing-stars-from-a-string/?envType=study-plan-v2&envId=leetcode-75">2390.
 * Removing Stars From a String</a> <br>
 *
 * @author Camio1945
 */
@SuppressWarnings("AlibabaClassNamingShouldBeCamel")
public class P24RemovingStarsFromAString {
  public String removeStars(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '*') {
        sb.deleteCharAt(sb.length() - 1);
      } else {
        sb.append(c);
      }
    }
    return sb.toString();
  }
}
