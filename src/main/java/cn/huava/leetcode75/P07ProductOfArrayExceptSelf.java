package cn.huava.leetcode75;

import java.util.Arrays;

/**
 * <a
 * href="https://leetcode.com/problems/product-of-array-except-self/?envType=study-plan-v2&envId=leetcode-75">238.
 * Product of Array Except Self</a> <br>
 * [erred] Kudos to <a
 * href="https://leetcode.com/problems/product-of-array-except-self/solutions/1342916/3-minute-read-mimicking-an-interview">dead_lock</a>
 *
 * @author Camio1945
 */
public class P07ProductOfArrayExceptSelf {

  public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] ans = new int[n];
    Arrays.fill(ans, 1);
    for (int i = 1; i < n; i++) {
      // here, ans[i] is the product of all the numbers on the left side before i
      ans[i] = ans[i - 1] * nums[i - 1];
    }
    int rightProduct = 1;
    // here, if we use i = n - 2, the Alibaba Java Coding Guidelines plugin will complain
    for (int i = (n - 1) - 1; i >= 0; i--) {
      // here, rightProduct is the product of all the numbers on the right side after i
      rightProduct = rightProduct * nums[i + 1];
      // the final answer is leftProduct * rightProduct
      ans[i] *= rightProduct;
    }
    return ans;
  }
}
