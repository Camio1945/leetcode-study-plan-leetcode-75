package cn.huava.leetcode75;

import java.util.*;

/**
 * <a
 * href="https://leetcode.com/problems/string-compression/?envType=study-plan-v2&envId=leetcode-75">443.
 * String Compression</a> <br>
 * [improved] Kudos to <a
 * href="https://leetcode.com/problems/string-compression/solutions/3245804/clean-codes-full-explanation-two-pointers-c-java-python3">N7_BLACKHAT</a>
 *
 * @author Camio1945
 */
public class P09StringCompression {
  public int compress(char[] chars) {
    // keep track of current position in compressed array
    int ans = 0;
    final int n = chars.length;
    // iterate through input array using i pointer
    int i = 0;
    while (i < n) {
      // current character being compressed
      final char letter = chars[i];
      // write letter to compressed array
      chars[ans++] = letter;
      // count of consecutive occurrences of letter
      int count = 0;
      // count consecutive occurrences of letter in input array
      while (i < n && chars[i] == letter) {
        count++;
        i++;
      }
      // if count is greater than 1, write count as string to compressed array
      if (count > 1) {
        // convert count to string and iterate over each character in string
        for (final char c : String.valueOf(count).toCharArray()) {
          chars[ans++] = c;
        }
      }
    }
    // return length of compressed array
    return ans;
  }
}
