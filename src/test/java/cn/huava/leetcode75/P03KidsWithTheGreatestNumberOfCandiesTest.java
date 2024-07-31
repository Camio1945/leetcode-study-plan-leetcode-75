package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P03KidsWithTheGreatestNumberOfCandies}
 *
 * @author Camio1945
 */
class P03KidsWithTheGreatestNumberOfCandiesTest {
  @Test
  void test() {
    P03KidsWithTheGreatestNumberOfCandies solution = new P03KidsWithTheGreatestNumberOfCandies();
    assertIterableEquals(
        List.of(true, true, true, false, true),
        solution.kidsWithCandies(new int[] {2, 3, 5, 1, 3}, 3));
    assertIterableEquals(
        List.of(true, false, false, false, false),
        solution.kidsWithCandies(new int[] {4, 2, 1, 1, 2}, 1));
    assertIterableEquals(
        List.of(true, false, true), solution.kidsWithCandies(new int[] {12, 1, 12}, 10));
  }
}
