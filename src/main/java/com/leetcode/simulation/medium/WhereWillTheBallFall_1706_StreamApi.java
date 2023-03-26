package com.leetcode.simulation.medium;

import java.util.Arrays;
import java.util.stream.IntStream;

public class WhereWillTheBallFall_1706_StreamApi implements WhereWillTheBallFall_1706 {

  @Override
  public int[] findBall(int[][] grid) {
    return IntStream.range(0, grid[0].length)
        .map(i ->
            Arrays.stream(grid)
                .reduce(i,
                    (j, row) -> j >= 0 && j + row[j] >= 0 && j + row[j] < row.length && row[j] == row[j += row[j]]
                        ? j : -1, (a, b) -> 0)
        )
        .toArray();
  }
}
