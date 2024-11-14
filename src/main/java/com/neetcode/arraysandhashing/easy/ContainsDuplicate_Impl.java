package com.neetcode.arraysandhashing.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_Impl implements ContainsDuplicate {

  @Override
  public boolean hasDuplicate(int[] nums) {
    Set<Integer> seenNumbers = new HashSet<>();
    for (int number : nums) {
      if (seenNumbers.contains(number)) {
        return true;
      }
      seenNumbers.add(number);
    }
    return false;
  }
}
