package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/reverse-vowels-of-a-string/?envType=study-plan-v2&envId=leetcode-75">345.
 * Reverse Vowels of a String</a> <br>
 *
 * @author Camio1945
 */
@SuppressWarnings("AlibabaClassNamingShouldBeCamel")
public class P05ReverseVowelsOfAString {
  public String reverseVowels(String s) {
    int len = s.length();
    int left = 0;
    int right = len - 1;
    char[] arr = s.toCharArray();
    while (left < right) {
      boolean foundLeft = false;
      for (; left < right; left++) {
        char c = s.charAt(left);
        if (isVowel(c)) {
          foundLeft = true;
          break;
        }
      }
      boolean foundRight = false;
      for (; right > left; right--) {
        char c = s.charAt(right);
        if (isVowel(c)) {
          foundRight = true;
          break;
        }
      }
      if (foundLeft && foundRight) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
      }
    }
    return String.valueOf(arr);
  }

  private static boolean isVowel(char c) {
    return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o'
        || c == 'O' || c == 'u' || c == 'U';
  }
}
