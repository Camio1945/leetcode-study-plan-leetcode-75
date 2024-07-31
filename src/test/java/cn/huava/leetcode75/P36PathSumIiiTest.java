package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P36PathSumIii}
 *
 * @author Camio1945
 */
class P36PathSumIiiTest {
  @Test
  void test() {
    example1();
  }

  private void example1() {
    P36PathSumIii solution = new P36PathSumIii();
    P36PathSumIii.TreeNode ten = new P36PathSumIii.TreeNode(10);
    P36PathSumIii.TreeNode five = new P36PathSumIii.TreeNode(5);
    P36PathSumIii.TreeNode negativeThree = new P36PathSumIii.TreeNode(-3);
    P36PathSumIii.TreeNode three = new P36PathSumIii.TreeNode(3);
    P36PathSumIii.TreeNode two = new P36PathSumIii.TreeNode(2);
    P36PathSumIii.TreeNode eleven = new P36PathSumIii.TreeNode(11);
    P36PathSumIii.TreeNode newThree = new P36PathSumIii.TreeNode(3);
    P36PathSumIii.TreeNode negativeTwo = new P36PathSumIii.TreeNode(-2);
    P36PathSumIii.TreeNode one = new P36PathSumIii.TreeNode(1);
    ten.left = five;
    ten.right = negativeThree;
    five.left = three;
    five.right = two;
    negativeThree.right = eleven;
    three.left = newThree;
    three.right = negativeTwo;
    two.right = one;
    assertEquals(3, solution.pathSum(ten, 8));
  }
}
