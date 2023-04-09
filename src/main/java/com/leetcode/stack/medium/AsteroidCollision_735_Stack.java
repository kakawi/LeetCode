package com.leetcode.stack.medium;

import java.util.Stack;

public class AsteroidCollision_735_Stack implements AsteroidCollision_735 {

  @Override
  public int[] asteroidCollision(final int[] asteroids) {
    final Stack<Integer> stack = new Stack<>();
    for (final int asteroid : asteroids) {
      if (isRight(asteroid)) {
        stack.push(asteroid);
      } else {
        collision(stack, asteroid);
      }
    }

    final int[] result = new int[stack.size()];
    for (int i = 0; i < stack.size(); i++) {
      result[i] = stack.get(i);
    }

    return result;
  }

  private void collision(final Stack<Integer> stack, final int leftAsteroid) {
    while (!stack.isEmpty()) {
      final Integer prev = stack.peek();
      // collision
      if (isRight(prev)) {
        final int sum = prev + leftAsteroid;
        if (sum > 0) {
          return;
        } else if (sum == 0) {
          stack.pop();
          return;
        } else {
          stack.pop();
          continue;
        }
      }
      break;
    }
    stack.push(leftAsteroid);
  }

  private boolean isRight(final int asteroid) {
    return asteroid > 0;
  }
}
