package com.neetcode.trees.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.common.TreeNode;

public class SubtreeOfAnotherTreeTest {
  private final SubtreeOfAnotherTree solution = new SubtreeOfAnotherTree_Impl();

  @Test
  void example1() {
    // given
    TreeNode root = new TreeNode(
        1,
        new TreeNode(2,
            new TreeNode(4),
            new TreeNode(5)),
        new TreeNode(3));

    TreeNode subRoot = new TreeNode(
        2,
        new TreeNode(4),
        new TreeNode(5));

    // when
    var result = solution.isSubtree(root, subRoot);

    // then
    assertTrue(result);
  }

  @Test
  void example2() {
    // given
    TreeNode root = new TreeNode(
        1,
        new TreeNode(2,
            new TreeNode(4, new TreeNode(6), null),
            new TreeNode(5)),
        new TreeNode(3));

    TreeNode subRoot = new TreeNode(
        2,
        new TreeNode(4),
        new TreeNode(5));

    // when
    var result = solution.isSubtree(root, subRoot);

    // then
    assertFalse(result);
  }

  @Test
  void example3() {
    // given
    TreeNode root = new TreeNode(
        1,
        null,
        new TreeNode(
            1,
            null,
            new TreeNode(
                1,
                null,
                new TreeNode(
                    1,
                    new TreeNode(1),
                    new TreeNode(2)))));

    TreeNode subRoot = new TreeNode(
        1,
        null,
        new TreeNode(
            1,
            new TreeNode(1),
            new TreeNode(2)));

    // when
    var result = solution.isSubtree(root, subRoot);

    // then
    assertTrue(result);
  }
}
