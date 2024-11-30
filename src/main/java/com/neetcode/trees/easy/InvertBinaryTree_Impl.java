package com.neetcode.trees.easy;

import com.common.TreeNode;

public class InvertBinaryTree_Impl implements InvertBinaryTree {
  public TreeNode invertTree(TreeNode root) {
    if (root == null) {
      return null;
    }
    TreeNode tmp = root.left;
    root.left = invertTree(root.right);
    root.right = invertTree(tmp);

    return root;
  }
}
