package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P54SuccessfulPairsOfSpellsAndPotions}
 *
 * @author Camio1945
 */
class P54SuccessfulPairsOfSpellsAndPotionsTest {
  @Test
  void test() {
    example1();
    example2();
  }

  private static void example1() {
    P54SuccessfulPairsOfSpellsAndPotions solution = new P54SuccessfulPairsOfSpellsAndPotions();
    int[] expect = {4, 0, 3};
    assertArrayEquals(
        expect, solution.successfulPairs(new int[] {5, 1, 3}, new int[] {1, 2, 3, 4, 5}, 7));
  }

  private static void example2() {
    P54SuccessfulPairsOfSpellsAndPotions solution = new P54SuccessfulPairsOfSpellsAndPotions();
    int[] expect = {2, 0, 2};
    assertArrayEquals(
        expect, solution.successfulPairs(new int[] {3, 1, 2}, new int[] {8, 5, 8}, 16));
  }
}
