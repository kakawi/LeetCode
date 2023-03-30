package com.leetcode.tree.easy;

import com.leetcode.tree.TreeNode;

public class PathSum_112_DFS implements PathSum_112 {

  @Override
  public boolean hasPathSum(final TreeNode root, final int targetSum) {
    if (root == null) {
      return false;
    }
    return checkPath(root, 0, targetSum);
  }

  private boolean checkPath(final TreeNode node, int sum, final int targetSum) {
    if (node == null) {
      return false;
    }
    if (isLeaf(node)) {
      return sum + node.val == targetSum;
    }
    sum += node.val;
    return checkPath(node.left, sum, targetSum) || checkPath(node.right, sum, targetSum);
  }

  private boolean isLeaf(final TreeNode node) {
    return node.left == null && node.right == null;
  }
}
