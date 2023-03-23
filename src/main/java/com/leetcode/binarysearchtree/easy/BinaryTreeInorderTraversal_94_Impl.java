package com.leetcode.binarysearchtree.easy;

import com.leetcode.binarysearchtree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal_94_Impl implements BinaryTreeInorderTraversal_94 {

  @Override
  public List<Integer> inorderTraversal(TreeNode root) {
      List<Integer> result = new ArrayList<>();
      if (root == null) {
        return result;
      }

      Stack<TreeNode> stack = new Stack<>();
      while (!stack.isEmpty() || root != null) {
        while (root != null) {
          stack.push(root);
          root = root.left;
        }
        root = stack.pop();
        result.add(root.val);
        root = root.right;
      }

      return result;
  }
}
