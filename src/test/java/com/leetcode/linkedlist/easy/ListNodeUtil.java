package com.leetcode.linkedlist.easy;

import com.leetcode.linkedlist.ListNode;

public class ListNodeUtil {

  public static ListNode generateListOfNodes(int... values) {
    ListNode prev = null;
    for (int i = values.length - 1; i >= 0; i--) {
      prev = new ListNode(values[i], prev);
    }
    return prev;
  }

  public static ListNode generateListWithCycle(int[] values, int cycleIndex) {
    ListNode prev = null;
    ListNode cycleNode = null;
    ListNode tail = null;
    for (int i = values.length - 1; i >= 0; i--) {
      prev = new ListNode(values[i], prev);
      if (i == values.length - 1) {
        tail = prev;
      }
      if (i == cycleIndex) {
        cycleNode = prev;
      }
    }
    tail.next = cycleNode;
    return prev;
  }

  public static boolean areIdentical(ListNode list1, ListNode list2) {
    while (list1 != null && list2 != null) {
      if (list1.val != list2.val) {
        return false;
      }
      list1 = list1.next;
      list2 = list2.next;
    }

    return list1 == list2;
  }
}
