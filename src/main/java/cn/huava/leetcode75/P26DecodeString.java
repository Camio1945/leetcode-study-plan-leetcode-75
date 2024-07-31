package cn.huava.leetcode75;

import java.util.*;

/**
 * <a
 * href="https://leetcode.com/problems/decode-string/?envType=study-plan-v2&envId=leetcode-75">394.
 * Decode String</a> <br>
 * [erred] Kudos to <a
 * href="https://leetcode.com/problems/decode-string/solutions/4717135/100-step-by-step-explaination-with-pictures-optimized-stack-approach">Biswajitdas_sibun</a>
 *
 * @author Camio1945
 */
public class P26DecodeString {
  public String decodeString(String s) {
    StringBuilder res = new StringBuilder();
    Deque<Integer> numStack = new LinkedList<>();
    Deque<StringBuilder> strStack = new LinkedList<>();
    int n = 0;
    for (char c : s.toCharArray()) {
      if (Character.isDigit(c)) {
        n = n * 10 + (c - '0');
      } else if (c == '[') {
        numStack.push(n);
        n = 0;
        strStack.push(res);
        res = new StringBuilder();
      } else if (c == ']') {
        int repeatTimes = numStack.pop();
        StringBuilder str = strStack.pop();
        while (repeatTimes-- > 0) {
          str.append(res);
        }
        res = str;
      } else {
        res.append(c);
      }
    }
    return res.toString();
  }
}
