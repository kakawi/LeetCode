package com.hlebon.fortinet;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

/**
 * There is a stage with length 'n'.
 * There are 'm' lamps.
 * Every lamp can emit Red, Green or Blue light. (lights[0])
 * The lamp lights from 'light[1]' till 'light[2]'.
 *
 * If all 3 colors are in the same spot then this spot has White color.
 *
 * Return how many spots have white color.
 */
public class Task2 {

  public static int getWhiteLightLength(int n, int m, List<List<Integer>> lights) {
    final int[][] allLights = new int[3][n];
    for (List<Integer> light : lights) {
      int[] currentLights = allLights[light.get(0) - 1];
      Arrays.fill(currentLights, light.get(1) - 1, light.get(2), 1);
    }
    BigInteger red = convert(allLights[0]);
    BigInteger green = convert(allLights[1]);
    BigInteger blue = convert(allLights[2]);
    return red.and(green).and(blue).bitCount();
  }

  private static BigInteger convert(int[] allLight) {
    BigInteger light = new BigInteger("0");
    int stage = allLight.length;
    for (int index = 0; index < stage; index++) {
      if (allLight[index] == 1) {
        light = light.setBit(stage - index - 1);
      }
    }
    return light;
  }
}
