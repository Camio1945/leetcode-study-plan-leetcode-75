package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P47NearestExitFromEntranceInMaze}
 *
 * @author Camio1945
 */
class P47NearestExitFromEntranceInMazeTest {
  @Test
  void test() {
    example1();
    example2();
    example3();
    example4();
  }

  private static void example1() {
    P47NearestExitFromEntranceInMaze solution = new P47NearestExitFromEntranceInMaze();
    char[][] maze = {{'+', '+', '.', '+'}, {'.', '.', '.', '+'}, {'+', '+', '+', '.'}};
    int[] entrance = {1, 2};
    assertEquals(1, solution.nearestExit(maze, entrance));
  }

  private static void example2() {
    P47NearestExitFromEntranceInMaze solution = new P47NearestExitFromEntranceInMaze();
    char[][] maze = {{'+', '+', '+'}, {'.', '.', '.'}, {'+', '+', '+'}};
    int[] entrance = {1, 0};
    assertEquals(2, solution.nearestExit(maze, entrance));
  }

  private static void example3() {
    P47NearestExitFromEntranceInMaze solution = new P47NearestExitFromEntranceInMaze();
    char[][] maze = {{'.', '+'}};
    int[] entrance = {0, 0};
    assertEquals(-1, solution.nearestExit(maze, entrance));
  }

  private static void example4() {
    P47NearestExitFromEntranceInMaze solution = new P47NearestExitFromEntranceInMaze();
    char[][] maze = {
      {'+', '.', '+', '+', '+', '+', '+'},
      {'+', '.', '+', '.', '.', '.', '+'},
      {'+', '.', '+', '.', '+', '.', '+'},
      {'+', '.', '.', '.', '+', '.', '+'},
      {'+', '+', '+', '+', '+', '.', '+'}
    };
    int[] entrance = {0, 1};
    assertEquals(12, solution.nearestExit(maze, entrance));
  }
}
