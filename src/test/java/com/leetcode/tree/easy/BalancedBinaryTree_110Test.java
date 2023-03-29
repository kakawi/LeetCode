package com.leetcode.tree.easy;

import static org.junit.jupiter.api.Assertions.*;

import com.leetcode.tree.TreeNode;
import org.junit.jupiter.api.Test;

class BalancedBinaryTree_110Test {

  private final BalancedBinaryTree_110 solution = new BalancedBinaryTree_110_Impl();

  @Test
  void isBalanced_example1() {
    // given
    final TreeNode root = new TreeNode(3,
        new TreeNode(9),
        new TreeNode(20, new TreeNode(15), new TreeNode(7))
    );

    // when
    final boolean result = solution.isBalanced(root);

    // then
    assertTrue(result);
  }

  @Test
  void isBalanced_example2() {
    // given
    final TreeNode root = new TreeNode(1,
        new TreeNode(2,
            new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)),
        new TreeNode(2)
    );

    // when
    final boolean result = solution.isBalanced(root);

    // then
    assertFalse(result);
  }

  @Test
  void isBalanced_example3() {
    // given
    // [1, 2,2, 3,null, null,3, 4,null, null,4]
    final TreeNode root = new TreeNode(1,
        new TreeNode(2, new TreeNode(3, new TreeNode(4), null), null),
        new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4)))
    );

    // when
    final boolean result = solution.isBalanced(root);

    // then
    assertFalse(result);
  }

  @Test
  void isBalanced_null() {
    // when
    final boolean result = solution.isBalanced(null);

    // then
    assertTrue(result);
  }
}
