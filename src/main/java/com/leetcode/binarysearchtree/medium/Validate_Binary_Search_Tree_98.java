package com.leetcode.binarysearchtree.medium;

import com.leetcode.binarysearchtree.TreeNode;
import java.util.Stack;

public class Validate_Binary_Search_Tree_98 {

  public static void main(String[] args) {
    final Validate_Binary_Search_Tree_98 solution = new Validate_Binary_Search_Tree_98();
  }

  public boolean isValidBST(TreeNode root) {
    if (root == null) {
      return true;
    }

    long prevValue = Long.MIN_VALUE; // Integer.MIN_VALUE is not enough

    Stack<TreeNode> stack = new Stack<>();
    while (!stack.isEmpty() || root != null) {
      while (root != null) {
        stack.push(root);
        root = root.left;
      }
      root = stack.pop();
      if (root.val <= prevValue) {
        return false;
      }
      prevValue = root.val;
      root = root.right;
    }

    return true;
  }
}


