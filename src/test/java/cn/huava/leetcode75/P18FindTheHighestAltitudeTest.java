package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P18FindTheHighestAltitude}
 *
 * @author Camio1945
 */
class P18FindTheHighestAltitudeTest {
  @Test
  void test() {
    P18FindTheHighestAltitude solution = new P18FindTheHighestAltitude();
    assertEquals(1, solution.largestAltitude(new int[] {-5, 1, 5, 0, -7}));
    assertEquals(0, solution.largestAltitude(new int[] {-4, -3, -2, -1, 4, 3, 2}));
  }
}
