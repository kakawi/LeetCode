package com.leetcode.tree.easy;

import com.leetcode.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class PathSum_112_BFS implements PathSum_112 {

  @Override
  public boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) {
      return false;
    }

    final Queue<TreeElement> queue = new LinkedList<>();
    queue.add(new TreeElement(root, 0));

    while (queue.size() != 0) {
      final TreeElement currentElement = queue.poll();
      if (currentElement.node == null) {
        continue;
      }

      int newSum = currentElement.newSum();
      if (currentElement.isLeaf() && newSum == targetSum) {
        return true;
      }

      queue.add(new TreeElement(currentElement.node.right, newSum));
      queue.add(new TreeElement(currentElement.node.left, newSum));
    }

    return false;
  }

  /**
   * Because we're not using Recursion we need to save a context with a node
   */
  private static class TreeElement {

    public final TreeNode node;
    private final int sum;

    TreeElement(final TreeNode node, final int sum) {
      this.node = node;
      this.sum = sum;
    }

    public boolean isLeaf() {
      return node != null && node.left == null && node.right == null;
    }

    public int newSum() {
      return sum + node.val;
    }
  }
}
