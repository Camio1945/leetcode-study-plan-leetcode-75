package cn.huava.leetcode75;

import java.util.ArrayList;
import java.util.List;

/**
 * <a
 * href="https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/?envType=study-plan-v2&envId=leetcode-75">1431.
 * Kids With the Greatest Number of Candies</a> <br>
 *
 * @author Camio1945
 */
public class P03KidsWithTheGreatestNumberOfCandies {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int max = 0;
    for (int candy : candies) {
      max = Math.max(candy, max);
    }
    List<Boolean> res = new ArrayList<>(candies.length);
    for (int candy : candies) {
      res.add(candy + extraCandies >= max);
    }
    return res;
  }
}
