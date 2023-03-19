package com.leetcode.binarysearch.easy;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.MockSettings;
import org.mockito.Mockito;

class FirstBadVersion_278Test {

  private final FirstBadVersion_278 solution = mock(FirstBadVersion_278_Impl.class, Mockito.CALLS_REAL_METHODS);

  @Test
  void firstBadVersion_example1() {
    // given
    final int n = 5;
    final int badVersion = 4;
    for (int i = 0; i < n; i++) {
      when(solution.isBadVersion(i)).thenReturn(i >= badVersion);
    }

    // when
    final int result = solution.firstBadVersion(n);

    // then
    assertEquals(badVersion, result);
  }

  @Test
  void firstBadVersion_example2() {
    // given
    final int n = 1;
    final int badVersion = 1;
    for (int i = 0; i < n; i++) {
      when(solution.isBadVersion(i)).thenReturn(i >= badVersion);
    }

    // when
    final int result = solution.firstBadVersion(n);

    // then
    assertEquals(badVersion, result);
  }
}
