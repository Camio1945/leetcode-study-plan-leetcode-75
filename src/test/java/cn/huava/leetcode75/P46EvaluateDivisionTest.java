package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P46EvaluateDivision}
 *
 * @author Camio1945
 */
class P46EvaluateDivisionTest {
  @Test
  void test() {
    example1();
    example2();
    example3();
  }

  private static void example1() {
    P46EvaluateDivision solution = new P46EvaluateDivision();
    List<List<String>> equations = List.of(List.of("a", "b"), List.of("b", "c"));
    double[] values = {2.0, 3.0};
    List<List<String>> queries =
        List.of(
            List.of("a", "c"),
            List.of("b", "a"),
            List.of("a", "e"),
            List.of("a", "a"),
            List.of("x", "x"));
    double[] res = solution.calcEquation(equations, values, queries);
    assertArrayEquals(new double[] {6.0, 0.5, -1.0, 1.0, -1.0}, res);
  }

  private static void example2() {
    P46EvaluateDivision solution = new P46EvaluateDivision();
    List<List<String>> equations =
        List.of(List.of("a", "b"), List.of("b", "c"), List.of("bc", "cd"));
    double[] values = {1.5, 2.5, 5.0};
    List<List<String>> queries =
        List.of(List.of("a", "c"), List.of("c", "b"), List.of("bc", "cd"), List.of("cd", "bc"));
    double[] res = solution.calcEquation(equations, values, queries);
    assertArrayEquals(new double[] {3.75, 0.4, 5.0, 0.2}, res);
  }

  private static void example3() {
    P46EvaluateDivision solution = new P46EvaluateDivision();
    List<List<String>> equations = List.of(List.of("a", "b"));
    double[] values = {0.5};
    List<List<String>> queries =
        List.of(List.of("a", "b"), List.of("b", "a"), List.of("a", "c"), List.of("x", "y"));
    double[] res = solution.calcEquation(equations, values, queries);
    assertArrayEquals(new double[] {0.5, 2.0, -1.0, -1.0}, res);
  }
}
