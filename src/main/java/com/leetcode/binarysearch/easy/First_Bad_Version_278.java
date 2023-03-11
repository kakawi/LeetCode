package com.leetcode.binarysearch.easy;

public class First_Bad_Version_278 {

  public static void main(String[] args) {
    final First_Bad_Version_278 solution = new First_Bad_Version_278();
    solution.firstBadVersion(5);
  }

  public int firstBadVersion(int n) {
    int leftBorder = 0;
    int rightBorder = n;

    while (leftBorder < rightBorder) {
      int mid = leftBorder + (rightBorder - leftBorder) / 2;
      if (isBadVersion(mid)) {
        rightBorder = mid;
      } else {
        leftBorder = mid + 1;
      }
    }
    return leftBorder;
  }

  protected boolean isBadVersion(int version) {
    switch (version) {
      case 5:
      case 4:
        return true;
      default:
        return false;
    }
  }
}
