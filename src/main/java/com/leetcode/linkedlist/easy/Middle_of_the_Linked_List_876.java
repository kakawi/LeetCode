package com.leetcode.linkedlist.easy;

import com.leetcode.linkedlist.ListNode;

public class Middle_of_the_Linked_List_876 {

  public static void main(String[] args) {
    final Middle_of_the_Linked_List_876 solution = new Middle_of_the_Linked_List_876();
//    solution.middleNode(ListNode.generateListOfNodes(1, 2, 3, 4, 5));
    solution.middleNode(ListNode.generateListOfNodes(1, 2, 3, 4, 5, 6));
  }

  /**
   * Use slow and fast pointer
   */
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
