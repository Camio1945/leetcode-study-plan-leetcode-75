package cn.huava.leetcode75;

import java.util.*;

/**
 * <a
 * href="https://leetcode.com/problems/daily-temperatures/?envType=study-plan-v2&envId=leetcode-75">739.
 * Daily Temperatures</a> <br>
 * [erred] Kudos to <a
 * href="https://leetcode.com/problems/daily-temperatures/solutions/4651723/easy-stack-friendly-explained">prodonik</a>
 *
 * @author Camio1945
 */
public class P74DailyTemperatures {
  public int[] dailyTemperatures(int[] temperatures) {
    int n = temperatures.length;
    int[] res = new int[n];
    Deque<Integer> stack = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
        res[stack.peek()] = i - stack.pop();
      }
      stack.push(i);
    }
    return res;
  }
}
