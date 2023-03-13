package com.leetcode.hashmap.medium;

public class BullsAndCows_299_Impl implements BullsAndCows_299 {

  @Override
  /**
   * The `number` array is being used as a marker for secret and guess digits.
   * Secret always increase the array
   * Guess always decrease the array
   * So
   * if `numbers[s] < 0` it means that we already met this digit in Guess
   * if `numbers[g] > 0` it means that this digit already was in the Secret
   */
  public String getHint(final String secret, final String guess) {
    int bulls = 0;
    int cows = 0;
    int[] numbers = new int[10];
    for (int i = 0; i < secret.length(); i++) {
      int s = Character.getNumericValue(secret.charAt(i));
      int g = Character.getNumericValue(guess.charAt(i));
      if (s == g) {
        bulls++;
      } else {
        if (numbers[s] < 0) {
          cows++;
        }
        if (numbers[g] > 0) {
          cows++;
        }
        numbers[s]++;
        numbers[g]--;
      }
    }
    return bulls + "A" + cows + "B";
  }
}
