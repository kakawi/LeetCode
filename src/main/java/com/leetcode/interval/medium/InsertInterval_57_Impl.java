package com.leetcode.interval.medium;

public class InsertInterval_57_Impl implements InsertInterval_57 {

  @Override
  public int[][] insert(final int[][] intervals, final int[] newInterval) {
    final int n = intervals.length;
    int newIntervalStart = newInterval[0];
    int newIntervalEnd = newInterval[1];
    int indexOfStart = 0;
    while (indexOfStart < n && newIntervalStart > intervals[indexOfStart][1]) {
      indexOfStart++;
    }
    int indexOfEnd = indexOfStart;
    while (indexOfEnd < n && newIntervalEnd >= intervals[indexOfEnd][0]) {
      // merge intervals
      newIntervalStart = Math.min(newIntervalStart, intervals[indexOfEnd][0]);
      newIntervalEnd = Math.max(newIntervalEnd, intervals[indexOfEnd][1]);
      indexOfEnd++;
    }

    int[][] result = new int[n - (indexOfEnd - indexOfStart) + 1][];

    System.arraycopy(intervals, 0, result, 0, indexOfStart);
    result[indexOfStart] = new int[]{newIntervalStart, newIntervalEnd};
    System.arraycopy(intervals, indexOfEnd, result, indexOfStart + 1, n - indexOfEnd);

    return result;
  }
}
