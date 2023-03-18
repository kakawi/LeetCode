package com.leetcode.linkedlist.medium;

import com.leetcode.linkedlist.ListNode;

public class LinkedListCycleII_142_Base implements LinkedListCycleII_142 {

  /**
   * Solution with slow and fast pointers
   */
  @Override
  public ListNode detectCycle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      // the loop exists
      if (slow == fast) {
        break;
      }
    }
    // double check that loop was ended because FAST reached the end
    if (slow != fast) {
      return null;
    }

    // finding the beginning of the cycle
    while (head != slow) {
      head = head.next;
      slow = slow.next;
    }
    return head;
  }

}
