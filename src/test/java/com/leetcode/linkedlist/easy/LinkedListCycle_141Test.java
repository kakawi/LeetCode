package com.leetcode.linkedlist.easy;

import static org.junit.jupiter.api.Assertions.*;

import com.leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

class LinkedListCycle_141Test {

  private final LinkedListCycle_141 solution = new LinkedListCycle_141_Impl();

  @Test
  void hasCycle_example1() {
    // given
    final ListNode head = ListNodeUtil.generateListWithCycle(new int[]{3, 2, 0, -4}, 1);

    // when
    final boolean result = solution.hasCycle(head);

    // then
    assertTrue(result);
  }

  @Test
  void hasCycle_example2() {
    // given
    final ListNode head = ListNodeUtil.generateListWithCycle(new int[]{1,2}, 0);

    // when
    final boolean result = solution.hasCycle(head);

    // then
    assertTrue(result);
  }

  @Test
  void hasCycle_example3() {
    // given
    final ListNode head = ListNodeUtil.generateListWithCycle(new int[]{1}, -1);

    // when
    final boolean result = solution.hasCycle(head);

    // then
    assertFalse(result);
  }
}
