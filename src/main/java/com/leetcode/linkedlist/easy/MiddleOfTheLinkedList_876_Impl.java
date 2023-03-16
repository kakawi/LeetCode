package com.leetcode.linkedlist.easy;

import com.leetcode.linkedlist.ListNode;

public class MiddleOfTheLinkedList_876_Impl implements MiddleOfTheLinkedList_876 {

  /**
   * Use slow and fast pointer
   */
  @Override
  public ListNode middleNode(ListNode head) {
    ListNode singleJump = head;
    ListNode doubleJump = head;
    while (doubleJump != null && doubleJump.next != null) {
      singleJump = singleJump.next;
      doubleJump = doubleJump.next.next;
    }
    return singleJump;
  }
}
