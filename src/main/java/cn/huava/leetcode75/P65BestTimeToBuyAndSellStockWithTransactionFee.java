package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/?envType=study-plan-v2&envId=leetcode-75">714.
 * Best Time to Buy and Sell Stock with Transaction Fee</a> <br>
 * [erred] Kudos to <a
 * href="https://www.bilibili.com/video/BV1z44y1Z7UR/?spm_id_from=333.337.search-card.all.click">代码随想录</a>
 * <br>
 * The performance is not that great, beat around 40%.
 *
 * @author Camio1945
 */
public class P65BestTimeToBuyAndSellStockWithTransactionFee {
  public int maxProfit(int[] prices, int fee) {
    int n = prices.length;
    // dp[i][0] max profit when holding the stock in the i-th day
    // dp[i][1] max profit when not holding the stock in the i-th day
    int[][] dp = new int[n][2];
    dp[0][0] = -prices[0];
    dp[0][1] = 0;
    for (int i = 1; i < n; i++) {
      dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] - prices[i]);
      dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + prices[i] - fee);
    }
    return dp[n - 1][1];
  }

  public int maxProfitBackup(int[] prices, int fee) {
    int n = prices.length;
    int buyStockPrice = prices[0];
    int sellStockPrice = 0;
    for (int i = 1; i < n; i++) {
      int nextBuyStockPrice = Math.min(buyStockPrice, prices[i] - sellStockPrice);
      int nextSellStockPrice = Math.max(sellStockPrice, prices[i] - buyStockPrice - fee);
      buyStockPrice = nextBuyStockPrice;
      sellStockPrice = nextSellStockPrice;
    }
    return sellStockPrice;
  }
}
