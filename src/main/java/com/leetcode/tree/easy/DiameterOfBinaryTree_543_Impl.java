package com.leetcode.tree.easy;

import com.leetcode.tree.TreeNode;

public class DiameterOfBinaryTree_543_Impl implements DiameterOfBinaryTree_543 {

  @Override
  public int diameterOfBinaryTree(final TreeNode root) {
    final int[] maxDiameter = new int[1];
    dfs(root, maxDiameter);
    return maxDiameter[0];
  }

  public int dfs(final TreeNode root, final int[] maxDiameter) {
    if (root == null) {
      return 0;
    }

    int leftDiameter = dfs(root.left, maxDiameter);
    int rightDiameter = dfs(root.right, maxDiameter);

    maxDiameter[0] = Math.max(maxDiameter[0], leftDiameter + rightDiameter);

    return 1 + Math.max(leftDiameter, rightDiameter);
  }
}
