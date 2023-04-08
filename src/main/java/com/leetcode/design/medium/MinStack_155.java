package com.leetcode.design.medium;

/**
 * Ref: <a href="https://leetcode.com/problems/min-stack">155. Min Stack</a>
 */
public interface MinStack_155 {

  void push(int val);

  void pop();

  int top();

  int getMin();
}
