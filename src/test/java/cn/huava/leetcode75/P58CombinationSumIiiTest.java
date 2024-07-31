package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P58CombinationSumIii}
 *
 * @author Camio1945
 */
class P58CombinationSumIiiTest {
  @Test
  void test() {
    example1();
    example2();
    example3();
  }

  private static void example1() {
    P58CombinationSumIii solution = new P58CombinationSumIii();
    List<List<Integer>> lists = solution.combinationSum3(3, 7);
    assertEquals(1, lists.size());
    assertTrue(lists.getFirst().contains(1));
    assertTrue(lists.getFirst().contains(2));
    assertTrue(lists.getFirst().contains(4));
  }

  private static void example2() {
    P58CombinationSumIii solution = new P58CombinationSumIii();
    List<List<Integer>> lists = solution.combinationSum3(3, 9);
    assertEquals(3, lists.size());
    Set<String> strSet = new HashSet<>();
    for (List<Integer> list : lists) {
      String str = list.stream().sorted().map(String::valueOf).collect(Collectors.joining(","));
      strSet.add(str);
    }
    assertTrue(strSet.contains("1,2,6"));
    assertTrue(strSet.contains("1,3,5"));
    assertTrue(strSet.contains("2,3,4"));
  }

  private static void example3() {
    P58CombinationSumIii solution = new P58CombinationSumIii();
    List<List<Integer>> lists = solution.combinationSum3(4, 1);
    assertTrue(lists.isEmpty());
  }
}
