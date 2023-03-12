package com.leetcode.linkedlist.easy;

import com.leetcode.linkedlist.ListNode;

public class Reverse_Linked_List_206 {

  public ListNode reverseList(ListNode head) {
    if (head == null) {
      return null;
    }
    ListNode prev = null;
    ListNode current = head;
    while (current != null) {
      ListNode tmp = current.next;
      current.next = prev;
      prev = current;
      current = tmp;
    }

    return prev;
  }
}
