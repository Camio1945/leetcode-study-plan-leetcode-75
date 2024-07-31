package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P69MinimumFlipsToMakeAOrBEqualToC}
 *
 * @author Camio1945
 */
class P69MinimumFlipsToMakeAOrBEqualToCTest {
  @Test
  void test() {
    example1();
    example2();
    example3();
    example4();
  }

  private static void example1() {
    P69MinimumFlipsToMakeAOrBEqualToC solution = new P69MinimumFlipsToMakeAOrBEqualToC();
    assertEquals(3, solution.minFlips(2, 6, 5));
  }

  private static void example2() {
    P69MinimumFlipsToMakeAOrBEqualToC solution = new P69MinimumFlipsToMakeAOrBEqualToC();
    assertEquals(1, solution.minFlips(4, 2, 7));
  }

  private static void example3() {
    P69MinimumFlipsToMakeAOrBEqualToC solution = new P69MinimumFlipsToMakeAOrBEqualToC();
    assertEquals(0, solution.minFlips(1, 2, 3));
  }

  private static void example4() {
    P69MinimumFlipsToMakeAOrBEqualToC solution = new P69MinimumFlipsToMakeAOrBEqualToC();
    assertEquals(3, solution.minFlips(8, 3, 5));
  }
}
