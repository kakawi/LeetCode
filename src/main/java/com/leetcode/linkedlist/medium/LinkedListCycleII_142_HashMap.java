package com.leetcode.linkedlist.medium;

import com.leetcode.linkedlist.ListNode;
import java.util.HashMap;
import java.util.Map;

public class LinkedListCycleII_142_HashMap implements LinkedListCycleII_142 {

  /**
   * Solution with Map
   */
  @Override
  public ListNode detectCycle(ListNode head) {
    if (head == null) {
      return null;
    }
    Map<ListNode, Boolean> map = new HashMap<>();

    while (head.next != null) {
      if (map.getOrDefault(head, false)) {
        return head;
      }
      map.put(head, true);
      head = head.next;
    }
    return null;
  }
}
