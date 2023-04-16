package com.leetcode.interval.medium;

public class InsertInterval_57_Impl implements InsertInterval_57 {

  @Override
  public int[][] insert(final int[][] intervals, final int[] newInterval) {
    final int currentLength = intervals.length;

    int newIntervalStart = newInterval[0];
    int newIntervalEnd = newInterval[1];

    // find Start index for the `newInterval`
    int newIntervalStartIndex = 0;
    while (newIntervalStartIndex < currentLength && newIntervalStart > intervals[newIntervalStartIndex][1]) {
      newIntervalStartIndex++;
    }

    // find End index for the `newInterval` and simultaneously update Merge start and end of the interval
    int newIntervalEndIndex = newIntervalStartIndex;
    while (newIntervalEndIndex < currentLength && newIntervalEnd >= intervals[newIntervalEndIndex][0]) {
      newIntervalStart = Math.min(newIntervalStart, intervals[newIntervalStartIndex][0]);
      newIntervalEnd = Math.max(newIntervalEnd, intervals[newIntervalEndIndex][1]);
      newIntervalEndIndex++;
    }

    // Create a new array with new length
    int[][] result = new int[currentLength - (newIntervalEndIndex - newIntervalStartIndex) + 1][];

    // Fill the new array
    System.arraycopy(intervals, 0, result, 0, newIntervalStartIndex);
    result[newIntervalStartIndex] = new int[]{newIntervalStart, newIntervalEnd};
    System.arraycopy(intervals, newIntervalEndIndex, result, newIntervalStartIndex + 1, currentLength - newIntervalEndIndex);

    return result;
  }
}
