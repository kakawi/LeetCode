package com.leetcode.interval.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals_56_Sort implements MergeIntervals_56 {

  @Override
  public int[][] merge(final int[][] intervals) {
    final List<int[]> result = new ArrayList<>();
    Arrays.sort(intervals, new CustomSort());

    result.add(intervals[0]);
    int j = 0;
    for (int i = 1; i < intervals.length; i++) {
      final int prevStart = result.get(j)[0];
      final int prevEnd = result.get(j)[1];
      final int currentStart = intervals[i][0];
      final int currentEnd = intervals[i][1];
      if (currentStart <= prevEnd && currentEnd >= prevStart) {
        result.get(j)[0] = Math.min(prevStart, currentStart);
        result.get(j)[1] = Math.max(prevEnd, currentEnd);
        continue;
      }
      result.add(intervals[i]);
      j++;
    }

    return result.toArray(new int[][]{});
  }

  private static class CustomSort implements Comparator<int[]> {
    public int compare(int[] array1, int[] array2) {
      if (array1[0] > array2[0]) {
        return 1;
      } else if (array1[0] == array2[0]) {
        return 0;
      } else {
        return -1;
      }
    }
  }
}
