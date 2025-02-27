package com.hlebon.samdesk.challenge;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * My assumptions:
 * 1. list1 and list2 always have the same amout of elements.
 * 2. Distance between the list will never be more than Integer.
 * 
 * Complexity
 * Time: O(n)
 * Space: O(n)
 */
public class Day1 {
    public int calculateDistance(int[] list1, int[] list2) {
        Comparator<Integer> comparator = Comparator.naturalOrder();
        Queue<Integer> queue1 = new PriorityQueue<>(comparator);
        Queue<Integer> queue2 = new PriorityQueue<>(comparator);

        int length = list1.length;
        for (int i = 0; i < length; i++) {
            queue1.add(list1[i]);
            queue2.add(list2[i]);
        }

        int result = 0;
        while (length-- > 0) {
            result += Math.abs(queue1.poll() - queue2.poll());
        }

        return result;
    }
}
