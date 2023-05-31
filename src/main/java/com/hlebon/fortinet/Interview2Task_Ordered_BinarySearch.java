package com.hlebon.fortinet;

public class Interview2Task_Ordered_BinarySearch implements Interview2Task_Ordered {

  @Override
  public int findDuplicate(int[] input) {
    int left = 0;
    int right = input.length - 1;
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (input[mid] == mid + 1) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }
    return input[right];
  }
}
