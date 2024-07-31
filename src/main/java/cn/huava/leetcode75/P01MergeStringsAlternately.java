package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&envId=leetcode-75">1768.
 * Merge Strings Alternately</a> <br>
 *
 * @author Camio1945
 */
public class P01MergeStringsAlternately {

  public String mergeAlternately(String word1, String word2) {
    String shortWord = word1.length() < word2.length() ? word1 : word2;
    String longWord = word1.length() >= word2.length() ? word1 : word2;
    StringBuilder res = new StringBuilder();
    for (int i = 0; i < shortWord.length(); i++) {
      res.append(word1.charAt(i)).append(word2.charAt(i));
    }
    for (int i = shortWord.length(); i < longWord.length(); i++) {
      res.append(longWord.charAt(i));
    }
    return res.toString();
  }
}
