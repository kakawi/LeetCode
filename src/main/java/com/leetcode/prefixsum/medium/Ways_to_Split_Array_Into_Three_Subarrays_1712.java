package com.leetcode.prefixsum.medium;

public class Ways_to_Split_Array_Into_Three_Subarrays_1712 {

  public static void main(String[] args) {
    final Ways_to_Split_Array_Into_Three_Subarrays_1712 waysToSplitArrayIntoThreeSubarrays1712 = new Ways_to_Split_Array_Into_Three_Subarrays_1712();
//    waysToSplitArrayIntoThreeSubarrays1712.waysToSplit(new int[]{1, 2, 2, 2, 5, 0});
    waysToSplitArrayIntoThreeSubarrays1712.waysToSplit2(new int[]{1, 2, 2, 2, 5, 0});
  }

  public int waysToSplit(int[] nums) {
    for (int i = 1; i < nums.length; i++) {
      nums[i] += nums[i - 1];
    }
    int ways = 0;
    for (int i = 0, j = 0, k = 0; i < nums.length - 2 && 3 * nums[i] <= nums[nums.length - 1];
        i++) {
      j = Math.max(j, i + 1);
      while (j < nums.length - 1 && nums[j] - nums[i] < nums[i]) {
        j++;
      }
      k = Math.max(k, j);
      while (k < nums.length - 1 && nums[k] - nums[i] <= nums[nums.length - 1] - nums[k]) {
        k++;
      }
      ways = (ways + k - j) % 1000000007;
    }
    return ways;
  }

  public int waysToSplit2(int[] nums) {
    for (int i = 1; i < nums.length; i++) {
      nums[i] += nums[i - 1];
    }
    int res = 0;
    for (int i = 0; i < nums.length - 2; i++) {

      int left = findLeftBorder(nums, nums[i], i);
      int right = findRightBorder(nums, nums[left] - nums[i], left);
    }
    return res;
  }

  private int findLeftBorder(final int[] nums, final int leftSum, final int index) {
    int j = index + 1;
    while (nums[j] - leftSum < leftSum && j < nums.length - 2)
      j++;
    return j;
  }

  private int findRightBorder(final int[] nums, final int midSum, final int index) {
    int k = index + 1;
    while (nums[nums.length - 1] - nums[index] < midSum && k < nums.length - 1)
      k++;
    return k;
  }

}
