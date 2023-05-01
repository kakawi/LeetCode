package com.leetcode.tree.medium;

import com.leetcode.tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

public class PathSumII_113_NoRecursion implements PathSumII_113 {

  @Override
  public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
    final List<List<Integer>> result = new ArrayList<>();
    final Stack<TreeElement> stack = new Stack<>();
    if (root == null) {
      return result;
    }
    stack.add(new TreeElement(root, null, 0));

    while (!stack.isEmpty()) {
      TreeElement element = stack.pop();
      if (element.isLeaf()) {
        if (element.sumWithThatNode() == targetSum) {
          result.add(element.getPath());
        }
      } else {
        if (element.node.left != null) {
          stack.push(new TreeElement(element.node.left, element, element.sumWithThatNode()));
        }
        if (element.node.right != null) {
          stack.push(new TreeElement(element.node.right, element, element.sumWithThatNode()));
        }
      }

    }

    return result;
  }

  private static class TreeElement {

    public final TreeNode node;
    private final TreeElement parent;
    private final int sum;

    TreeElement(final TreeNode node, final TreeElement parent, final int sum) {
      this.node = node;
      this.parent = parent;
      this.sum = sum;
    }

    public boolean isLeaf() {
      return node != null && node.left == null && node.right == null;
    }

    public int sumWithThatNode() {
      return sum + node.val;
    }

    public List<Integer> getPath() {
      final Deque<Integer> queue = new ArrayDeque<>();
      TreeElement currentNode = this;
      while (currentNode != null) {
        queue.addFirst(currentNode.node.val);
        currentNode = currentNode.parent;
      }
      return new ArrayList<>(queue);
    }
  }
}
