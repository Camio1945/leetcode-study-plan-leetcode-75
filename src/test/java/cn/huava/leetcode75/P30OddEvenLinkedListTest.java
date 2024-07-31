package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P30OddEvenLinkedList}
 *
 * @author Camio1945
 */
class P30OddEvenLinkedListTest {
  @Test
  void test() {
    example1();
    example2();
    example3();
  }

  private void example1() {
    P30OddEvenLinkedList solution = new P30OddEvenLinkedList();
    P30OddEvenLinkedList.ListNode one = new P30OddEvenLinkedList.ListNode(1);
    P30OddEvenLinkedList.ListNode two = new P30OddEvenLinkedList.ListNode(2);
    P30OddEvenLinkedList.ListNode three = new P30OddEvenLinkedList.ListNode(3);
    P30OddEvenLinkedList.ListNode four = new P30OddEvenLinkedList.ListNode(4);
    P30OddEvenLinkedList.ListNode five = new P30OddEvenLinkedList.ListNode(5);
    one.next = two;
    two.next = three;
    three.next = four;
    four.next = five;
    P30OddEvenLinkedList.ListNode res = solution.oddEvenList(one);
    assertEquals(1, res.val);
    assertEquals(3, res.next.val);
    assertEquals(5, res.next.next.val);
    assertEquals(2, res.next.next.next.val);
    assertEquals(4, res.next.next.next.next.val);
    assertNull(res.next.next.next.next.next);
  }

  private void example2() {
    P30OddEvenLinkedList solution = new P30OddEvenLinkedList();
    P30OddEvenLinkedList.ListNode one = new P30OddEvenLinkedList.ListNode(1);
    P30OddEvenLinkedList.ListNode two = new P30OddEvenLinkedList.ListNode(2);
    P30OddEvenLinkedList.ListNode three = new P30OddEvenLinkedList.ListNode(3);
    P30OddEvenLinkedList.ListNode four = new P30OddEvenLinkedList.ListNode(4);
    P30OddEvenLinkedList.ListNode five = new P30OddEvenLinkedList.ListNode(5);
    P30OddEvenLinkedList.ListNode six = new P30OddEvenLinkedList.ListNode(6);
    P30OddEvenLinkedList.ListNode seven = new P30OddEvenLinkedList.ListNode(7);
    two.next = one;
    one.next = three;
    three.next = five;
    five.next = six;
    six.next = four;
    four.next = seven;
    P30OddEvenLinkedList.ListNode res = solution.oddEvenList(two);
    assertEquals(2, res.val);
    assertEquals(3, res.next.val);
    assertEquals(6, res.next.next.val);
    assertEquals(7, res.next.next.next.val);
    assertEquals(1, res.next.next.next.next.val);
    assertEquals(5, res.next.next.next.next.next.val);
    assertEquals(4, res.next.next.next.next.next.next.val);
    assertNull(res.next.next.next.next.next.next.next);
  }

  private void example3() {
    P30OddEvenLinkedList solution = new P30OddEvenLinkedList();
    P30OddEvenLinkedList.ListNode one = new P30OddEvenLinkedList.ListNode(1);
    one.next = new P30OddEvenLinkedList.ListNode(1);
    P30OddEvenLinkedList.ListNode res = solution.oddEvenList(one);
    assertEquals(1, res.val);
    assertEquals(1, res.next.val);
    assertNull(res.next.next);
  }
}
