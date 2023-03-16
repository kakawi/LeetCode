package com.leetcode.linkedlist.easy;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

class ReverseLinkedList_206Test {

  private final ReverseLinkedList_206 solution = new ReverseLinkedList_206_Impl();

  @Test
  void reverseList_example1() {
    // given
    final ListNode input = ListNodeUtil.generateListOfNodes(1, 2, 3, 4, 5);

    // expected
    final ListNode expected = ListNodeUtil.generateListOfNodes(5, 4, 3, 2, 1);

    // when
    final ListNode result = solution.reverseList(input);

    // then
    assertTrue(ListNodeUtil.areIdentical(expected, result));
  }

  @Test
  void reverseList_example2() {
    // given
    final ListNode input = ListNodeUtil.generateListOfNodes(1, 2);

    // expected
    final ListNode expected = ListNodeUtil.generateListOfNodes(2, 1);

    // when
    final ListNode result = solution.reverseList(input);

    // then
    assertTrue(ListNodeUtil.areIdentical(expected, result));
  }

  @Test
  void reverseList_example3_null() {
    // expected
    final ListNode expected = null;

    // when
    final ListNode result = solution.reverseList(null);

    // then
    assertTrue(ListNodeUtil.areIdentical(expected, result));
  }
}
