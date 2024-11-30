package com.leetcode.tree.easy;

import com.common.TreeNode;

public class PathSum_112_DFS implements PathSum_112 {

  @Override
  public boolean hasPathSum(final TreeNode root, final int targetSum) {
    if (root == null) {
      return false;
    }
    return checkPath(root, targetSum);
  }

  private boolean checkPath(final TreeNode node, final int targetSum) {
    if (node == null) {
      return false;
    }
    if (isLeaf(node)) {
      return node.val == targetSum;
    }
    return checkPath(node.left, targetSum - node.val)
        || checkPath(node.right, targetSum - node.val);
  }

  private boolean isLeaf(final TreeNode node) {
    return node.left == null && node.right == null;
  }
}
