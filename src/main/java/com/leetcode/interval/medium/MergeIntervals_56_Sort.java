package com.leetcode.interval.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals_56_Sort implements MergeIntervals_56 {

  private final Comparator<int[]> comparator = Comparator.comparingInt(a -> a[0]);

  @Override
  public int[][] merge(final int[][] intervals) {
    final List<int[]> result = new ArrayList<>();
    // 1. Sort
    Arrays.sort(intervals, comparator);

    // 2. Instead of adding an interval when we're sure
    // we add it right away and update it later if needed
    // it allow us not to add the last interval after the loop
    result.add(intervals[0]);
    int prevInterval = 0;
    for (int i = 1; i < intervals.length; i++) {
      final int prevEnd = result.get(prevInterval)[1];
      final int currentStart = intervals[i][0];
      final int currentEnd = intervals[i][1];
      if (prevEnd >= currentStart) {
        result.get(prevInterval)[1] = Math.max(prevEnd, currentEnd);
        continue;
      }
      result.add(intervals[i]);
      prevInterval++;
    }

    return result.toArray(new int[][]{});
  }
}
