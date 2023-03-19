package com.leetcode.binarysearchtree.medium;

import static org.junit.jupiter.api.Assertions.*;

import com.leetcode.binarysearchtree.TreeNode;
import org.junit.jupiter.api.Test;

class ValidateBinarySearchTree_98Test {

  private final ValidateBinarySearchTree_98 solution = new ValidateBinarySearchTree_98_Impl();

  @Test
  void isValidBST_example1() {
    // given
    final TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));

    // when
    final boolean result = solution.isValidBST(root);

    // then
    assertTrue(result);
  }

  @Test
  void isValidBST_example2() {
    // given
    final TreeNode root = new TreeNode(5,
        new TreeNode(1),
        new TreeNode(4, new TreeNode(3), new TreeNode(6))
    );

    // when
    final boolean result = solution.isValidBST(root);

    // then
    assertFalse(result);
  }

  @Test
  void isValidBST_example3() {
    // given
    final TreeNode root = new TreeNode(2,
        new TreeNode(2),
        new TreeNode(2)
    );

    // when
    final boolean result = solution.isValidBST(root);

    // then
    assertFalse(result);
  }

  @Test
  void isValidBST_example4() {
    // given
    final TreeNode root = new TreeNode(-2147483648);

    // when
    final boolean result = solution.isValidBST(root);

    // then
    assertTrue(result);
  }
}
