package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P65BestTimeToBuyAndSellStockWithTransactionFee}
 *
 * @author Camio1945
 */
class P65BestTimeToBuyAndSellStockWithTransactionFeeTest {
  @Test
  void test() {
    example1();
    example2();
  }

  private static void example1() {
    P65BestTimeToBuyAndSellStockWithTransactionFee solution =
        new P65BestTimeToBuyAndSellStockWithTransactionFee();
    assertEquals(8, solution.maxProfit(new int[] {1, 3, 2, 8, 4, 9}, 2));
  }

  private static void example2() {
    P65BestTimeToBuyAndSellStockWithTransactionFee solution =
        new P65BestTimeToBuyAndSellStockWithTransactionFee();
    assertEquals(6, solution.maxProfit(new int[] {1, 3, 7, 5, 10, 3}, 3));
  }
}
