package cn.huava.leetcode75;

import java.util.*;

/**
 * <a
 * href="https://leetcode.com/problems/nearest-exit-from-entrance-in-maze/?envType=study-plan-v2&envId=leetcode-75">1926.
 * Nearest Exit from Entrance in Maze</a> <br>
 * [improved] Kudos to <a
 * href="https://leetcode.com/problems/nearest-exit-from-entrance-in-maze/solutions/2834640/java-explained-in-detail-simple-fast-solution-bfs">cheehwatang</a>
 *
 * @author Camio1945
 */
public class P47NearestExitFromEntranceInMaze {
  /** up, down, left, right */
  private static final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

  public int nearestExit(char[][] maze, int[] entrance) {
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(entrance);
    maze[entrance[0]][entrance[1]] = '+';
    int steps = 0;
    while (!queue.isEmpty()) {
      steps++;
      int n = queue.size();
      for (int i = 0; i < n; i++) {
        int[] current = queue.poll();
        if (findExit(maze, current, queue)) {
          return steps;
        }
      }
    }
    return -1;
  }

  private static boolean findExit(char[][] maze, int[] current, Queue<int[]> queue) {
    for (int[] direction : DIRECTIONS) {
      assert current != null;
      int x = current[0] + direction[0];
      int y = current[1] + direction[1];
      if (x < 0 || x >= maze.length || y < 0 || y >= maze[0].length || maze[x][y] == '+') {
        continue;
      }
      if (x == 0 || x == maze.length - 1 || y == 0 || y == maze[0].length - 1) {
        return true;
      }
      maze[x][y] = '+';
      queue.offer(new int[] {x, y});
    }
    return false;
  }
}
