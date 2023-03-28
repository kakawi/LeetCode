package com.leetcode.linkedlist.medium;

import com.leetcode.linkedlist.ListNode;

public class OddEvenLinkedList_328_Impl implements OddEvenLinkedList_328 {

  @Override
  public ListNode oddEvenList(final ListNode head) {
    if (head == null) {
      return null;
    }

    ListNode oddPointer = head;
    ListNode evenPointer = head.next;
    final ListNode evenList = evenPointer;

    while (evenPointer != null && evenPointer.next != null) {
      oddPointer.next = evenPointer.next;
      oddPointer = oddPointer.next;

      evenPointer.next = oddPointer.next;
      evenPointer = evenPointer.next;
    }

    oddPointer.next = evenList;

    return head;
  }
}
