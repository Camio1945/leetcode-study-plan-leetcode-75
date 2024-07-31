package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P13MaxNumberOfKSumPairs}
 *
 * @author Camio1945
 */
class P13MaxNumberOfKSumPairsTest {
  @Test
  void test() {
    P13MaxNumberOfKSumPairs solution = new P13MaxNumberOfKSumPairs();
    assertEquals(1, solution.maxOperations(new int[] {3, 1, 3, 4, 3}, 6));
    assertEquals(2, solution.maxOperations(new int[] {1, 2, 3, 4}, 5));
  }
}
