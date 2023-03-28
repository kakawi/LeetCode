package com.leetcode.linkedlist.medium;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.leetcode.linkedlist.ListNode;
import com.leetcode.linkedlist.easy.ListNodeUtil;
import org.junit.jupiter.api.Test;

class SortList_148Test {

  private final SortList_148 solution = new SortList_148_Impl();

  @Test
  void sortList_example1() {
    // given
    final ListNode head = ListNodeUtil.generateListOfNodes(4, 2, 1, 3);

    // expected
    final ListNode expected = ListNodeUtil.generateListOfNodes(1, 2, 3, 4);

    // when
    final ListNode result = solution.sortList(head);

    // then
    assertTrue(ListNodeUtil.areIdentical(expected, result));
  }

  @Test
  void sortList_example2() {
    // given
    final ListNode head = ListNodeUtil.generateListOfNodes(-1, 5, 3, 4, 0);

    // expected
    final ListNode expected = ListNodeUtil.generateListOfNodes(-1, 0, 3, 4, 5);

    // when
    final ListNode result = solution.sortList(head);

    // then
    assertTrue(ListNodeUtil.areIdentical(expected, result));
  }

  @Test
  void sortList_null() {
    // when
    final ListNode result = solution.sortList(null);

    // then
    assertNull(result);
  }
}
