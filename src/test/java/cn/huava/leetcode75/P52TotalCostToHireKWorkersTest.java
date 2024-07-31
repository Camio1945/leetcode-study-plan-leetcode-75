package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P52TotalCostToHireKWorkers}
 *
 * @author Camio1945
 */
class P52TotalCostToHireKWorkersTest {
  @Test
  void test() {
    example1();
    example2();
    example3();
    example4();
  }

  private static void example1() {
    P52TotalCostToHireKWorkers solution = new P52TotalCostToHireKWorkers();
    assertEquals(11, solution.totalCost(new int[] {17, 12, 10, 2, 7, 2, 11, 20, 8}, 3, 4));
  }

  private static void example2() {
    P52TotalCostToHireKWorkers solution = new P52TotalCostToHireKWorkers();
    assertEquals(4, solution.totalCost(new int[] {1, 2, 4, 1}, 3, 3));
  }

  private static void example3() {
    P52TotalCostToHireKWorkers solution = new P52TotalCostToHireKWorkers();
    int[] costs = {
      50, 80, 34, 9, 86, 20, 67, 94, 65, 82, 40, 79, 74, 92, 84, 37, 19, 16, 85, 20, 79, 25, 89, 55,
      67, 84, 3, 79, 38, 16, 44, 2, 54, 58
    };
    assertEquals(95, solution.totalCost(costs, 7, 12));
  }

  private static void example4() {
    P52TotalCostToHireKWorkers solution = new P52TotalCostToHireKWorkers();
    int[] costs = {57, 33, 26, 76, 14, 67, 24, 90, 72, 37, 30};
    assertEquals(526, solution.totalCost(costs, 11, 2));
  }
}
