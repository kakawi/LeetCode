package com.leetcode.greedy.medium;

public class TaskScheduler_621_Impl implements TaskScheduler_621 {

  @Override
  public int leastInterval(final char[] tasks, final int n) {
    final int[] counter = new int[26];
    int biggestTask = 0;
    int numberOfTheBiggestTask = 0;
    // we find `biggestTask` and `numberOfTheBiggestTask` simultaneously
    for (char task : tasks) {
      counter[task - 'A']++;
      if (biggestTask == counter[task - 'A']) {
        numberOfTheBiggestTask++;
      } else if (biggestTask < counter[task - 'A']) {
        biggestTask = counter[task - 'A'];
        numberOfTheBiggestTask = 1;
      }
    }

    int countOfParts = biggestTask - 1;
    int emptySlotsInOnePart = n - (numberOfTheBiggestTask - 1); // fill `parts` with the biggest tasks. It can be negative
    int totalEmptySlots = countOfParts * emptySlotsInOnePart; // calculate total empty slots

    int remainTasks = tasks.length - biggestTask * numberOfTheBiggestTask; // we already put biggestTasks. Calculate how many tasks left

    int idles = Math.max(0, totalEmptySlots - remainTasks);

    return tasks.length + idles;
  }
}
