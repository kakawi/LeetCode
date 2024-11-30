package com.leetcode.tree.easy;

import com.common.TreeNode;

public class InvertBinaryTree_226_Impl implements InvertBinaryTree_226 {

  @Override
  public TreeNode invertTree(final TreeNode node) {
    if (node == null) {
      return null;
    }

    final TreeNode tmp = node.left;
    node.left = invertTree(node.right);
    node.right = invertTree(tmp);

    return node;
  }
}
