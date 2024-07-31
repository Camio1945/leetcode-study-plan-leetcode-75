package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P50SmallestNumberInInfiniteSet}
 *
 * @author Camio1945
 */
class P50SmallestNumberInInfiniteSetTest {
  @Test
  void test() {
    P50SmallestNumberInInfiniteSet.SmallestInfiniteSet smallestInfiniteSet =
        new P50SmallestNumberInInfiniteSet.SmallestInfiniteSet();

    // 2 is already in the set, so no change is made.
    smallestInfiniteSet.addBack(2);
    // return 1, since 1 is the smallest number, and remove it from the set.
    assertEquals(1, smallestInfiniteSet.popSmallest());
    // return 2, and remove it from the set.
    assertEquals(2, smallestInfiniteSet.popSmallest());
    // return 3, and remove it from the set.
    assertEquals(3, smallestInfiniteSet.popSmallest());
    // 1 is added back to the set.
    smallestInfiniteSet.addBack(1);
    // return 1, since 1 was added back to the set and is the smallest number, and remove it from
    // the set.
    assertEquals(1, smallestInfiniteSet.popSmallest());
    // return 4, and remove it from the set.
    assertEquals(4, smallestInfiniteSet.popSmallest());
    // return 5, and remove it from the set.
    assertEquals(5, smallestInfiniteSet.popSmallest());
  }
}
