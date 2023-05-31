package com.hlebon.fortinet;

public class Interview2Task_Unordered_Array implements Interview2Task_Unordered {

  @Override
  public int findDuplicate(int[] input) {
    final boolean[] numbers = new boolean[input.length - 1];
    for (int number : input) {
      int arrayIndex = getIndex(number);
      if (numbers[arrayIndex]) return number;
      numbers[arrayIndex] = true;
    }
    throw new IllegalArgumentException("Something went wrong");
  }

  private int getIndex(final int number) {
    return number - 1;
  }
}
