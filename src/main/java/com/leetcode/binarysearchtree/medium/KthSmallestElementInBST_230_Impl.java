package com.leetcode.binarysearchtree.medium;

import com.leetcode.binarysearchtree.TreeNode;
import java.util.Stack;

public class KthSmallestElementInBST_230_Impl implements KthSmallestElementInBST_230 {

  @Override
  public int kthSmallest(TreeNode root, int k) {
    Stack<TreeNode> stack = new Stack<>();

    while (!stack.isEmpty() || root != null) {
      while (root != null) {
        stack.add(root);
        root = root.left;
      }
      root = stack.pop();
      if (--k == 0) {
        return root.val;
      }
      root = root.right;
    }
    return 0;
  }

  public int kthSmallest_morris(TreeNode root, int k) {
    int count = 0;
    TreeNode curr = root;
    while (curr != null) {
      if (curr.left == null) {
        count++;
        if (count == k) {
          break;
        }
        curr = curr.right;
      } else {
        TreeNode prev = curr.left;
        while (prev.right != null && prev.right != curr) {
          prev = prev.right;
        }
        if (prev.right == null) {
          prev.right = curr;
          curr = curr.left;
        } else {
          prev.right = null;
          if (++count == k) {
            break;
          }
          curr = curr.right;
        }
      }
    }
    return curr.val;
  }
}
