package com.leetcode.linkedlist.medium;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.leetcode.linkedlist.ListNode;
import com.leetcode.linkedlist.easy.ListNodeUtil;
import org.junit.jupiter.api.Test;

class OddEvenLinkedList_328Test {

  private final OddEvenLinkedList_328 solution = new OddEvenLinkedList_328_Impl();

  @Test
  void oddEvenList_example1() {
    // given
    final ListNode head = ListNodeUtil.generateListOfNodes(1, 2, 3, 4, 5);

    // expected
    final ListNode expected = ListNodeUtil.generateListOfNodes(1, 3, 5, 2, 4);

    // when
    final ListNode result = solution.oddEvenList(head);

    // then
    assertTrue(ListNodeUtil.areIdentical(expected, result));
  }

  @Test
  void oddEvenList_example2() {
    // given
    final ListNode head = ListNodeUtil.generateListOfNodes(2, 1, 3, 5, 6, 4, 7);

    // expected
    final ListNode expected = ListNodeUtil.generateListOfNodes(2, 3, 6, 7, 1, 5, 4);

    // when
    final ListNode result = solution.oddEvenList(head);

    // then
    assertTrue(ListNodeUtil.areIdentical(expected, result));
  }

  @Test
  void oddEvenList_null() {
    // when
    final ListNode result = solution.oddEvenList(null);

    // then
    assertNull(result);
  }
}
