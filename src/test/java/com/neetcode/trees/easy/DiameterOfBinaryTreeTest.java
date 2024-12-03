package com.neetcode.trees.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.common.TreeNode;

public class DiameterOfBinaryTreeTest {
  private final DiameterOfBinaryTree solution = new DiameterOfBinaryTree_Impl();

  @Test
  void example1() {
    // given
    TreeNode input = new TreeNode(1,
        null,
        new TreeNode(2,
            new TreeNode(3,
                new TreeNode(5), null),
            new TreeNode(4)));

    // expected
    int expected = 3;

    // when
    int result = solution.diameterOfBinaryTree(input);

    // then
    assertEquals(expected, result);
  }

  @Test
  void example2() {
    // given
    TreeNode input = new TreeNode(
        1,
        new TreeNode(2),
        new TreeNode(3));

    // expected
    int expected = 2;

    // when
    int result = solution.diameterOfBinaryTree(input);

    // then
    assertEquals(expected, result);
  }
}
