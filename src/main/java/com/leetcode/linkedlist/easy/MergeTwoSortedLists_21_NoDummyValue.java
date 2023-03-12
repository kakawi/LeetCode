package com.leetcode.linkedlist.easy;

import com.leetcode.linkedlist.ListNode;

public class MergeTwoSortedLists_21_NoDummyValue implements MergeTwoSortedLists_21 {

  private ListNode list1;
  private ListNode list2;

  @Override
  public ListNode mergeTwoLists(ListNode plist1, ListNode plist2) {
    list1 = plist1;
    list2 = plist2;

    ListNode tail;
    final ListNode head = getSmallestNode();
    tail = head;

    ListNode next;
    while ((next = getSmallestNode()) != null) {
      tail.next = next;
      tail = next;
    }

    return head;
  }

  private ListNode getSmallestNode() {
    if (list1 == null) {
      if (list2 != null) {
        ListNode tmp = list2;
        list2 = list2.next;
        return tmp;
      }
      return null;
    }
    if (list2 == null) {
      ListNode tmp = list1;
      list1 = list1.next;
      return tmp;
    }
    if (list1.val < list2.val) {
      ListNode tmp = list1;
      list1 = list1.next;
      return tmp;
    } else {
      ListNode tmp = list2;
      list2 = list2.next;
      return tmp;
    }

  }
}
