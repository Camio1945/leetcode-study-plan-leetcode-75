package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P27NumberOfRecentCalls}
 *
 * @author Camio1945
 */
class P27NumberOfRecentCallsTest {
  @Test
  void test() {
    P27NumberOfRecentCalls.RecentCounter solution = new P27NumberOfRecentCalls.RecentCounter();
    assertEquals(1, solution.ping(1));
    assertEquals(2, solution.ping(100));
    assertEquals(3, solution.ping(3001));
    assertEquals(3, solution.ping(3002));
  }
}
