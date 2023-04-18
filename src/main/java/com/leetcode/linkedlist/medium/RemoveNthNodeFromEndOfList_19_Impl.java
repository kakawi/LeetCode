package com.leetcode.linkedlist.medium;

import com.leetcode.linkedlist.ListNode;

public class RemoveNthNodeFromEndOfList_19_Impl implements RemoveNthNodeFromEndOfList_19 {

  @Override
  public ListNode removeNthFromEnd(final ListNode head, int n) {
    ListNode backward = head;
    ListNode forward = head;
    while (n-- > 0) {
      forward = forward.next;
    }

    // case when you need to remove the first element
    if (forward == null) {
      return head.next;
    }

    while (forward.next != null) {
      forward = forward.next;
      backward = backward.next;
    }

    backward.next = backward.next.next;

    return head;
  }
}
