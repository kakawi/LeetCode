package com.leetcode.tree.easy;

import com.leetcode.tree.TreeNode;

/**
 * The idea of this task it to find the max sum of depths of left and right subtrees.
 */
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

    final int leftLength = dfs(root.left, maxDiameter);
    final int rightLength = dfs(root.right, maxDiameter);

    final int currentDiameter = leftLength + rightLength;
    maxDiameter[0] = Math.max(maxDiameter[0], currentDiameter);

    return Math.max(leftLength, rightLength) + 1;
  }
}
