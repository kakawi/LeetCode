package com.leetcode.linkedlist.easy;

import static org.junit.jupiter.api.Assertions.*;

import com.leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

class PalindromeLinkedList_234Test {

  private final PalindromeLinkedList_234 solution = new PalindromeLinkedList_234_Impl();

  @Test
  void isPalindrome_example1() {
    // given
    final ListNode head = ListNodeUtil.generateListOfNodes(1, 2, 2, 1);

    // when
    final boolean result = solution.isPalindrome(head);

    // then
    assertTrue(result);
  }

  @Test
  void isPalindrome_example2() {
    // given
    final ListNode head = ListNodeUtil.generateListOfNodes(1, 2);

    // when
    final boolean result = solution.isPalindrome(head);

    // then
    assertFalse(result);
  }
}
