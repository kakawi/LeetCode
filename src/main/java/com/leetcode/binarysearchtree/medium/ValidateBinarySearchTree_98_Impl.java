package com.leetcode.binarysearchtree.medium;

import com.leetcode.binarysearchtree.TreeNode;
import java.util.Stack;

public class ValidateBinarySearchTree_98_Impl implements ValidateBinarySearchTree_98 {

  /**
   * InOrder traversal + check prevValue
   */
  @Override
  public boolean isValidBST(final TreeNode root) {
    final Stack<TreeNode> stack = new Stack<>();
    long prevValue = Long.MIN_VALUE; // Integer.MIN_VALUE is not enough

    TreeNode currentNode = root;
    while (!stack.isEmpty() || currentNode != null) {
      while (currentNode != null) {
        stack.push(currentNode);
        currentNode = currentNode.left;
      }
      currentNode = stack.pop();
      // the validation
      if (prevValue >= currentNode.val) {
        return false;
      }
      prevValue = currentNode.val;
      currentNode = currentNode.right;
    }

    return true;
  }
}
