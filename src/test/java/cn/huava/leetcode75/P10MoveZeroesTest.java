package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P10MoveZeroes}
 *
 * @author Camio1945
 */
class P10MoveZeroesTest {
  @Test
  void test() {
    P10MoveZeroes solution = new P10MoveZeroes();
    int[] nums = {0, 1, 0, 3, 12};
    solution.moveZeroes(nums);
    assertArrayEquals(new int[] {1, 3, 12, 0, 0}, nums);

    nums = new int[] {0};
    solution.moveZeroes(nums);
    assertArrayEquals(new int[] {0}, nums);

    nums = new int[] {4, 2, 4, 0, 0, 3, 0, 5, 1, 0};
    solution.moveZeroes(nums);
    assertArrayEquals(new int[] {4, 2, 4, 3, 5, 1, 0, 0, 0, 0}, nums);

    // TODO
  }
}
