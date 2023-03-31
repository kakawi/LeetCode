package com.leetcode.binarysearchtree.easy;

import static org.junit.jupiter.api.Assertions.*;

import com.leetcode.binarysearchtree.TreeNode;
import org.junit.jupiter.api.Test;

class ConvertSortedArrayToBinarySearchTree_108Test {

  private final ConvertSortedArrayToBinarySearchTree_108 solution = new ConvertSortedArrayToBinarySearchTree_108_Impl();

  @Test
  void sortedArrayToBST_example1() {
    // given
    final int[] nums = {-10, -3, 0, 5, 9};

    // expected
    final TreeNode expected = new TreeNode(0,
        new TreeNode(-3, new TreeNode(-10), null),
        new TreeNode(9, new TreeNode(5), null)
    );

    // when
    final TreeNode result = solution.sortedArrayToBST(nums);

    // then
    assertEquals(expected, result);
  }

  @Test
  void sortedArrayToBST_example2() {
    // given
    final int[] nums = {1, 3};

    // expected
    final TreeNode expected = new TreeNode(3, new TreeNode(1), null);

    // when
    final TreeNode result = solution.sortedArrayToBST(nums);

    // then
    assertEquals(expected, result);
  }
}
