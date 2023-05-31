package com.hlebon.fortinet;

public class Interview2Task_Ordered_Loop implements Interview2Task_Ordered {

  @Override
  public int findDuplicate(int[] input) {
    for (int i = 1; i < input.length; i++) {
      if (input[i] == input[i - 1]) return input[i];
    }

    throw new IllegalArgumentException("Something went wrong");
  }
}
