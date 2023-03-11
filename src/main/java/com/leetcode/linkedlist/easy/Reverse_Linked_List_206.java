package com.leetcode.linkedlist.easy;

import static com.leetcode.linkedlist.ListNode.generateListOfNodes;

import com.leetcode.linkedlist.ListNode;

public class Reverse_Linked_List_206 {

  public static void main(String[] args) {
    final Reverse_Linked_List_206 solution = new Reverse_Linked_List_206();
    solution.reverseList(generateListOfNodes(1, 2, 3, 4, 5));
  }

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
