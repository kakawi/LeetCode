package com.hlebon.hired;

import java.util.Arrays;

/**
 * Topic: sliding window
 */
public class ProgrammingSkills {

    public static final int NEVER_MET = -1;

    public long doesNotWorkIdoNotWhy(String s) {
        // Type your solution here
        int left = NEVER_MET;
        int maxLength = 0;
        int[] metLetter = new int[256];
        Arrays.fill(metLetter, NEVER_MET);

        for (int i = 0; i < s.toCharArray().length; i++) {
            char c = s.charAt(i);

            // FIXME There is a mistake here
            if (metLetter[c] > left) {
                left = metLetter[c] + 1;
            } else {
                int currentLength = left == NEVER_MET ? i + 1 : i - left + 1;
                maxLength = Math.max(maxLength, currentLength);
            }
            metLetter[c] = i;
        }

        return maxLength;
    }
    public long theLongestSubstring(String s) {
        // Type your solution here
        int left = NEVER_MET;
        int maxLength = 0;
        int[] metLetter = new int[256];
        Arrays.fill(metLetter, NEVER_MET);

        for (int i = 0; i < s.toCharArray().length; i++) {
            char c = s.charAt(i);

            if (metLetter[c] == NEVER_MET || metLetter[c] < left) {
                int currentLength = left == NEVER_MET ? i + 1 : i - left + 1;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                left = metLetter[c] + 1;
            }
            metLetter[c] = i;
        }

        return maxLength;
    }
}
