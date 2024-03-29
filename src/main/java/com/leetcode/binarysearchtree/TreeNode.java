package com.leetcode.binarysearchtree;

import java.util.Objects;

public class TreeNode {

  public int val;
  public TreeNode left;
  public TreeNode right;

  public TreeNode() {
  }

  public TreeNode(int val) {
    this.val = val;
  }

  public TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TreeNode node = (TreeNode) o;
    return val == node.val && Objects.equals(left, node.left) && Objects.equals(right, node.right);
  }

  @Override
  public int hashCode() {
    return Objects.hash(val);
  }
}
