package com.hlebon.hired;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgrammingSkillsTest {

    private final ProgrammingSkills solution = new ProgrammingSkills();

    @Test
    void example1() {
        // given
        String input = "nndNfdfdf";

        // expected
        int expected = 4;

        // when
        long result = solution.theLongestSubstring(input);

        // then
        assertEquals(expected, result);
    }

    @Test
    void example2() {
        // given
        String input = "";

        // expected
        int expected = 0;

        // when
        long result = solution.theLongestSubstring(input);

        // then
        assertEquals(expected, result);
    }

    @Test
    void example3() {
        // given
        String input = "n";

        // expected
        int expected = 1;

        // when
        long result = solution.theLongestSubstring(input);

        // then
        assertEquals(expected, result);
    }

    @Test
    void example4() {
        // given
        String input = "nn";
        // expected
        int expected = 1;

        // when
        long result = solution.theLongestSubstring(input);

        // then
        assertEquals(expected, result);
    }

    @Test
    void example5() {
        // given
        String input = "nd";

        // expected
        int expected = 2;

        // when
        long result = solution.theLongestSubstring(input);

        // then
        assertEquals(expected, result);
    }

    @Test
    void example6() {
        // given
        String input = "nndNfdABCDEffABCDEFGHKL";

        // expected
        int expected = 11;

        // when
        long result = solution.theLongestSubstring(input);

        // then
        assertEquals(expected, result);
    }

    @Test
    void example7() {
        // given
        String input = "ndfndfa";

        // expected
        int expected = 4;

        // when
        long result = solution.theLongestSubstring(input);

        // then
        assertEquals(expected, result);
    }
}