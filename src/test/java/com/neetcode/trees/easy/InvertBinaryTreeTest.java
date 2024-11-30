package com.neetcode.trees.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import com.common.TreeNode;

public class InvertBinaryTreeTest {
  private final InvertBinaryTree solution = new InvertBinaryTree_Impl();

  @Test
  void example1() {
    // given
    TreeNode input = new TreeNode(
        1,
        new TreeNode(2,
            new TreeNode(4), new TreeNode(5)),
        new TreeNode(3,
            new TreeNode(6), new TreeNode(7)));

    // expected
    TreeNode expected = new TreeNode(
        1,
        new TreeNode(3,
            new TreeNode(7), new TreeNode(6)),
        new TreeNode(2,
            new TreeNode(5), new TreeNode(4)));

    // when
    TreeNode result = solution.invertTree(input);

    // then
    assertEquals(expected, result);
  }

  @Test
  void example2() {
    // given
    TreeNode input = new TreeNode(
        3,
        new TreeNode(2),
        new TreeNode(1));

    // expected
    TreeNode expected = new TreeNode(
        3,
        new TreeNode(1),
        new TreeNode(2));

    // when
    TreeNode result = solution.invertTree(input);

    // then
    assertEquals(expected, result);
  }
}
