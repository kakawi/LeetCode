package com.leetcode.dynamicprogramming.medium;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Raise the BAAAAR
 */
public class PartitionEqualSubsetSum_416_5_Bit implements PartitionEqualSubsetSum_416 {

  @Override
  public boolean canPartition(final int[] nums) {
    final int totalSum = Arrays.stream(nums).reduce(0, Integer::sum);
    if (totalSum % 2 != 0) {
      return false;
    }

    final int target = totalSum / 2;

    /* to start with, I want the number with 1 as its first element so I can mimic the previous[0]=1 state,
       and length of bits= the length of bits of my desired sum (sumA/2)*/
    BigInteger row = new BigInteger("1").shiftLeft(target);
    for (final int weight : nums) {
      row = row.or(row.shiftRight(weight));
    }
    // check the column corresponding to my target by bitwise ANDing it with just 1
    // so if the first bit is 1, it will return true, otherwise false
    return row.and(new BigInteger("1")).intValue() == 1;
  }
}
