package com.neetcode.twopointers.medium;

import org.junit.jupiter.api.Test;

import com.utils.ListOfListOfElementsMatcher;

import java.util.*;

public class ThreeSumTest {
  private final ThreeSum solutionSum = new ThreeSum_Impl();

  @Test
  void example1() {
    // given
    int[] input = { -1, 0, 1, 2, -1, -4 };

    // expected
    List<List<Integer>> expected = List.of(
        List.of(-1, -1, 2),
        List.of(-1, 0, 1));

    // when
    var result = solutionSum.threeSum(input);

    // then
    ListOfListOfElementsMatcher.checkResult(expected, result);
  }

  @Test
  void example2() {
    // given
    int[] input = { 0, 1, 1 };

    // expected
    List<List<Integer>> expected = List.of();

    // when
    var result = solutionSum.threeSum(input);

    // then
    ListOfListOfElementsMatcher.checkResult(expected, result);
  }

  @Test
  void example3() {
    // given
    int[] input = { 0, 0, 0 };

    // expected
    List<List<Integer>> expected = List.of(
        List.of(0, 0, 0));

    // when
    var result = solutionSum.threeSum(input);

    // then
    ListOfListOfElementsMatcher.checkResult(expected, result);
  }

  /**
   * Inside triplet
   */
  @Test
  void example4() {
    // given
    int[] input = { 0, 0, 0, 0 };

    // expected
    List<List<Integer>> expected = List.of(
        List.of(0, 0, 0));

    // when
    var result = solutionSum.threeSum(input);

    // then
    ListOfListOfElementsMatcher.checkResult(expected, result);
  }

  /**
   * No duplicates #1
   */
  @Test
  void example5() {
    // given
    int[] input = { -1, 0, 1, 2, -1, -4 };

    // expected
    List<List<Integer>> expected = List.of(
        List.of(-1, -1, 2),
        List.of(-1, 0, 1));

    // when
    var result = solutionSum.threeSum(input);

    // then
    ListOfListOfElementsMatcher.checkResult(expected, result);
  }

  /**
   * No duplicates #2
   */
  @Test
  void example6() {
    // given
    int[] input = { -2, 0, 0, 2, 2 };

    // expected
    List<List<Integer>> expected = List.of(
        List.of(-2, 0, 2));

    // when
    var result = solutionSum.threeSum(input);

    // then
    ListOfListOfElementsMatcher.checkResult(expected, result);
  }
}
