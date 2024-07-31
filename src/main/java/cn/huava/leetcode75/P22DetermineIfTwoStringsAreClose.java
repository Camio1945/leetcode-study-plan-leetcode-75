package cn.huava.leetcode75;

import java.util.*;

/**
 * <a
 * href="https://leetcode.com/problems/determine-if-two-strings-are-close/?envType=study-plan-v2&envId=leetcode-75">1657.
 * Determine if Two Strings Are Close</a> <br>
 * [erred] Kudos to <a
 * href="https://leetcode.com/problems/determine-if-two-strings-are-close/solutions/4561223/beats-99-46-users-c-java-python-javascript-explained">MarkSPhilip31</a>
 *
 * @author Camio1945
 */
public class P22DetermineIfTwoStringsAreClose {
  public boolean closeStrings(String word1, String word2) {
    if (word1.length() != word2.length()) {
      return false;
    }
    int n = 26;
    int[] freq1 = new int[n];
    int[] freq2 = new int[n];
    for (int i = 0; i < word1.length(); i++) {
      freq1[word1.charAt(i) - 'a']++;
      freq2[word2.charAt(i) - 'a']++;
    }
    for (int i = 0; i < n; i++) {
      boolean in1Not2 = freq1[i] > 0 && freq2[i] == 0;
      boolean in2Not1 = freq2[i] > 0 && freq1[i] == 0;
      if (in1Not2 || in2Not1) {
        return false;
      }
    }
    Arrays.sort(freq1);
    Arrays.sort(freq2);
    for (int i = 0; i < n; i++) {
      if (freq1[i] != freq2[i]) {
        return false;
      }
    }
    return true;
  }
}
