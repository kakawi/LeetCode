package com.leetcode.design.medium;

/**
 * The idea that every Node in the Stack contains Min value for the rest of the Stack
 */
public class MinStack_155_Impl implements MinStack_155 {

  private Node head;

  public void push(int x) {
    if (head == null) {
      head = new Node(x, x, null);
    } else {
      head = new Node(x, Math.min(x, head.min), head);
    }
  }

  public void pop() {
    head = head.next;
  }

  public int top() {
    return head.val;
  }

  public int getMin() {
    return head.min;
  }

  private static class Node {
    int val;
    int min;
    Node next;

    private Node(int val, int min, Node next) {
      this.val = val;
      this.min = min;
      this.next = next;
    }
  }
}
