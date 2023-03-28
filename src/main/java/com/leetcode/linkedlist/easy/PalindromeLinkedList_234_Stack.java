package com.leetcode.linkedlist.easy;

import com.leetcode.linkedlist.ListNode;
import java.util.Stack;

public class PalindromeLinkedList_234_Stack implements PalindromeLinkedList_234 {

  @Override
  public boolean isPalindrome(ListNode head) {
    final Stack<ListNode> stack = new Stack<>();
    ListNode currentNode = head;
    while (currentNode != null) {
      stack.add(currentNode);
      currentNode = currentNode.next;
    }

    while (!stack.isEmpty()) {
      final ListNode node = stack.pop();
      if (head.val != node.val) return false;
      head = head.next;
    }

    return true;
  }
}
