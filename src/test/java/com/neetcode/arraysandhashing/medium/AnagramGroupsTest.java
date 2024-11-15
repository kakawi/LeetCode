package com.neetcode.arraysandhashing.medium;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class AnagramGroupsTest {
  private final AnagramGroups solution = new AnagramGroups_Impl();

  @Test
  void example1() {
    // given
    String[] strs = { "act", "pots", "tops", "cat", "stop", "hat" };

    // expected
    String[][] expected = { { "act", "cat" }, { "pots", "stop", "tops" }, { "hat" } };

    // when
    final var result = solution.groupAnagrams(strs);

    // then
    assertResult(expected, result);
  }

  @Test
  void example2() {
    // given
    String[] strs = { "x" };

    // expected
    String[][] expected = { { "x" } };

    // when
    final var result = solution.groupAnagrams(strs);

    // then
    assertResult(expected, result);
  }

  @Test
  void example3() {
    // given
    String[] strs = { "" };

    // expected
    String[][] expected = { { "" } };

    // when
    final var result = solution.groupAnagrams(strs);

    // then
    assertResult(expected, result);
  }

  private void assertResult(String[][] expected, List<List<String>> result) {
    for (String[] e : expected) {
      Arrays.sort(e);
    }
    for (int i = 0; i < result.size(); i++) {
      var sortedResult = result.get(i).toArray();
      Arrays.sort(sortedResult);
      for (int j = 0; j < expected.length; j++) {
        try {
          assertArrayEquals(sortedResult, expected[j]);
          break;
        } catch (AssertionError e) {
          if (j == expected.length - 1) {
            assertFalse(true, "Did not find expected array in result");
          }
          continue;
        }
      }
    }
  }
}
