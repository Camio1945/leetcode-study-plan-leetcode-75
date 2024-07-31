package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P43KeysAndRooms}
 *
 * @author Camio1945
 */
class P43KeysAndRoomsTest {
  @Test
  void test() {
    example1();
    example2();
  }

  private static void example1() {
    P43KeysAndRooms solution = new P43KeysAndRooms();
    List<List<Integer>> rooms1 = List.of(List.of(1), List.of(2), List.of(3), List.of());
    assertTrue(solution.canVisitAllRooms(rooms1));
  }

  private static void example2() {
    P43KeysAndRooms solution = new P43KeysAndRooms();
    List<List<Integer>> rooms2 = List.of(List.of(1, 3), List.of(3, 1, 0), List.of(2), List.of(0));
    assertFalse(solution.canVisitAllRooms(rooms2));
  }
}
