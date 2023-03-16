package com.leetcode.linkedlist.easy;

import com.leetcode.linkedlist.ListNode;

public class ReverseLinkedList_206_Impl implements ReverseLinkedList_206 {

  @Override
  public ListNode reverseList(ListNode head) {
    if (head == null) {
      return null;
    }
    ListNode prev = null;
    while (head != null) {
      ListNode tmp = head.next;
      head.next = prev;
      prev = head;
      head = tmp;
    }

    return prev;
  }
}
