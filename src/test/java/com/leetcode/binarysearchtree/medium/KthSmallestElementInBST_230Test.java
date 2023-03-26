package com.leetcode.binarysearchtree.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.binarysearchtree.TreeNode;
import org.junit.jupiter.api.Test;

class KthSmallestElementInBST_230Test {

  private final KthSmallestElementInBST_230 solution = new KthSmallestElementInBST_230_Impl();

  @Test
  void kthSmallest_example1() {
    // given
    final TreeNode root = new TreeNode(3,
        new TreeNode(1, null, new TreeNode(2)),
        new TreeNode(4)
    );
    final int k = 1;

    // expected
    final int expected = 1;

    // when
    final int result = solution.kthSmallest(root, k);

    // then
    assertEquals(expected, result);
  }

  @Test
  void kthSmallest_example2() {
    // given
    final TreeNode root = new TreeNode(5,
        new TreeNode(3,
            new TreeNode(2, new TreeNode(1), null),
            new TreeNode(4)
        ),
        new TreeNode(6)
    );
    final int k = 3;

    // expected
    final int expected = 3;

    // when
    final int result = solution.kthSmallest(root, k);

    // then
    assertEquals(expected, result);
  }
}
