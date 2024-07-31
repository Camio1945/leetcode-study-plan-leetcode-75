package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P19FindPivotIndex}
 *
 * @author Camio1945
 */
class P19FindPivotIndexTest {
  @Test
  void test() {
    P19FindPivotIndex solution = new P19FindPivotIndex();
    assertEquals(-1, solution.pivotIndex(new int[] {1, 2, 3}));
    assertEquals(3, solution.pivotIndex(new int[] {1, 7, 3, 6, 5, 6}));
  }
}
