package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P08IncreasingTripletSubsequence}
 *
 * @author Camio1945
 */
class P08IncreasingTripletSubsequenceTest {
  @Test
  void test() {
    P08IncreasingTripletSubsequence solution = new P08IncreasingTripletSubsequence();
    assertTrue(solution.increasingTriplet(new int[] {20, 100, 10, 12, 5, 13}));
    assertTrue(solution.increasingTriplet(new int[] {1, 2, 3, 4, 5}));
    assertFalse(solution.increasingTriplet(new int[] {5, 4, 3, 2, 1}));
    assertTrue(solution.increasingTriplet(new int[] {2, 1, 5, 0, 4, 6}));
  }
}
