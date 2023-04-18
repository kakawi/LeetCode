package com.leetcode.linkedlist.easy;

import com.leetcode.linkedlist.ListNode;

public class LinkedListCycle_141_Impl implements LinkedListCycle_141 {

  @Override
  public boolean hasCycle(final ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (fast == slow) return true;
    }
    return false;
  }
}
