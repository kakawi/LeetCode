package com.leetcode.linkedlist.medium;

import com.leetcode.linkedlist.ListNode;

public class SortList_148_Impl implements SortList_148 {

  @Override
  public ListNode sortList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

    // step 1. cut the list to two halves
    ListNode prev = null;
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
      prev = slow;
      slow = slow.next;
      fast = fast.next.next;
    }

    prev.next = null;

    // step 2. sort each half
    ListNode leftList = sortList(head);
    ListNode rightList = sortList(slow);

    // step 3. merge leftList and rightList
    return merge(leftList, rightList);
  }

  private ListNode merge(ListNode leftList, ListNode rightList) {
    final ListNode dummy = new ListNode(0);
    ListNode currentNode = dummy;

    while (leftList != null && rightList != null) {
      if (leftList.val < rightList.val) {
        currentNode.next = leftList;
        leftList = leftList.next;
      } else {
        currentNode.next = rightList;
        rightList = rightList.next;
      }
      currentNode = currentNode.next;
    }

    if (leftList != null) {
      currentNode.next = leftList;
    }

    if (rightList != null) {
      currentNode.next = rightList;
    }

    return dummy.next;
  }
}
