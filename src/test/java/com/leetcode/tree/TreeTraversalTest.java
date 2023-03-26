package com.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class TreeTraversalTest {

  private final TreeTraversal solution = new StackTraversal();

  @Test
  void inOrder() {
    // given
    final TreeNode root = new TreeNode(1,
        new TreeNode(2, new TreeNode(4), new TreeNode(5, null, new TreeNode(6))),
        new TreeNode(3)
    );

    // expected
    final List<Integer> expected = List.of(4, 2, 5, 6, 1, 3);

    // when
    final List<Integer> result = solution.inOrder(root);

    // then
    assertEquals(expected, result);
  }

  @Test
  void preOrder() {
    // given
    final TreeNode root = new TreeNode(1,
        new TreeNode(2, new TreeNode(4), new TreeNode(5, null, new TreeNode(6))),
        new TreeNode(3)
    );

    // expected
    final List<Integer> expected = List.of(1, 2, 4, 5, 6, 3);

    // when
    final List<Integer> result = solution.preOrder(root);

    // then
    assertEquals(expected, result);
  }

  /**
   * Ref: https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
   */
  @Test
  void preOrder_2() {
    // given
    final TreeNode root = new TreeNode(25,
        new TreeNode(15,
            new TreeNode(10, new TreeNode(4), new TreeNode(12)),
            new TreeNode(22, new TreeNode(18), new TreeNode(24))
        ),
        new TreeNode(50,
            new TreeNode(35, new TreeNode(31), new TreeNode(44)),
            new TreeNode(70, new TreeNode(66), new TreeNode(90))
        )
    );

    // expected
    final List<Integer> expected = List.of(25, 15, 10, 4, 12, 22, 18, 24, 50, 35, 31, 44, 70, 66, 90);

    // when
    final List<Integer> result = solution.preOrder(root);

    // then
    assertEquals(expected, result);
  }

  @Test
  void postOrder() {
    // given
    final TreeNode root = new TreeNode(1,
        new TreeNode(2, new TreeNode(4), new TreeNode(5, null, new TreeNode(6))),
        new TreeNode(3)
    );

    // expected
    final List<Integer> expected = List.of(4, 6, 5, 2, 3, 1);

    // when
    final List<Integer> result = solution.postOrder(root);

    // then
    assertEquals(expected, result);
  }
}
