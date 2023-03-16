package com.leetcode.linkedlist.medium;

import com.leetcode.linkedlist.ListNode;
import java.util.HashMap;
import java.util.Map;

public class LinkedListCycleII_142_2Jumps implements LinkedListCycleII_142 {

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
    // it really reached the end
    if (fast == null || fast.next == null) {
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
