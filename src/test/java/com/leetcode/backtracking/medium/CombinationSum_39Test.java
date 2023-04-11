package com.leetcode.backtracking.medium;


import java.util.List;
import org.junit.jupiter.api.Test;

class CombinationSum_39Test {

  private final CombinationSum_39 solution = new CombinationSum_39_Impl();

  @Test
  void combinationSum_example1() {
    // given
    final int[] candidates = {2, 3, 6, 7};
    final int target = 7;

    // expected
    final List<List<Integer>> expected = List.of(
        List.of(2, 2, 3),
        List.of(7)
    );

    // when
    final List<List<Integer>> result = solution.combinationSum(candidates, target);

    // then
    ListOfListOfElementsMatcher.checkResult(expected, result);
  }

  @Test
  void combinationSum_example2() {
    // given
    final int[] candidates = {2, 3, 5};
    final int target = 8;

    // expected
    final List<List<Integer>> expected = List.of(
        List.of(2, 2, 2, 2),
        List.of(2, 3, 3),
        List.of(3, 5)
    );

    // when
    final List<List<Integer>> result = solution.combinationSum(candidates, target);

    // then
    ListOfListOfElementsMatcher.checkResult(expected, result);
  }

  @Test
  void combinationSum_example3() {
    // given
    final int[] candidates = {2};
    final int target = 1;

    // expected
    final List<List<Integer>> expected = List.of();

    // when
    final List<List<Integer>> result = solution.combinationSum(candidates, target);

    // then
    ListOfListOfElementsMatcher.checkResult(expected, result);
  }
}
