package com.leetcode.binarysearchtree.easy;

import com.leetcode.binarysearchtree.TreeNode;

public class ConvertSortedArrayToBinarySearchTree_108_Impl implements
    ConvertSortedArrayToBinarySearchTree_108 {

  @Override
  public TreeNode sortedArrayToBST(final int[] nums) {
    return createBST(nums, 0, nums.length - 1);
  }

  private TreeNode createBST(final int[] nums, final int left, final int right) {
    if (left > right) {
      return null;
    }

    int mid = left + (right - left) / 2;
    final TreeNode node = new TreeNode(nums[mid]);

    node.left = createBST(nums, left, mid - 1);
    node.right = createBST(nums, mid + 1, right);

    return node;
  }
}
