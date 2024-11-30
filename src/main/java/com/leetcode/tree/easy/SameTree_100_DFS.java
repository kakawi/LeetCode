package com.leetcode.tree.easy;

import com.common.TreeNode;

public class SameTree_100_DFS implements SameTree_100 {

  @Override
  public boolean isSameTree(final TreeNode p, final TreeNode q) {
    if (p == null && q == null) return true;
    if (p == null || q == null) return false;
    if (p.val != q.val) return false;
    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
  }
}
