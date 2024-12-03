package com.neetcode.trees.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.common.TreeNode;

public class BalancedBinaryTreeTest {
  private final BalancedBinaryTree solution = new BalancedBinaryTree_Impl();

  @Test
  void example1() {
    // given
    TreeNode input = new TreeNode(
        1,
        new TreeNode(2),
        new TreeNode(3, new TreeNode(4), null));

    // when
    var result = solution.isBalanced(input);

    // then
    assertTrue(result);
  }

  @Test
  void example2() {
    // given
    TreeNode input = new TreeNode(
        1,
        new TreeNode(2),
        new TreeNode(3, new TreeNode(4, new TreeNode(5), null), null));

    // when
    var result = solution.isBalanced(input);

    // then
    assertFalse(result);
  }

  @Test
  void example3() {
    // when
    var result = solution.isBalanced(null);

    // then
    assertTrue(result);
  }

  @Test
  void example4() {
    // given
    TreeNode input = new TreeNode(
        1,
        new TreeNode(2,
            new TreeNode(3,
                new TreeNode(4), null),
            null),
        new TreeNode(2,
            null,
            new TreeNode(3,
                null,
                new TreeNode(4))));
    // when
    var result = solution.isBalanced(input);

    // then
    assertFalse(result);
  }
}
