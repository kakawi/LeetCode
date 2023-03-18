package com.leetcode.linkedlist.easy;

import com.leetcode.linkedlist.ListNode;

public class ReverseLinkedList_206_Impl implements ReverseLinkedList_206 {

  @Override
  public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    while (head != null) {
      ListNode tmp = head;
      head = tmp.next;
      tmp.next = prev;
      prev = tmp;
    }

    return prev;
  }
}
