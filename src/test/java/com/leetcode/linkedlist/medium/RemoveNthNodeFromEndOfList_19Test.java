package com.leetcode.linkedlist.medium;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.leetcode.linkedlist.ListNode;
import com.leetcode.linkedlist.easy.ListNodeUtil;
import org.junit.jupiter.api.Test;

class RemoveNthNodeFromEndOfList_19Test {

  private final RemoveNthNodeFromEndOfList_19 solution = new RemoveNthNodeFromEndOfList_19_Impl();

  @Test
  void removeNthFromEnd_example1() {
    // given
    final ListNode head = ListNodeUtil.generateListOfNodes(1, 2, 3, 4, 5);
    final int n = 2;

    // expected
    final ListNode expected = ListNodeUtil.generateListOfNodes(1, 2, 3, 5);

    // when
    final ListNode result = solution.removeNthFromEnd(head, n);

    // then
    assertTrue(ListNodeUtil.areIdentical(expected, result));
  }

  @Test
  void removeNthFromEnd_example2() {
    // given
    final ListNode head = ListNodeUtil.generateListOfNodes(1);
    final int n = 1;

    // when
    final ListNode result = solution.removeNthFromEnd(head, n);

    // then
    assertNull(result);
  }

  @Test
  void removeNthFromEnd_example3() {
    // given
    final ListNode head = ListNodeUtil.generateListOfNodes(1, 2);
    final int n = 1;

    // expected
    final ListNode expected = ListNodeUtil.generateListOfNodes(1);

    // when
    final ListNode result = solution.removeNthFromEnd(head, n);

    // then
    assertTrue(ListNodeUtil.areIdentical(expected, result));
  }

  @Test
  void removeNthFromEnd_example4() {
    // given
    final ListNode head = ListNodeUtil.generateListOfNodes(1, 2);
    final int n = 2;

    // expected
    final ListNode expected = ListNodeUtil.generateListOfNodes(2);

    // when
    final ListNode result = solution.removeNthFromEnd(head, n);

    // then
    assertTrue(ListNodeUtil.areIdentical(expected, result));
  }

  @Test
  void removeNthFromEnd_example5() {
    // given
    final ListNode head = ListNodeUtil.generateListOfNodes(1, 2, 3);
    final int n = 3;

    // expected
    final ListNode expected = ListNodeUtil.generateListOfNodes(2, 3);

    // when
    final ListNode result = solution.removeNthFromEnd(head, n);

    // then
    assertTrue(ListNodeUtil.areIdentical(expected, result));
  }
}
