package com.leetcode.binarysearchtree.medium;

import com.leetcode.binarysearchtree.TreeNode;

public class Lowest_Common_Ancestor_of_a_Binary_Search_Tree_235 {

  public static void main(String[] args) {
    final Lowest_Common_Ancestor_of_a_Binary_Search_Tree_235 solution = new Lowest_Common_Ancestor_of_a_Binary_Search_Tree_235();
  }

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    while (root != null) {
      if (root.val < p.val && root.val < q.val) {
        root = root.right;
        continue;
      } else if (root.val > p.val && root.val > q.val) {
        root = root.left;
        continue;
      }
      return root;
    }
    return null;
  }
}
