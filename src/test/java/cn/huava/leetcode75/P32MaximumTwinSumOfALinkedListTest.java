package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P32MaximumTwinSumOfALinkedList}
 *
 * @author Camio1945
 */
class P32MaximumTwinSumOfALinkedListTest {
  @Test
  void test() {
    example1();
    example2();
    example3();
  }

  private static void example1() {
    P32MaximumTwinSumOfALinkedList solution = new P32MaximumTwinSumOfALinkedList();
    P32MaximumTwinSumOfALinkedList.ListNode one = new P32MaximumTwinSumOfALinkedList.ListNode(1);
    P32MaximumTwinSumOfALinkedList.ListNode two = new P32MaximumTwinSumOfALinkedList.ListNode(2);
    P32MaximumTwinSumOfALinkedList.ListNode four = new P32MaximumTwinSumOfALinkedList.ListNode(4);
    P32MaximumTwinSumOfALinkedList.ListNode five = new P32MaximumTwinSumOfALinkedList.ListNode(5);
    five.next = four;
    four.next = two;
    two.next = one;
    assertEquals(6, solution.pairSum(five));
  }

  private static void example2() {
    P32MaximumTwinSumOfALinkedList solution = new P32MaximumTwinSumOfALinkedList();
    P32MaximumTwinSumOfALinkedList.ListNode two = new P32MaximumTwinSumOfALinkedList.ListNode(2);
    P32MaximumTwinSumOfALinkedList.ListNode newTwo = new P32MaximumTwinSumOfALinkedList.ListNode(2);
    P32MaximumTwinSumOfALinkedList.ListNode three = new P32MaximumTwinSumOfALinkedList.ListNode(3);
    P32MaximumTwinSumOfALinkedList.ListNode four = new P32MaximumTwinSumOfALinkedList.ListNode(4);
    four.next = two;
    two.next = newTwo;
    newTwo.next = three;
    assertEquals(7, solution.pairSum(four));
  }

  private static void example3() {
    P32MaximumTwinSumOfALinkedList solution = new P32MaximumTwinSumOfALinkedList();
    P32MaximumTwinSumOfALinkedList.ListNode one = new P32MaximumTwinSumOfALinkedList.ListNode(1);
    one.next = new P32MaximumTwinSumOfALinkedList.ListNode(100000);
    assertEquals(100001, solution.pairSum(one));
  }
}
