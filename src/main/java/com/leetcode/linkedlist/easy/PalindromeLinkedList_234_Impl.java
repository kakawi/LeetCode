package com.leetcode.linkedlist.easy;

import com.leetcode.linkedlist.ListNode;
import java.util.List;
import java.util.Stack;

public class PalindromeLinkedList_234_Impl implements PalindromeLinkedList_234 {

  @Override
  public boolean isPalindrome(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }

    ListNode prev = null;
    while (slow != null) {
      ListNode tmp = slow;
      slow = slow.next;
      tmp.next = prev;
      prev = tmp;
    }

    while (prev != null) {
      if (head.val != prev.val) return false;
      head = head.next;
      prev = prev.next;
    }

    return true;
  }
}
