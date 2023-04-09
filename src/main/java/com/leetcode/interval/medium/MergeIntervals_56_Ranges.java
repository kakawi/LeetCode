package com.leetcode.interval.medium;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals_56_Ranges implements MergeIntervals_56 {

  @Override
  public int[][] merge(final int[][] intervals) {
    int minStart = intervals[0][0];
    int maxStart = intervals[0][0];

    for (int i = 1; i < intervals.length; i++) {
      minStart = Math.min(minStart, intervals[i][0]);
      maxStart = Math.max(maxStart, intervals[i][0]);
    }

    // ranges - an array of all possible intervals based on `minStart` and `maxStart`
    // index - start of an interval
    // value - end of an interval
    // P.S. To save the space with subtract `minStart` to determine an index.
    final int[] ranges = new int[maxStart - minStart + 1];
    for (final int[] interval : intervals) {
      final int currentStart = interval[0];
      final int currentEnd = interval[1];
      final int rangeIndex = currentStart - minStart;
      ranges[rangeIndex] = Math.max(currentEnd - minStart, ranges[rangeIndex]);
    }
    // Thanks to the `ranges` we don't only sorted, but also squeezed by merging all intervals started with the same number

    // Now we need to iterate over the `ranges` and finally merge the intervals
    int start = 0, end = 0;
    final List<int[]> result = new ArrayList<>();
    for (int i = 0; i < ranges.length; i++) {
      // there is no any interval with `start == i`
      if (ranges[i] == 0) {
        continue;
      }
      if (i <= end) {
        // this interval should be merged, so we choose the max End
        end = Math.max(ranges[i], end);
      } else {
        result.add(new int[]{start + minStart, end + minStart});
        start = i;
        end = ranges[i];
      }
    }

    // adding the last interval
    result.add(new int[]{start + minStart, end + minStart});

    return result.toArray(new int[result.size()][]);
  }
}
