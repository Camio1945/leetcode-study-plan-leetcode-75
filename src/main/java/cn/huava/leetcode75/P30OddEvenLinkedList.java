package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/odd-even-linked-list/?envType=study-plan-v2&envId=leetcode-75">328.
 * Odd Even Linked List</a> <br>
 * [erred] Kudos to <a
 * href="https://leetcode.com/problems/odd-even-linked-list/solutions/5275264/best-solution-with-explanation-beats-100">ShivamKhator</a>
 *
 * @author Camio1945
 */
public class P30OddEvenLinkedList {
  public ListNode oddEvenList(ListNode head) {
    if (head == null || head.next == null || head.next.next == null) {
      return head;
    }
    ListNode odd = head;
    ListNode even = head.next;
    ListNode firstEven = head.next;
    while (even != null && even.next != null) {
      odd.next = odd.next.next;
      odd = odd.next;
      even.next = even.next.next;
      even = even.next;
    }
    odd.next = firstEven;
    return head;
  }

  public static class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }
}
