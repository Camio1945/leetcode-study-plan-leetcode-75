package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P39BinaryTreeRightSideView}
 *
 * @author Camio1945
 */
class P39BinaryTreeRightSideViewTest {
  @Test
  void test() {
    example1();
    example2();
    example3();
    example4();
    example5();
  }

  private static void example1() {
    P39BinaryTreeRightSideView solution = new P39BinaryTreeRightSideView();
    P39BinaryTreeRightSideView.TreeNode one = new P39BinaryTreeRightSideView.TreeNode(1);
    P39BinaryTreeRightSideView.TreeNode two = new P39BinaryTreeRightSideView.TreeNode(2);
    P39BinaryTreeRightSideView.TreeNode three = new P39BinaryTreeRightSideView.TreeNode(3);
    P39BinaryTreeRightSideView.TreeNode four = new P39BinaryTreeRightSideView.TreeNode(4);
    P39BinaryTreeRightSideView.TreeNode five = new P39BinaryTreeRightSideView.TreeNode(5);
    one.left = two;
    one.right = three;
    two.right = five;
    three.right = four;
    assertIterableEquals(List.of(1, 3, 4), solution.rightSideView(one));
  }

  private static void example2() {
    P39BinaryTreeRightSideView solution = new P39BinaryTreeRightSideView();
    P39BinaryTreeRightSideView.TreeNode one = new P39BinaryTreeRightSideView.TreeNode(1);
    one.right = new P39BinaryTreeRightSideView.TreeNode(3);
    assertIterableEquals(List.of(1, 3), solution.rightSideView(one));
  }

  private static void example3() {
    P39BinaryTreeRightSideView solution = new P39BinaryTreeRightSideView();
    List<Integer> res = solution.rightSideView(null);
    assertTrue(res == null || res.isEmpty());
  }

  private static void example4() {
    P39BinaryTreeRightSideView solution = new P39BinaryTreeRightSideView();
    P39BinaryTreeRightSideView.TreeNode one = new P39BinaryTreeRightSideView.TreeNode(1);
    one.left = new P39BinaryTreeRightSideView.TreeNode(2);
    assertIterableEquals(List.of(1, 2), solution.rightSideView(one));
  }

  private static void example5() {
    P39BinaryTreeRightSideView solution = new P39BinaryTreeRightSideView();
    P39BinaryTreeRightSideView.TreeNode one = new P39BinaryTreeRightSideView.TreeNode(1);
    P39BinaryTreeRightSideView.TreeNode two = new P39BinaryTreeRightSideView.TreeNode(2);
    P39BinaryTreeRightSideView.TreeNode three = new P39BinaryTreeRightSideView.TreeNode(3);
    P39BinaryTreeRightSideView.TreeNode four = new P39BinaryTreeRightSideView.TreeNode(4);
    one.left = two;
    one.right = three;
    two.left = four;
    assertIterableEquals(List.of(1, 3, 4), solution.rightSideView(one));
  }
}
