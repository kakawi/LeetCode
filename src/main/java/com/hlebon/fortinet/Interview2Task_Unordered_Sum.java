package com.hlebon.fortinet;

public class Interview2Task_Unordered_Sum implements Interview2Task_Unordered {

  @Override
  public int findDuplicate(int[] input) {
    final int n = input.length - 1;
    int sum = getSumFrom1ToN(n);

    for (int number : input) {
      sum -= number;
    }
    return Math.abs(sum);
  }

  private int getSumFrom1ToN(final int n) {
    if (n % 2 == 0) {
      return (n + 1) * (n / 2);
    }
    return (n + 1) * (n / 2) + (n + 1) / 2;
  }
}
