package com.leetcode.tree.easy;

import com.leetcode.tree.TreeNode;

public class SymmetricTree_101_Impl implements SymmetricTree_101 {

  @Override
  public boolean isSymmetric(final TreeNode root) {
    return isSymmetric(root.left, root.right);
  }

  private boolean isSymmetric(final TreeNode p, final TreeNode q) {
    if (p == null && q == null) return true;
    if (p == null || q == null) return false;
    if (p.val != q.val) return false;
    return isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
  }
}
