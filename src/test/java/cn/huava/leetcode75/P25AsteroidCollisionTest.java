package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P25AsteroidCollision}
 *
 * @author Camio1945
 */
class P25AsteroidCollisionTest {
  @Test
  void test() {
    P25AsteroidCollision solution = new P25AsteroidCollision();
    assertArrayEquals(new int[] {-2}, solution.asteroidCollision(new int[] {-2, 2, -1, -2}));
    assertArrayEquals(
        new int[] {-2, -2, -2}, solution.asteroidCollision(new int[] {-2, -2, 1, -2}));
    assertArrayEquals(new int[] {5, 10}, solution.asteroidCollision(new int[] {5, 10, -5}));
    assertArrayEquals(new int[] {}, solution.asteroidCollision(new int[] {8, -8}));
    assertArrayEquals(new int[] {10}, solution.asteroidCollision(new int[] {10, 2, -5}));
  }
}
