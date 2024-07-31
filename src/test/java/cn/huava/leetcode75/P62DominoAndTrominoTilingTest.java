package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P62DominoAndTrominoTiling}
 *
 * @author Camio1945
 */
class P62DominoAndTrominoTilingTest {
  @Test
  void test() {
    example1();
    example2();
    example3();
  }

  private static void example1() {
    P62DominoAndTrominoTiling solution = new P62DominoAndTrominoTiling();
    assertEquals(5, solution.numTilings(3));
  }

  private static void example2() {
    P62DominoAndTrominoTiling solution = new P62DominoAndTrominoTiling();
    assertEquals(1, solution.numTilings(1));
  }

  private static void example3() {
    P62DominoAndTrominoTiling solution = new P62DominoAndTrominoTiling();
    assertEquals(11, solution.numTilings(4));
  }
}
