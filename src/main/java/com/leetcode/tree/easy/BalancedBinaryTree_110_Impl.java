package com.leetcode.tree.easy;

import com.leetcode.tree.TreeNode;

/**
 * Not to use an additional space to save intermediate results (memoization) we combine
 * meaningful value with logic value:
 * -1 is logic false
 * [0..] is meaningful value
 */
public class BalancedBinaryTree_110_Impl implements BalancedBinaryTree_110 {

  @Override
  public boolean isBalanced(final TreeNode root) {
    if (root == null) {
      return true;
    }

    return calculateDepth(root) != -1;
  }

  private int calculateDepth(final TreeNode node) {
    if (node == null) {
      return 0;
    }
    final int leftDepth = calculateDepth(node.left);
    final int rightDepth = calculateDepth(node.right);
    if (leftDepth == -1 || rightDepth == -1) {
      return -1;
    }
    if (Math.abs(leftDepth - rightDepth) <= 1) {
      return Math.max(leftDepth, rightDepth) + 1;
    }

    return -1;
  }
}
