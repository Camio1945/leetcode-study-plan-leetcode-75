package cn.huava.leetcode75;

import java.util.*;

/**
 * <a
 * href="https://leetcode.com/problems/search-suggestions-system/?envType=study-plan-v2&envId=leetcode-75">1268.
 * Search Suggestions System</a> <br>
 * [improved] Kudos to <a
 * href="https://leetcode.com/problems/search-suggestions-system/solutions/440474/java-trie-explained-clean-code-14ms">gthor10</a>
 *
 * @author Camio1945
 */
public class P71SearchSuggestionsSystem {
  public List<List<String>> suggestedProducts(String[] products, String searchWord) {
    Arrays.sort(products);
    List<List<String>> res = new ArrayList<>();
    Trie trie = new Trie();
    for (String product : products) {
      trie.insert(product);
    }
    int n = searchWord.length();
    for (int i = 0; i < n; i++) {
      trie = trie.children[searchWord.charAt(i) - 'a'];
      if (trie == null) {
        for (int j = i; j < n; j++) {
          res.add(Collections.emptyList());
        }
        break;
      }
      res.add(trie.words);
    }
    return res;
  }

  private static class Trie {
    private static final int MAX_WORDS = 3;
    private final Trie[] children = new Trie[26];
    private final List<String> words = new ArrayList<>();

    private void insert(String word) {
      Trie cur = this;
      for (char c : word.toCharArray()) {
        int index = c - 'a';
        Trie child = cur.children[index];
        if (child == null) {
          child = new Trie();
          cur.children[index] = child;
        }
        cur = child;
        if (cur.words.size() < MAX_WORDS) {
          cur.words.add(word);
        }
      }
    }
  }
}
