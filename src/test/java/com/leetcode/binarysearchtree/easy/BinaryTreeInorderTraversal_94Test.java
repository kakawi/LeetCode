package com.leetcode.binarysearchtree.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.binarysearchtree.TreeNode;
import java.util.List;
import org.junit.jupiter.api.Test;

class BinaryTreeInorderTraversal_94Test {

  private final BinaryTreeInorderTraversal_94 solution = new BinaryTreeInorderTraversal_94_Impl();

  @Test
  void inorderTraversal_example1() {
    // given
    final TreeNode root = new TreeNode(1,
        null,
        new TreeNode(2, new TreeNode(3), null)
    );

    // expected
    final List<Integer> expected = List.of(1, 3, 2);

    // when
    final List<Integer> result = solution.inorderTraversal(root);

    // then
    assertEquals(expected, result);
  }

  @Test
  void inorderTraversal_example2_null() {
    // given
    final TreeNode root = null;

    // expected
    final List<Integer> expected = List.of();

    // when
    final List<Integer> result = solution.inorderTraversal(root);

    // then
    assertEquals(expected, result);
  }

  @Test
  void inorderTraversal_example3() {
    // given
    final TreeNode root = new TreeNode(1);

    // expected
    final List<Integer> expected = List.of(1);

    // when
    final List<Integer> result = solution.inorderTraversal(root);

    // then
    assertEquals(expected, result);
  }
}
