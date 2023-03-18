package com.leetcode.linkedlist.easy;

import com.leetcode.linkedlist.ListNode;

/**
 * Dummy value
 */
public class MergeTwoSortedLists_21_Base implements MergeTwoSortedLists_21 {

  @Override
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    final ListNode dummy = new ListNode(937);
    ListNode current = dummy;

    while (list1 != null && list2 != null) {
      if (list1.val < list2.val) {
        current.next = list1;
        list1 = list1.next;
      } else {
        current.next = list2;
        list2 = list2.next;
      }
      current = current.next;
    }

    if (list1 != null) {
      current.next = list1;
    } else {
      current.next = list2;
    }

    return dummy.next;
  }
}
