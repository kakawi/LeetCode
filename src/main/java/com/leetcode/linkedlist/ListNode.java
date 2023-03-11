package com.leetcode.linkedlist;

public class ListNode {

  public int val;
  public ListNode next;

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public static ListNode generateListOfNodes(int... values) {
    ListNode prev = null;
    for (int i = values.length - 1; i >= 0; i--) {
      prev = new ListNode(values[i], prev);
    }
    return prev;
  }

  public static ListNode generateListWithCycle(int[] values, int cycleIndex) {
    ListNode prev = null;
    ListNode cycleNode = null;
    ListNode tail = null;
    for (int i = values.length - 1; i >= 0; i--) {
      prev = new ListNode(values[i], prev);
      if (i == values.length - 1) {
        tail = prev;
      }
      if (i == cycleIndex) {
        cycleNode = prev;
      }
    }
    tail.next = cycleNode;
    return prev;
  }
}
