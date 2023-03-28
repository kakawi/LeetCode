package com.leetcode.linkedlist.medium;

import com.leetcode.linkedlist.ListNode;

public class RemoveNthNodeFromEndOfList_19_Impl implements RemoveNthNodeFromEndOfList_19 {

  @Override
  public ListNode removeNthFromEnd(final ListNode head, final int n) {
    ListNode slow = head;
    ListNode fast = head;
    for (int i = 1; i <= n; i++) {
      fast = fast.next;
    }

    if (fast == null) {
      return head.next;
    }

    while (fast.next != null) {
      fast = fast.next;
      slow = slow.next;
    }

    slow.next = slow.next.next;

    return head;
  }
}
