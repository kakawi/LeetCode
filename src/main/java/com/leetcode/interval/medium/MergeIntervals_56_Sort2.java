package com.leetcode.interval.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals_56_Sort2 implements MergeIntervals_56 {

  private final Comparator<int[]> comparator = Comparator.comparingInt(a -> a[0]);

  @Override
  public int[][] merge(final int[][] intervals) {
    final List<int[]> result = new ArrayList<>();
    Arrays.sort(intervals, comparator);

    // Here we do opposite
    // we add interval the only when we're sure that we know the interval
    // that's why after the loop we need to add the last interval
    int prevStart = intervals[0][0];
    int prevEnd = intervals[0][1];

    for (int i = 1; i < intervals.length; i++) {
      final int[] interval = intervals[i];
      final int currentStart = interval[0];
      final int currentEnd = interval[1];
      if (currentStart > prevEnd) {
        result.add(new int[]{prevStart, prevEnd});
        prevStart = currentStart;
        prevEnd = currentEnd;
      } else {
        prevEnd = Math.max(prevEnd, currentEnd);
      }
    }
    result.add(new int[]{prevStart, prevEnd});

    return result.toArray(new int[][]{});
  }
}
