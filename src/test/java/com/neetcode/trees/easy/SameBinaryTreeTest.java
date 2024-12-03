package com.neetcode.trees.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.common.TreeNode;

public class SameBinaryTreeTest {
  private final SameBinaryTree solution = new SameBinaryTree_Impl();

  @Test
  void example1() {
    // given
    TreeNode tree1 = new TreeNode(1,
        new TreeNode(2), new TreeNode(3));
    TreeNode tree2 = new TreeNode(1,
        new TreeNode(2), new TreeNode(3));

    // when
    var result = solution.isSameTree(tree1, tree2);

    // then
    assertTrue(result);
  }

  @Test
  void example2() {
    // given
    TreeNode tree1 = new TreeNode(4,
        new TreeNode(7), null);
    TreeNode tree2 = new TreeNode(4,
        null, new TreeNode(7));

    // when
    var result = solution.isSameTree(tree1, tree2);

    // then
    assertFalse(result);
  }

  @Test
  void example3() {
    // given
    TreeNode tree1 = new TreeNode(1,
        new TreeNode(2), new TreeNode(3));
    TreeNode tree2 = new TreeNode(1,
        new TreeNode(3), new TreeNode(2));

    // when
    var result = solution.isSameTree(tree1, tree2);

    // then
    assertFalse(result);
  }
}
