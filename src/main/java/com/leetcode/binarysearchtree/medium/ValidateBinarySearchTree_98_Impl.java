package com.leetcode.binarysearchtree.medium;

import com.leetcode.binarysearchtree.TreeNode;
import java.util.Stack;

public class ValidateBinarySearchTree_98_Impl implements ValidateBinarySearchTree_98 {

  /**
   * InOrder traversal + check prevValue
   */
  @Override
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
      if (prevValue >= root.val) {
        return false;
      }
      prevValue = root.val;
      root = root.right;
    }

    return true;
  }
}
