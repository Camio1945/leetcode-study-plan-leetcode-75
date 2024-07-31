package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/?envType=study-plan-v2&envId=leetcode-75">2095.
 * Delete the Middle Node of a Linked List</a> <br>
 * [improved] Kudos to <a
 * href="https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/solutions/4705282/simple-beginner-friendly-dry-run-two-pointer-approach-time-o-n-space-o-1-gits">GiteshSK_12</a>
 *
 * @author Camio1945
 */
@SuppressWarnings("AlibabaClassNamingShouldBeCamel")
public class P29DeleteTheMiddleNodeOfALinkedList {
  public ListNode deleteMiddle(ListNode head) {
    ListNode prevHead = new ListNode(0, head);
    ListNode fast = head;
    ListNode slow = prevHead;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    slow.next = slow.next.next;
    return prevHead.next;
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
