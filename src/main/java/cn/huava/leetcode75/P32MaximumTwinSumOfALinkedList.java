package cn.huava.leetcode75;

import java.util.ArrayList;
import java.util.List;

/**
 * <a
 * href="https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/?envType=study-plan-v2&envId=leetcode-75">2130.
 * Maximum Twin Sum of a Linked List</a> <br>
 *
 * @author Camio1945
 */
@SuppressWarnings("AlibabaClassNamingShouldBeCamel")
public class P32MaximumTwinSumOfALinkedList {
  public int pairSum(ListNode head) {
    List<ListNode> nodes = new ArrayList<>();
    while (head != null) {
      nodes.add(head);
      head = head.next;
    }
    int n = nodes.size();
    int divideIntoHowManyParts = 2;
    int maxSum = 0;
    for (int i = 0; i < n / divideIntoHowManyParts; i++) {
      int sum = nodes.get(i).val + nodes.get(n - 1 - i).val;
      maxSum = Math.max(maxSum, sum);
    }
    return maxSum;
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
