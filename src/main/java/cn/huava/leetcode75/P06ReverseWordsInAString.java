package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/reverse-words-in-a-string/?envType=study-plan-v2&envId=leetcode-75">151.
 * Reverse Words in a String</a> <br>
 *
 * @author Camio1945
 */
@SuppressWarnings("AlibabaClassNamingShouldBeCamel")
public class P06ReverseWordsInAString {
  public String reverseWords(String s) {
    // note that + in " +"
    String[] arr = s.trim().split(" +");
    StringBuilder res = new StringBuilder();
    for (int i = arr.length - 1; i >= 0; i--) {
      res.append(arr[i]).append(" ");
    }
    return res.toString().trim();
  }
}
