package cn.huava.leetcode75;

import java.util.*;

/**
 * <a
 * href="https://leetcode.com/problems/online-stock-span/?envType=study-plan-v2&envId=leetcode-75">901.
 * Online Stock Span</a> <br>
 * [improved] Kudos to <a
 * href="https://leetcode.com/problems/online-stock-span/solutions/640358/java-solution-with-visualization-and-easy-explained">
 * el-seoudy</a>
 *
 * @author Camio1945
 */
public class P75OnlineStockSpan {
  private P75OnlineStockSpan() {}

  public static class StockSpanner {
    Deque<int[]> stack = new LinkedList<>();

    public int next(int price) {
      int span = 1;
      while (!stack.isEmpty() && price >= stack.peek()[0]) {
        span += stack.peek()[1];
        stack.pop();
      }
      stack.push(new int[] {price, span});
      return span;
    }
  }
}
