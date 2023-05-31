package com.hlebon.fortinet;

import java.util.HashSet;
import java.util.Set;

public class Interview2Task_Unordered_Set implements Interview2Task_Unordered {

  @Override
  public int findDuplicate(int[] input) {
    final Set<Integer> numbers = new HashSet<>();

    for (int number : input) {
      if (numbers.contains(number)) return number;
      numbers.add(number);
    }
    throw new IllegalArgumentException("Something went wrong");
  }
}
