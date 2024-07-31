package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P20FindTheDifferenceOfTwoArrays}
 *
 * @author Camio1945
 */
class P20FindTheDifferenceOfTwoArraysTest {
  @Test
  void test() {
    P20FindTheDifferenceOfTwoArrays solution = new P20FindTheDifferenceOfTwoArrays();
    assertIterableEquals(
        List.of(List.of(1, 3), List.of(4, 6)),
        solution.findDifference(new int[] {1, 2, 3}, new int[] {2, 4, 6}));
    assertIterableEquals(
        List.of(List.of(3), List.of()),
        solution.findDifference(new int[] {1, 2, 3, 3}, new int[] {1, 1, 2, 2}));
  }
}
