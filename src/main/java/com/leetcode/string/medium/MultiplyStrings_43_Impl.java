package com.leetcode.string.medium;

public class MultiplyStrings_43_Impl implements MultiplyStrings_43 {

  @Override
  public String multiply(final String num1, final String num2) {
    if (num1.equals("0") || num2.equals("0")) {
      return "0";
    }

    final int n = num1.length();
    final int m = num2.length();
    final int[] result = new int[n + m];

    for (int i = n - 1; i >= 0; i--) {
      for (int j = m - 1; j >= 0; j--) {
        int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
        product += result[i + j + 1];

        result[i + j + 1] = product % 10;
        result[i + j] += product / 10;
      }
    }

    final StringBuilder sb = new StringBuilder();
    for (final int r : result) {
      if (r != 0 || sb.length() != 0) sb.append(r);
    }

    return sb.toString();
  }
}
