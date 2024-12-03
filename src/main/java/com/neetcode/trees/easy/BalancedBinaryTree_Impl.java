package com.neetcode.trees.easy;

import com.common.TreeNode;

/**
 * We check if node is balanced + memoization of the height
 */
public class BalancedBinaryTree_Impl implements BalancedBinaryTree {
  public boolean isBalanced(TreeNode root) {
    int[] result = dfs(root);
    return result[0] == 1;
  }

  private int[] dfs(TreeNode node) {
    if (node == null) {
      return new int[] { 1, 0 };
    }
    int[] left = dfs(node.left);
    int[] right = dfs(node.right);

    boolean isBalanced = left[0] == 1 && right[0] == 1;
    isBalanced &= Math.abs(left[1] - right[1]) <= 1;
    int currentHeight = Math.max(left[1], right[1]) + 1;
    return new int[] { isBalanced ? 1 : 0, currentHeight };
  }
}
