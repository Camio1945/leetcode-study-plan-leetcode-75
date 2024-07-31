package cn.huava.leetcode75;

import java.util.*;

/**
 * <a
 * href="https://leetcode.com/problems/equal-row-and-column-pairs/?envType=study-plan-v2&envId=leetcode-75">2352.
 * Equal Row and Column Pairs</a> <br>
 * Note: The solution is right but the performance is bad
 *
 * @author Camio1945
 */
public class P23EqualRowAndColumnPairs {
  public int equalPairs(int[][] grid) {
    int res = 0;
    int n = grid.length;
    Map<String, Integer> rowToCountMap = HashMap.newHashMap(n);
    Map<String, Integer> colToCountMap = HashMap.newHashMap(n);
    for (int i = 0; i < n; i++) {
      String row = getRowAsString(grid, i);
      rowToCountMap.putIfAbsent(row, 0);
      rowToCountMap.put(row, rowToCountMap.get(row) + 1);
      String col = getColAsString(grid, i);
      colToCountMap.putIfAbsent(col, 0);
      colToCountMap.put(col, colToCountMap.get(col) + 1);
    }
    for (Map.Entry<String, Integer> entry : rowToCountMap.entrySet()) {
      String key = entry.getKey();
      if (colToCountMap.containsKey(key)) {
        res += entry.getValue() * colToCountMap.get(key);
      }
    }
    return res;
  }

  private String getRowAsString(int[][] grid, int i) {
    StringBuilder row = new StringBuilder();
    for (int num : grid[i]) {
      row.append(num).append(",");
    }
    return row.toString();
  }

  private String getColAsString(int[][] grid, int i) {
    StringBuilder col = new StringBuilder();
    for (int[] nums : grid) {
      col.append(nums[i]).append(",");
    }
    return col.toString();
  }
}
