package com.leetcode.tree.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.tree.Node;
import java.util.List;
import org.junit.jupiter.api.Test;

class NaryTreePreorderTraversal_589Test {

  private final NaryTreePreorderTraversal_589 solution = new NaryTreePreorderTraversal_589_Stack();

  @Test
  void preorder_example1() {
    // given
    Node root = new Node(1, List.of(
        new Node(3, List.of(new Node(5), new Node(6))),
        new Node(2),
        new Node(4)
    ));

    // expected
    final List<Integer> expected = List.of(1, 3, 5, 6, 2, 4);

    // when
    final List<Integer> result = solution.preorder(root);

    // then
    assertEquals(expected, result);
  }

  @Test
  void preorder_example2() {
    // given
    Node root = new Node(1, List.of(
        new Node(2),
        new Node(3, List.of(
            new Node(6),
            new Node(7, List.of(new Node(11, List.of(new Node(14)))))
        )),
        new Node(4, List.of(new Node(8, List.of(new Node(12))))),
        new Node(5, List.of(new Node(9, List.of(new Node(13))), new Node(10)))
    ));

    // expected
    final List<Integer> expected = List.of(1, 2, 3, 6, 7, 11, 14, 4, 8, 12, 5, 9, 13, 10);

    // when
    final List<Integer> result = solution.preorder(root);

    // then
    assertEquals(expected, result);
  }

  @Test
  void preorder_example3_null() {
    // given
    final Node root = null;

    // expected
    final List<Integer> expected = List.of();

    // when
    final List<Integer> result = solution.preorder(root);

    // then
    assertEquals(expected, result);
  }
}
