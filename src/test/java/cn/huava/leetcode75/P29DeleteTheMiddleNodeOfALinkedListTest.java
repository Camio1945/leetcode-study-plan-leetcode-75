package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P29DeleteTheMiddleNodeOfALinkedList}
 *
 * @author Camio1945
 */
class P29DeleteTheMiddleNodeOfALinkedListTest {
  @Test
  void test() {
    example1();
    example2();
    example3();
    example4();
  }

  private static void example1() {
    P29DeleteTheMiddleNodeOfALinkedList solution = new P29DeleteTheMiddleNodeOfALinkedList();
    P29DeleteTheMiddleNodeOfALinkedList.ListNode one =
        new P29DeleteTheMiddleNodeOfALinkedList.ListNode(1);
    P29DeleteTheMiddleNodeOfALinkedList.ListNode newOne =
        new P29DeleteTheMiddleNodeOfALinkedList.ListNode(1);
    P29DeleteTheMiddleNodeOfALinkedList.ListNode two =
        new P29DeleteTheMiddleNodeOfALinkedList.ListNode(2);
    P29DeleteTheMiddleNodeOfALinkedList.ListNode three =
        new P29DeleteTheMiddleNodeOfALinkedList.ListNode(3);
    P29DeleteTheMiddleNodeOfALinkedList.ListNode four =
        new P29DeleteTheMiddleNodeOfALinkedList.ListNode(4);
    P29DeleteTheMiddleNodeOfALinkedList.ListNode six =
        new P29DeleteTheMiddleNodeOfALinkedList.ListNode(6);
    P29DeleteTheMiddleNodeOfALinkedList.ListNode seven =
        new P29DeleteTheMiddleNodeOfALinkedList.ListNode(7);
    one.next = three;
    three.next = four;
    four.next = seven;
    seven.next = newOne;
    newOne.next = two;
    two.next = six;
    P29DeleteTheMiddleNodeOfALinkedList.ListNode res = solution.deleteMiddle(one);
    assertEquals(1, res.val);
    assertEquals(3, res.next.val);
    assertEquals(4, res.next.next.val);
    assertEquals(1, res.next.next.next.val);
    assertEquals(2, res.next.next.next.next.val);
    assertEquals(6, res.next.next.next.next.next.val);
    assertNull(res.next.next.next.next.next.next);
  }

  private static void example2() {
    P29DeleteTheMiddleNodeOfALinkedList solution = new P29DeleteTheMiddleNodeOfALinkedList();
    P29DeleteTheMiddleNodeOfALinkedList.ListNode one =
        new P29DeleteTheMiddleNodeOfALinkedList.ListNode(1);
    P29DeleteTheMiddleNodeOfALinkedList.ListNode two =
        new P29DeleteTheMiddleNodeOfALinkedList.ListNode(2);
    P29DeleteTheMiddleNodeOfALinkedList.ListNode three =
        new P29DeleteTheMiddleNodeOfALinkedList.ListNode(3);
    P29DeleteTheMiddleNodeOfALinkedList.ListNode four =
        new P29DeleteTheMiddleNodeOfALinkedList.ListNode(4);
    one.next = two;
    two.next = three;
    three.next = four;
    P29DeleteTheMiddleNodeOfALinkedList.ListNode res = solution.deleteMiddle(one);
    assertEquals(1, res.val);
    assertEquals(2, res.next.val);
    assertEquals(4, res.next.next.val);
    assertNull(res.next.next.next);
  }

  private static void example3() {
    P29DeleteTheMiddleNodeOfALinkedList solution = new P29DeleteTheMiddleNodeOfALinkedList();
    P29DeleteTheMiddleNodeOfALinkedList.ListNode one =
        new P29DeleteTheMiddleNodeOfALinkedList.ListNode(1);
    P29DeleteTheMiddleNodeOfALinkedList.ListNode two =
        new P29DeleteTheMiddleNodeOfALinkedList.ListNode(2);
    two.next = one;
    P29DeleteTheMiddleNodeOfALinkedList.ListNode res = solution.deleteMiddle(two);
    assertEquals(2, res.val);
    assertNull(res.next);
  }

  private static void example4() {
    P29DeleteTheMiddleNodeOfALinkedList solution = new P29DeleteTheMiddleNodeOfALinkedList();
    P29DeleteTheMiddleNodeOfALinkedList.ListNode one =
        new P29DeleteTheMiddleNodeOfALinkedList.ListNode(1);
    P29DeleteTheMiddleNodeOfALinkedList.ListNode res = solution.deleteMiddle(one);
    assertNull(res);
  }
}
