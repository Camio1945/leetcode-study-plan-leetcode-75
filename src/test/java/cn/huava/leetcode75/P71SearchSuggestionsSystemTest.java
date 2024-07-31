package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P71SearchSuggestionsSystem}
 *
 * @author Camio1945
 */
class P71SearchSuggestionsSystemTest {
  @Test
  void test() {
    example1();
    example2();
  }

  private static void example1() {
    P71SearchSuggestionsSystem solution = new P71SearchSuggestionsSystem();
    List<List<String>> expect =
        List.of(
            List.of("mobile", "moneypot", "monitor"),
            List.of("mobile", "moneypot", "monitor"),
            List.of("mouse", "mousepad"),
            List.of("mouse", "mousepad"),
            List.of("mouse", "mousepad"));
    String[] products = {"mobile", "mouse", "moneypot", "monitor", "mousepad"};
    List<List<String>> res = solution.suggestedProducts(products, "mouse");
    assertIterableEquals(expect, res);
  }

  private static void example2() {
    P71SearchSuggestionsSystem solution = new P71SearchSuggestionsSystem();
    List<List<String>> expect =
        List.of(
            List.of("havana"),
            List.of("havana"),
            List.of("havana"),
            List.of("havana"),
            List.of("havana"),
            List.of("havana"));
    List<List<String>> res = solution.suggestedProducts(new String[] {"havana"}, "havana");
    assertIterableEquals(expect, res);
  }
}
