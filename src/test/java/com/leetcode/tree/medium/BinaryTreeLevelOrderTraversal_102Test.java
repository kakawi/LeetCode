package com.leetcode.tree.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

import com.common.TreeNode;

class BinaryTreeLevelOrderTraversal_102Test {

  private final BinaryTreeLevelOrderTraversal_102 solution = new BinaryTreeLevelOrderTraversal_102_Recursion();

  @Test
  void levelOrder_example1() {
    // given
    final TreeNode root = new TreeNode(3,
        new TreeNode(9),
        new TreeNode(20, new TreeNode(15), new TreeNode(7))
    );

    // expected
    final List<List<Integer>> expected = List.of(List.of(3), List.of(9, 20), List.of(15, 7));

    // when
    final List<List<Integer>> result = solution.levelOrder(root);

    // then
    assertEquals(expected, result);
  }

  @Test
  void levelOrder_example2() {
    // given
    final TreeNode root = new TreeNode(1);

    // expected
    final List<List<Integer>> expected = List.of(List.of(1));

    // when
    final List<List<Integer>> result = solution.levelOrder(root);

    // then
    assertEquals(expected, result);
  }

  @Test
  void levelOrder_example3_null() {
    // given
    final TreeNode root = null;

    // expected
    final List<List<Integer>> expected = List.of();

    // when
    final List<List<Integer>> result = solution.levelOrder(root);

    // then
    assertEquals(expected, result);
  }
}
