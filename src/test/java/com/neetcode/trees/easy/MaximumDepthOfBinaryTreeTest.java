package com.neetcode.trees.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.common.TreeNode;

public class MaximumDepthOfBinaryTreeTest {
  private final MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree_Impl();

  @Test
  void example1() {
    // given
    TreeNode input = new TreeNode(
        1,
        new TreeNode(2),
        new TreeNode(3, new TreeNode(4),
            null));

    // expected
    int expected = 3;

    // when
    int result = solution.maxDepth(input);

    // then
    assertEquals(expected, result);
  }
}
