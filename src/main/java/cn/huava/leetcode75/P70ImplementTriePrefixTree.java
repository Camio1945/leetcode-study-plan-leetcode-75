package cn.huava.leetcode75;

/**
 * <a
 * href="https://leetcode.com/problems/implement-trie-prefix-tree/?envType=study-plan-v2&envId=leetcode-75">208.
 * Implement Trie (Prefix Tree)</a> <br>
 * [improved] Kudos to <a
 * href="https://leetcode.com/problems/implement-trie-prefix-tree/solutions/5081268/java-simple-clean-code-beats-95-80">arib21</a>
 *
 * @author Camio1945
 */
public class P70ImplementTriePrefixTree {
  private P70ImplementTriePrefixTree() {}

  public static class Trie {
    private final Trie[] children = new Trie[26];
    private boolean isEndOfWord = false;

    public Trie() {}

    public void insert(String word) {
      Trie cur = this;
      for (char c : word.toCharArray()) {
        int index = c - 'a';
        Trie child = cur.children[index];
        if (child == null) {
          child = new Trie();
          cur.children[index] = child;
        }
        cur = child;
      }
      cur.isEndOfWord = true;
    }

    public boolean search(String word) {
      Trie trie = searchByPrefix(word);
      return trie != null && trie.isEndOfWord;
    }

    private Trie searchByPrefix(String prefix) {
      Trie cur = this;
      for (char c : prefix.toCharArray()) {
        int index = c - 'a';
        Trie child = cur.children[index];
        if (child == null) {
          return null;
        }
        cur = child;
      }
      return cur;
    }

    public boolean startsWith(String prefix) {
      return searchByPrefix(prefix) != null;
    }
  }
}
