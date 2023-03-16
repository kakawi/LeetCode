package com.leetcode.linkedlist.easy;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

class MiddleOfTheLinkedList_876Test {

  private final MiddleOfTheLinkedList_876 solution = new MiddleOfTheLinkedList_876_Impl();

  @Test
  void middleNode_example1() {
    // given
    ListNode input = ListNodeUtil.generateListOfNodes(1, 2, 3, 4, 5);

    // expected
    final ListNode expected = ListNodeUtil.generateListOfNodes(3, 4, 5);

    // when
    final ListNode result = solution.middleNode(input);

    // then
    assertTrue(ListNodeUtil.areIdentical(expected, result));
  }

  @Test
  void middleNode_example2() {
    // given
    ListNode input = ListNodeUtil.generateListOfNodes(1, 2, 3, 4, 5, 6);

    // expected
    final ListNode expected = ListNodeUtil.generateListOfNodes(4, 5, 6);

    // when
    final ListNode result = solution.middleNode(input);

    // then
    assertTrue(ListNodeUtil.areIdentical(expected, result));
  }
}
