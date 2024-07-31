package cn.huava.leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Case of {@link P70ImplementTriePrefixTree}
 *
 * @author Camio1945
 */
class P70ImplementTriePrefixTreeTest {
  @Test
  void test() {
    example1();
    example2();
  }

  private static void example1() {
    P70ImplementTriePrefixTree.Trie trie = new P70ImplementTriePrefixTree.Trie();
    trie.insert("apple");
    assertTrue(trie.search("apple"));
    assertFalse(trie.search("app"));
    assertTrue(trie.startsWith("app"));
    trie.insert("app");
    assertTrue(trie.search("app"));
  }

  private static void example2() {
    P70ImplementTriePrefixTree.Trie trie = new P70ImplementTriePrefixTree.Trie();
    trie.insert("hello");
    assertFalse(trie.search("hell"));
    assertFalse(trie.search("helloa"));
    assertTrue(trie.search("hello"));
    assertTrue(trie.startsWith("hell"));
    assertFalse(trie.startsWith("helloa"));
    assertTrue(trie.startsWith("hello"));
  }
}
