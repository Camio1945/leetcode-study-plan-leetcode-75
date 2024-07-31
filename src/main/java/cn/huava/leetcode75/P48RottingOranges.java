package cn.huava.leetcode75;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <a
 * href="https://leetcode.com/problems/rotting-oranges/?envType=study-plan-v2&envId=leetcode-75">994.
 * Rotting Oranges</a> <br>
 *
 * @author Camio1945
 */
public class P48RottingOranges {

  /** up, down, left, right */
  private static final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

  private static final int NO_ORANGE = 0;
  private static final int FRESH = 1;
  private static final int ROTTEN = 2;
  private int freshCount = 0;

  public int orangesRotting(int[][] grid) {
    Queue<int[]> q = new LinkedList<>();
    int m = grid.length;
    int n = grid[0].length;
    if (m == 1 && n == 1) {
      return grid[0][0] == FRESH ? -1 : 0;
    }
    initQueueAndFreshCount(grid, q, m, n);
    if (q.isEmpty()) {
      return freshCount > 0 ? -1 : 0;
    }
    int res = bfs(grid, q, m, n);
    return freshCount > 0 ? -1 : res;
  }

  private void initQueueAndFreshCount(int[][] grid, Queue<int[]> q, int m, int n) {
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == ROTTEN) {
          q.add(new int[] {i, j});
        } else if (grid[i][j] == FRESH) {
          freshCount++;
        }
      }
    }
  }

  private int bfs(int[][] grid, Queue<int[]> q, int m, int n) {
    int res = -1;
    while (!q.isEmpty()) {
      int size = q.size();
      for (int i = 0; i < size; i++) {
        int[] current = q.poll();
        for (int[] direction : DIRECTIONS) {
          assert current != null;
          int x = current[0] + direction[0];
          int y = current[1] + direction[1];
          if (x < 0
              || x >= m
              || y < 0
              || y >= n
              || grid[x][y] == NO_ORANGE
              || grid[x][y] == ROTTEN) {
            continue;
          }
          grid[x][y] = ROTTEN;
          q.add(new int[] {x, y});
          freshCount--;
        }
      }
      res++;
    }
    return res;
  }
}
