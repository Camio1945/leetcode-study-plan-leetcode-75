package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P53GuessNumberHigherOrLower}
 *
 * @author Camio1945
 */
class P53GuessNumberHigherOrLowerTest {
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
    P53GuessNumberHigherOrLower solution = new P53GuessNumberHigherOrLower();
    solution.setPick(6);
    assertEquals(6, solution.guessNumber(10));
  }

  private static void example2() {
    P53GuessNumberHigherOrLower solution = new P53GuessNumberHigherOrLower();
    solution.setPick(1);
    assertEquals(1, solution.guessNumber(1));
  }

  private static void example3() {
    P53GuessNumberHigherOrLower solution = new P53GuessNumberHigherOrLower();
    solution.setPick(1);
    assertEquals(1, solution.guessNumber(2));
  }

  private static void example4() {
    P53GuessNumberHigherOrLower solution = new P53GuessNumberHigherOrLower();
    solution.setPick(2);
    assertEquals(2, solution.guessNumber(2));
  }

  private static void example5() {
    P53GuessNumberHigherOrLower solution = new P53GuessNumberHigherOrLower();
    solution.setPick(50);
    assertEquals(50, solution.guessNumber(1000));
  }

  private static void example6() {
    P53GuessNumberHigherOrLower solution = new P53GuessNumberHigherOrLower();
    solution.setPick(1702766719);
    assertEquals(1702766719, solution.guessNumber(2126753390));
  }
}
