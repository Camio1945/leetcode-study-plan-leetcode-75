package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P56KokoEatingBananas}
 *
 * @author Camio1945
 */
class P56KokoEatingBananasTest {
  @Test
  void test() {
    example1();
    example2();
    example3();
    example4();
    example5();
    example6();
  }

  private static void example1() {
    P56KokoEatingBananas solution = new P56KokoEatingBananas();
    assertEquals(4, solution.minEatingSpeed(new int[] {3, 6, 7, 11}, 8));
  }

  private static void example2() {
    P56KokoEatingBananas solution = new P56KokoEatingBananas();
    assertEquals(30, solution.minEatingSpeed(new int[] {30, 11, 23, 4, 20}, 5));
  }

  private static void example3() {
    P56KokoEatingBananas solution = new P56KokoEatingBananas();
    assertEquals(23, solution.minEatingSpeed(new int[] {30, 11, 23, 4, 20}, 6));
  }

  private static void example4() {
    P56KokoEatingBananas solution = new P56KokoEatingBananas();
    assertEquals(2, solution.minEatingSpeed(new int[] {312884470}, 312884469));
  }

  private static void example5() {
    P56KokoEatingBananas solution = new P56KokoEatingBananas();
    int[] piles = {805306368, 805306368, 805306368};
    assertEquals(3, solution.minEatingSpeed(piles, 1000000000));
  }

  private static void example6() {
    P56KokoEatingBananas solution = new P56KokoEatingBananas();
    int[] piles = {
      332484035, 524908576, 855865114, 632922376, 222257295, 690155293, 112677673,
      679580077, 337406589, 290818316, 877337160, 901728858, 679284947, 688210097,
      692137887, 718203285, 629455728, 941802184
    };
    assertEquals(14, solution.minEatingSpeed(piles, 823855818));
  }
}
