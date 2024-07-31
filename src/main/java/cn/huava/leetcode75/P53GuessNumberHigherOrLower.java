package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/guess-number-higher-or-lower/?envType=study-plan-v2&envId=leetcode-75">374.
 * Guess Number Higher or Lower</a> <br>
 *
 * @author Camio1945
 */
public class P53GuessNumberHigherOrLower {
  private int pick;

  public int guessNumber(int n) {
    int left = 1;
    int right = n;
    while (left <= right) {
      int middle = left + (right - left) / 2;
      int guessRes = guess(middle);
      if (guessRes == 0) {
        return middle;
      }
      if (guessRes < 0) {
        right = middle - 1;
      } else {
        left = middle + 1;
      }
    }
    return -1;
  }

  public int guess(int num) {
    if (num > pick) {
      return -1;
    } else if (num < pick) {
      return 1;
    }
    return 0;
  }

  public void setPick(int pick) {
    this.pick = pick;
  }
}
