package com.leetcode.linkedlist.medium;

import com.leetcode.linkedlist.ListNode;
import java.util.HashMap;
import java.util.Map;

public class Linked_List_Cycle_II_142 {

  public static void main(String[] args) {
    final Linked_List_Cycle_II_142 solution = new Linked_List_Cycle_II_142();
    final ListNode listNode = ListNode.generateListWithCycle(new int[]{3, 2, 0, -4}, 1);
    solution.detectCycle(listNode);
  }

  /**
   * Solution with Map
   */
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

  /**
   * Solution with slow and fast pointers
   */
  public ListNode detectCycle2(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      // the loop exists
      if (slow == fast) break;
    }
    // it really reached the end
    if (fast == null || fast.next == null) return null;

    // finding the beginning of the cycle
    while (head != slow) {
      head = head.next;
      slow = slow.next;
    }
    return head;
  }

}
