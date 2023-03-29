package com.leetcode.greedy.medium;

public class TaskScheduler_621_Impl implements TaskScheduler_621 {

  @Override
  public int leastInterval(final char[] tasks, final int n) {
    int[] counter = new int[26];
    int max = 0;
    int maxCount = 0;
    for (char task : tasks) {
      counter[task - 'A']++;
      if (max == counter[task - 'A']) {
        maxCount++;
      } else if (max < counter[task - 'A']) {
        max = counter[task - 'A'];
        maxCount = 1;
      }
    }

    int partCount = max - 1;
    int emptySlotsInOnePart = n - (maxCount - 1);
    int emptySlots = partCount * emptySlotsInOnePart; // we ignore negative

    int availableTasks = tasks.length - max * maxCount; // always positive

    int idles = Math.max(0, emptySlots - availableTasks);

    return tasks.length + idles;
  }
}
