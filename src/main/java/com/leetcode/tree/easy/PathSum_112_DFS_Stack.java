package com.leetcode.tree.easy;

import java.util.Stack;

import com.common.TreeNode;

public class PathSum_112_DFS_Stack implements PathSum_112 {
  @Override
  public boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) {
      return false;
    }
    Stack<TreeElement> stack = new Stack<>();
    TreeElement currentElement = new TreeElement(root, root.val);
    while (!stack.isEmpty() || currentElement != null) {
      while (currentElement != null) {
        stack.add(currentElement);
        currentElement = currentElement.getLeft();
      }

      TreeElement element = stack.pop();
      if (element.isLeaf() && element.sum == targetSum) {
        return true;
      }
      currentElement = element.getRight();
    }
    return false;
  }

  private static class TreeElement {
    final TreeNode node;
    final int sum;

    private TreeElement(TreeNode node, int sum) {
      this.node = node;
      this.sum = sum;
    }

    public boolean isLeaf() {
      return node.left == null && node.right == null;
    }

    public TreeElement getLeft() {
      if (node.left == null) {
        return null;
      }
      return new TreeElement(node.left, sum + node.left.val);
    }

    public TreeElement getRight() {
      if (node.right == null) {
        return null;
      }
      return new TreeElement(node.right, sum + node.right.val);
    }
  }
}
