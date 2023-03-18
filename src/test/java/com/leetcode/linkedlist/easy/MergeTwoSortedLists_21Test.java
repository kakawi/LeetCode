package com.leetcode.linkedlist.easy;

import static org.junit.jupiter.api.Assertions.*;

import com.leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

class MergeTwoSortedLists_21Test {

  private final MergeTwoSortedLists_21 solution = new MergeTwoSortedLists_21_Base();

  @Test
  void mergeTwoLists_example1() {
    // given
    final ListNode list1 = ListNodeUtil.generateListOfNodes(1, 2, 4);
    final ListNode list2 = ListNodeUtil.generateListOfNodes(1, 3, 4);

    // expected
    final ListNode expected = ListNodeUtil.generateListOfNodes(1, 1, 2, 3, 4, 4);

    // when
    final ListNode result = solution.mergeTwoLists(list1, list2);

    // then
    assertEquals(expected, result);
  }

  @Test
  void mergeTwoLists_example2() {
    // given
    final ListNode list1 = ListNodeUtil.generateListOfNodes();
    final ListNode list2 = ListNodeUtil.generateListOfNodes();

    // when
    final ListNode result = solution.mergeTwoLists(list1, list2);

    // then
    assertNull(result);
  }

  @Test
  void mergeTwoLists_example3() {
    // given
    final ListNode list1 = ListNodeUtil.generateListOfNodes();
    final ListNode list2 = ListNodeUtil.generateListOfNodes(0);

    // expected
    final ListNode expected = ListNodeUtil.generateListOfNodes(0);

    // when
    final ListNode result = solution.mergeTwoLists(list1, list2);

    // then
    assertEquals(expected, result);
  }
}