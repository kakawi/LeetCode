package com.leetcode.stack.medium;

import java.util.Arrays;

/**
  ++ offer into stack
  -- offer into stack
  -+ offer into stack
  +- compare

  array with index as stack(top as top of stack, inclusive):
  top = -1     : empty
  top >= 0     : not empty
  array[++top] : offer new guy onto top of stack
  top--        : pop
  array[top]   : peek
*/
public class AsteroidCollision_735_Array implements AsteroidCollision_735 {

  @Override
  public int[] asteroidCollision(int[] asteroids) {
    int top = -1;
    for (int asteroid : asteroids) {
      boolean stillAlive = true; // new asteroid is still alive
      while (stillAlive && isLeft(asteroid) && top >= 0 && isRight(asteroids[top])) {
        stillAlive = asteroids[top] + asteroid < 0;
        if (asteroids[top] + asteroid <= 0) {
          top--; // die smaller or die both
        }
      }
      if (stillAlive) {
        asteroids[++top] = asteroid; // if new asteroid is still alive, put it on top of stack
      }
    }

    return Arrays.copyOf(asteroids, top + 1); // return what's in the stack as array
  }

  private static boolean isRight(final int asteroid) {
    return !isLeft(asteroid);
  }

  private static boolean isLeft(final int asteroid) {
    return asteroid < 0;
  }
}
