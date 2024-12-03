package com.neetcode.trees.easy;

import com.common.TreeNode;

public class DiameterOfBinaryTree_Impl implements DiameterOfBinaryTree {
  public int diameterOfBinaryTree(TreeNode root) {
    int[] result = { 0 };
    getDepth(root, result);
    return result[0];
  }

  private int getDepth(TreeNode node, int[] result) {
    if (node == null) {
      return 0;
    }
    int leftDepth = getDepth(node.left, result);
    int rightDepth = getDepth(node.right, result);
    int currentMax = Math.max(leftDepth, rightDepth);
    result[0] = Math.max(result[0], leftDepth + rightDepth);
    return currentMax + 1;
  }
}
