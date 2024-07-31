package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P75OnlineStockSpan}
 *
 * @author Camio1945
 */
class P75OnlineStockSpanTest {
  @Test
  void test() {
    P75OnlineStockSpan.StockSpanner stockSpanner = new P75OnlineStockSpan.StockSpanner();
    assertEquals(1, stockSpanner.next(100));
    assertEquals(1, stockSpanner.next(80));
    assertEquals(1, stockSpanner.next(60));
    assertEquals(2, stockSpanner.next(70));
    assertEquals(1, stockSpanner.next(60));
    // return 4, because the last 4 prices (including today's price of 75) were less than or equal
    // to today's price.
    assertEquals(4, stockSpanner.next(75));
    assertEquals(6, stockSpanner.next(85));
  }
}
