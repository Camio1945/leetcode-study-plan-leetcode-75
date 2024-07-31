package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/reverse-linked-list/?envType=study-plan-v2&envId=leetcode-75">206.
 * Reverse Linked List</a> <br>
 *
 * @author Camio1945
 */
public class P31ReverseLinkedList {
  public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode prev = null;
    ListNode cur = head;
    while (cur != null) {
      ListNode oldCur = cur;
      cur = cur.next;
      oldCur.next = prev;
      prev = oldCur;
    }
    return prev;
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
