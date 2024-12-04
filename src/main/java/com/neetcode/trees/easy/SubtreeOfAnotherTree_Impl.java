package com.neetcode.trees.easy;

import com.common.TreeNode;

public class SubtreeOfAnotherTree_Impl implements SubtreeOfAnotherTree {
  public boolean isSubtree(TreeNode root, TreeNode subRoot) {
    return dfs(root, subRoot);
  }

  private boolean dfs(TreeNode node, TreeNode subRoot) {
    if (node == null) {
      return false;
    }

    if (node.val == subRoot.val) {
      boolean isTheSameTree = isTheSameTree(node, subRoot);
      if (isTheSameTree) {
        return true;
      }
    }
    return dfs(node.left, subRoot) || dfs(node.right, subRoot);
  }

  private boolean isTheSameTree(TreeNode node, TreeNode subNode) {
    if (node == null && subNode == null) {
      return true;
    }
    if (node == null || subNode == null || node.val != subNode.val) {
      return false;
    }
    return isTheSameTree(node.left, subNode.left) && isTheSameTree(node.right, subNode.right);
  }
}
