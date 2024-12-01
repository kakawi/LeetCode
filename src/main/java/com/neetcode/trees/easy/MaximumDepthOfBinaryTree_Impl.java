package com.neetcode.trees.easy;

import com.common.TreeNode;

public class MaximumDepthOfBinaryTree_Impl implements MaximumDepthOfBinaryTree {
  public int maxDepth(TreeNode node) {
    if (node == null) {
      return 0;
    }

    return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));
  }
}
