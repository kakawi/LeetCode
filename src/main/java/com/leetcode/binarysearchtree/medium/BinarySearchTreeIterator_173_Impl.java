package com.leetcode.binarysearchtree.medium;

import com.leetcode.binarysearchtree.TreeNode;
import java.util.Stack;

public class BinarySearchTreeIterator_173_Impl implements BinarySearchTreeIterator_173 {

  private final Stack<TreeNode> stack = new Stack<>();

  public BinarySearchTreeIterator_173_Impl(final TreeNode root) {
    updateStack(root);
  }

  @Override
  public int next() {
    final TreeNode tmp = stack.pop();
    updateStack(tmp.right);
    return tmp.val;
  }

  @Override
  public boolean hasNext() {
    return !stack.isEmpty();
  }

  private void updateStack(TreeNode node) {
    while (node != null) {
      stack.add(node);
      node = node.left;
    }
  }
}
