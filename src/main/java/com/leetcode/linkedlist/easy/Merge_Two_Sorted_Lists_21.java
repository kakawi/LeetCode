package com.leetcode.linkedlist.easy;

import static com.leetcode.linkedlist.ListNode.generateListOfNodes;

import com.leetcode.linkedlist.ListNode;

public class Merge_Two_Sorted_Lists_21 {

  public static void main(String[] args) {
    final Merge_Two_Sorted_Lists_21 mergeTwoSortedLists21 = new Merge_Two_Sorted_Lists_21();

    final ListNode listNode1 = generateListOfNodes(1, 2, 4);
    final ListNode listNode2 = generateListOfNodes(1, 3, 4);

//    mergeTwoSortedLists21.mergeTwoLists(listNode1, listNode2);
    mergeTwoSortedLists21.mergeTwoLists2(listNode1, listNode2);
  }

  private ListNode list1;
  private ListNode list2;

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

  public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
    final ListNode dummy = new ListNode(99999);
    ListNode tail = dummy;

    while (list1 != null && list2 != null) {
      if (list1.val < list2.val) {
        tail.next = list1;
        list1 = list1.next;
      } else {
        tail.next = list2;
        list2 = list2.next;
      }
      tail = tail.next;
    }

    if (list1 != null) {
      tail.next = list1;
    } else {
      tail.next = list2;
    }

    return dummy.next;
  }
}

