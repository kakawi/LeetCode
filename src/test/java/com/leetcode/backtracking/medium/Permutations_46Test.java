package com.leetcode.backtracking.medium;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

import java.util.List;
import org.junit.jupiter.api.Test;

class Permutations_46Test {

  private final Permutations_46 solution = new Permutations_46_Optimized();

  @Test
  void permute_example1() {
    // given
    final int[] nums = {1, 2, 3};

    // expected
    final List<List<Integer>> expected = List.of(
        List.of(1, 2, 3),
        List.of(1, 3, 2),
        List.of(2, 1, 3),
        List.of(2, 3, 1),
        List.of(3, 1, 2),
        List.of(3, 2, 1)
    );

    // when
    final List<List<Integer>> result = solution.permute(nums);

    // then
    assertThat(result, containsInAnyOrder(expected.toArray(new List[0])));
  }

  @Test
  void permute_example2() {
    // given
    final int[] nums = {0, 1};

    // expected
    final List<List<Integer>> expected = List.of(
        List.of(0, 1),
        List.of(1, 0)
    );

    // when
    final List<List<Integer>> result = solution.permute(nums);

    // then
    assertThat(result, containsInAnyOrder(expected.toArray(new List[0])));
  }

  @Test
  void permute_example3() {
    // given
    final int[] nums = {1};

    // expected
    final List<List<Integer>> expected = List.of(List.of(1));

    // when
    final List<List<Integer>> result = solution.permute(nums);

    // then
    assertThat(result, containsInAnyOrder(expected.toArray(new List[0])));
  }
}
