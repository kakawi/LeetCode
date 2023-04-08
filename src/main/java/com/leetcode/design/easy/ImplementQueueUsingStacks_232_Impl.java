package com.leetcode.design.easy;

import java.util.Stack;

public class ImplementQueueUsingStacks_232_Impl implements ImplementQueueUsingStacks_232 {

  private final Stack<Integer> input = new Stack<>();
  private final Stack<Integer> output = new Stack<>();

  @Override
  public void push(final int x) {
    input.push(x);
  }

  @Override
  public int pop() {
    if (output.isEmpty()) {
      rearrange();
    }
    return output.pop();
  }

  @Override
  public int peek() {
    if (output.isEmpty()) {
      rearrange();
    }
    return output.peek();
  }

  @Override
  public boolean empty() {
    return input.empty() && output.empty();
  }

  private void rearrange() {
    while (!input.empty()) {
      output.push(input.pop());
    }
  }
}
