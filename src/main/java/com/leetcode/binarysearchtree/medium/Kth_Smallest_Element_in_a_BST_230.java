package com.leetcode.binarysearchtree.medium;

import com.leetcode.binarysearchtree.TreeNode;
import java.util.Stack;

public class Kth_Smallest_Element_in_a_BST_230 {

  public static void main(String[] args) {
    final Kth_Smallest_Element_in_a_BST_230 solution = new Kth_Smallest_Element_in_a_BST_230();
    final TreeNode node_1 = new TreeNode(1);
    final TreeNode node_2 = new TreeNode(2, node_1, null);
    final TreeNode node_4 = new TreeNode(4);
    final TreeNode node_3 = new TreeNode(3, node_2, node_4);
    final TreeNode node_6 = new TreeNode(6);
    final TreeNode root = new TreeNode(5, node_3, node_6);
    final int i = solution.kthSmallest_morris(root, 3);
  }

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
