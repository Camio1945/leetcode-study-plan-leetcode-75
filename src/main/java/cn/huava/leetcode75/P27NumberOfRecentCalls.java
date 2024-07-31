package cn.huava.leetcode75;

import java.util.Deque;
import java.util.LinkedList;

/**
 * <a
 * href="https://leetcode.com/problems/number-of-recent-calls/?envType=study-plan-v2&envId=leetcode-75">933.
 * Number of Recent Calls</a> <br>
 *
 * @author Camio1945
 */
public class P27NumberOfRecentCalls {
  private P27NumberOfRecentCalls() {}

  public static class RecentCounter {

    private static final int GAP_IN_MILLIS = 3000;

    Deque<Integer> deque;

    public RecentCounter() {
      deque = new LinkedList<>();
    }

    public int ping(int t) {
      deque.push(t);
      //noinspection DataFlowIssue
      while (deque.peekLast() < (t - GAP_IN_MILLIS)) {
        deque.removeLast();
      }
      return deque.size();
    }
  }
}
