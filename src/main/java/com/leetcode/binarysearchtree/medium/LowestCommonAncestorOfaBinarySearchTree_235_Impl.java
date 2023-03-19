package com.leetcode.binarysearchtree.medium;

import com.leetcode.binarysearchtree.TreeNode;

public class LowestCommonAncestorOfaBinarySearchTree_235_Impl implements LowestCommonAncestorOfaBinarySearchTree_235 {

  @Override
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    while (root != null) {
      final int currentValue = root.val;
      if (currentValue < p.val && currentValue < q.val) {
        root = root.right;
        continue;
      } else if (currentValue > p.val && currentValue > q.val) {
        root = root.left;
        continue;
      }
      return root;
    }
    return null;
  }
}
