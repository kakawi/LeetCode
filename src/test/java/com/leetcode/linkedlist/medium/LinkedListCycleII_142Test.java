package com.leetcode.linkedlist.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.linkedlist.ListNode;
import com.leetcode.linkedlist.easy.ListNodeUtil;
import org.junit.jupiter.api.Test;

class LinkedListCycleII_142Test {

  private final LinkedListCycleII_142 solution = new LinkedListCycleII_142_Base();

  @Test
  void detectCycle_example1() {
    // given
    final ListNode cycledLinkedList = ListNodeUtil.generateListWithCycle(new int[]{3, 2, 0, -4}, 1);

    // when
    final ListNode result = solution.detectCycle(cycledLinkedList);

    // then
    assertEquals(2, result.val);
  }

  @Test
  void detectCycle_example2() {
    // given
    final ListNode cycledLinkedList = ListNodeUtil.generateListWithCycle(new int[]{1, 2}, 0);

    // when
    final ListNode result = solution.detectCycle(cycledLinkedList);

    // then
    assertEquals(1, result.val);
  }
}
