package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P31ReverseLinkedList}
 *
 * @author Camio1945
 */
class P31ReverseLinkedListTest {
  @Test
  void test() {
    example1();
    example2();
    example3();
    example4();
  }

  private static void example1() {
    P31ReverseLinkedList solution = new P31ReverseLinkedList();
    assertNull(solution.reverseList(null));
  }

  private static void example2() {
    P31ReverseLinkedList solution = new P31ReverseLinkedList();
    P31ReverseLinkedList.ListNode one = new P31ReverseLinkedList.ListNode(1);
    P31ReverseLinkedList.ListNode res = solution.reverseList(one);
    assertEquals(1, res.val);
    assertNull(res.next);
  }

  private static void example3() {
    P31ReverseLinkedList solution = new P31ReverseLinkedList();
    P31ReverseLinkedList.ListNode one = new P31ReverseLinkedList.ListNode(1);
    P31ReverseLinkedList.ListNode two = new P31ReverseLinkedList.ListNode(2);
    one.next = two;
    P31ReverseLinkedList.ListNode res = solution.reverseList(one);
    assertEquals(2, res.val);
    assertEquals(1, res.next.val);
    assertNull(res.next.next);
  }

  private static void example4() {
    P31ReverseLinkedList solution = new P31ReverseLinkedList();
    P31ReverseLinkedList.ListNode one = new P31ReverseLinkedList.ListNode(1);
    P31ReverseLinkedList.ListNode two = new P31ReverseLinkedList.ListNode(2);
    P31ReverseLinkedList.ListNode three = new P31ReverseLinkedList.ListNode(3);
    P31ReverseLinkedList.ListNode four = new P31ReverseLinkedList.ListNode(4);
    P31ReverseLinkedList.ListNode five = new P31ReverseLinkedList.ListNode(5);
    one.next = two;
    two.next = three;
    three.next = four;
    four.next = five;
    P31ReverseLinkedList.ListNode res = solution.reverseList(one);
    assertEquals(5, res.val);
    assertEquals(4, res.next.val);
    assertEquals(3, res.next.next.val);
    assertEquals(2, res.next.next.next.val);
    assertEquals(1, res.next.next.next.next.val);
    assertNull(res.next.next.next.next.next);
  }
}
