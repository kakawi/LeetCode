package com.leetcode.interval.medium;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals_56_Ranges implements MergeIntervals_56 {

  @Override
  public int[][] merge(final int[][] intervals) {
    int minStart = intervals[0][0];
    int maxStart = intervals[0][0];
    for (final int[] interval : intervals) {
      minStart = Math.min(minStart, interval[0]);
      maxStart = Math.max(maxStart, interval[0]);
    }

    // index - rangeStart
    // value - rangeEnd
    // we're looking for the highest end in every rangeStart
    // P.S. some of them will stay empty (0 value)
    // some of lower ranges will have rangeEnd bigger than next rangeStart. We will merge them later
    final int[] ranges = new int[maxStart - minStart + 1];
    for (final int[] interval : intervals) {
      ranges[interval[0] - minStart] = Math.max(ranges[interval[0] - minStart],
          interval[1] - minStart);
    }

    // intervals merging
    int prevStart = 0;
    int prevEnd = 0;
    final List<int[]> result = new ArrayList<>();
    for (int currentStart = 0; currentStart < ranges.length; currentStart++) {
      final int currentEnd = ranges[currentStart];
      if (currentEnd == 0) {
        continue; // empty range
      }
      // we create a new interval the only when the previous is ended
      if (currentStart > prevEnd) {
        result.add(new int[]{prevStart + minStart, prevEnd + minStart});
        prevStart = currentStart;
        prevEnd = currentEnd;
      } else {
        // otherwise we just continue the previous interval
        prevEnd = Math.max(prevEnd, currentEnd);
      }
    }

    // The last interval
    result.add(new int[]{prevStart + minStart, prevEnd + minStart});

    return result.toArray(new int[][]{});
  }
}
