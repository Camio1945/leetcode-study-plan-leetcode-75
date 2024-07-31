package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.*;
import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P42DeleteNodeInABst}
 *
 * @author Camio1945
 */
class P42DeleteNodeInABstTest {
  @Test
  void test() {
    example1();
    example2();
    example3();
    example4();
  }

  private void example1() {
    P42DeleteNodeInABst solution = new P42DeleteNodeInABst();
    P42DeleteNodeInABst.TreeNode n2 = new P42DeleteNodeInABst.TreeNode(2);
    P42DeleteNodeInABst.TreeNode n3 = new P42DeleteNodeInABst.TreeNode(3);
    P42DeleteNodeInABst.TreeNode n4 = new P42DeleteNodeInABst.TreeNode(4);
    P42DeleteNodeInABst.TreeNode n5 = new P42DeleteNodeInABst.TreeNode(5);
    P42DeleteNodeInABst.TreeNode n6 = new P42DeleteNodeInABst.TreeNode(6);
    P42DeleteNodeInABst.TreeNode n7 = new P42DeleteNodeInABst.TreeNode(7);
    n5.left = n3;
    n5.right = n6;
    n3.left = n2;
    n3.right = n4;
    n6.right = n7;
    checkBinarySearchTree(n5);
    P42DeleteNodeInABst.TreeNode res = solution.deleteNode(n5, 3);
    assertEquals(5, res.val);
    assertEquals(6, res.right.val);
    checkBinarySearchTree(res);
  }

  private void example2() {
    P42DeleteNodeInABst solution = new P42DeleteNodeInABst();
    P42DeleteNodeInABst.TreeNode n2 = new P42DeleteNodeInABst.TreeNode(2);
    P42DeleteNodeInABst.TreeNode n3 = new P42DeleteNodeInABst.TreeNode(3);
    P42DeleteNodeInABst.TreeNode n4 = new P42DeleteNodeInABst.TreeNode(4);
    P42DeleteNodeInABst.TreeNode n5 = new P42DeleteNodeInABst.TreeNode(5);
    P42DeleteNodeInABst.TreeNode n6 = new P42DeleteNodeInABst.TreeNode(6);
    P42DeleteNodeInABst.TreeNode n7 = new P42DeleteNodeInABst.TreeNode(7);
    n5.left = n3;
    n5.right = n6;
    n3.left = n2;
    n3.right = n4;
    n6.right = n7;
    checkBinarySearchTree(n5);
    P42DeleteNodeInABst.TreeNode res = solution.deleteNode(n5, 0);
    assertEquals(5, res.val);
    assertEquals(3, res.left.val);
    assertEquals(6, res.right.val);
    assertEquals(2, res.left.left.val);
    assertEquals(4, res.left.right.val);
    assertEquals(7, res.right.right.val);
    checkBinarySearchTree(res);
  }

  private void example3() {
    P42DeleteNodeInABst solution = new P42DeleteNodeInABst();
    P42DeleteNodeInABst.TreeNode res = solution.deleteNode(null, 0);
    assertNull(res);
  }

  private void checkBinarySearchTree(P42DeleteNodeInABst.TreeNode node) {
    if (node == null) {
      return;
    }
    if (node.left != null) {
      assertTrue(node.val > node.left.val);
      checkBinarySearchTree(node.left);
    }
    if (node.right != null) {
      assertTrue(node.right.val > node.val);
      checkBinarySearchTree(node.right);
    }
  }

  private void example4() {
    P42DeleteNodeInABst solution = new P42DeleteNodeInABst();
    P42DeleteNodeInABst.TreeNode n2 = new P42DeleteNodeInABst.TreeNode(2);
    P42DeleteNodeInABst.TreeNode n3 = new P42DeleteNodeInABst.TreeNode(3);
    P42DeleteNodeInABst.TreeNode n4 = new P42DeleteNodeInABst.TreeNode(4);
    P42DeleteNodeInABst.TreeNode n5 = new P42DeleteNodeInABst.TreeNode(5);
    P42DeleteNodeInABst.TreeNode n6 = new P42DeleteNodeInABst.TreeNode(6);
    P42DeleteNodeInABst.TreeNode n7 = new P42DeleteNodeInABst.TreeNode(7);
    n5.left = n3;
    n5.right = n6;
    n3.left = n2;
    n3.right = n4;
    n6.right = n7;
    checkBinarySearchTree(n5);
    P42DeleteNodeInABst.TreeNode res = solution.deleteNode(n5, 7);
    assertEquals(5, res.val);
    assertEquals(3, res.left.val);
    assertEquals(6, res.right.val);
    assertEquals(2, res.left.left.val);
    assertEquals(4, res.left.right.val);
    checkBinarySearchTree(res);
  }
}
