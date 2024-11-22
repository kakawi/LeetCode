package com.neetcode.arraysandhashing.medium;

public class ProductsOfArrayExceptSelf_Impl implements ProductsOfArrayExceptSelf {
  public int[] productExceptSelf(int[] nums) {
    int[] result = new int[nums.length];

    int[] preffix = new int[nums.length];
    int[] suffix = new int[nums.length];
    suffix[suffix.length - 1] = 1;
    preffix[0] = 1;

    for (int i = 1; i < nums.length; i++) {
      preffix[i] = preffix[i - 1] * nums[i - 1];
    }

    for (int i = nums.length - 2; i >= 0; i--) {
      suffix[i] = suffix[i + 1] * nums[i + 1];
    }

    for (int i = 0; i < result.length; i++) {
      result[i] = suffix[i] * preffix[i];
    }

    return result;
  }
}
